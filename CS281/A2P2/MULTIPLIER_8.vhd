library IEEE;

use IEEE.std_logic_1164.all;

use IEEE.std_logic_arith.all;

--Entity Definition of an 8bit multiplier

entity MULTIPLIER_8b is

	port( A, B : in BIT_VECTOR(3 downto 0); Start, CLK, Reset: in BIT; Result: out BIT_VECTOR(7 downto 0); Done : out BIT);

end MULTIPLIER_8b;

--Structural Level to string together all parts of the Multiplier

architecture structural of MULTIPLIER_8 is 

--Components needed for the multiplier

--8bit Adder

component Adder_8b 

	port (A, B : BIT_VECTOR(7 downto 0); CarryIn : BIT; CarryOut : out BIT; Sum:out BIT_VECTOR(7 downto 0));
	
end component;

--Zero Detector

component Zero_Out 

	port (X : BIT_VECTOR; F:out BIT );
	
end component;

--8bit Register

component Reg_8b 

	port (D:BIT_VECTOR(7 downto 0);	Clk,Clr:BIT; Q:out BIT_VECTOR(7 downto 0));
	
end component;

--8 Input Mux

component Mux_8b 

	port (A,B:BIT_VECTOR(7 downto 0); Sel:BIT;Y:out BIT_VECTOR(7 downto 0));
	
end component;

--HILO Register

component HILO_Reg 

	port (CLK,CLR,LD,SH,DIR:BIT; D:BIT_VECTOR; Q:out BIT_VECTOR);

end component;

--State Machine

component MULTIPLIER_SM 

	port (Start,CLK,LSB,Stop,Reset:BIT; Init,Shift,Add,Done:out BIT);

end component;

--Signals required for processing

signal F, OFL, REGClr: BIT;

signal Zero, Init, Shift, Add, Low: BIT := '0' ;

signal High: BIT := '1';

signal SRA1, SRB, ADDout, MUXout, REGout : BIT_VECTOR(7 downto 0);

--Structural Wiring for the Multiplier

begin

	RegClr <= Init or Reset;

	Result <= REGout;
	
	MULT_SM : MULTIPLIER_SM port map(Start , CLK , SRA1(0) , Zero , Reset , Init , Shift , Add , Done);
	
	Adder : Adder_8b port map(A=>SRB, B=>REGout, CarryIn=>Low, CarryOut=>OFL, Sum=>ADDout);
	
	Mux : Mux_8b port map(A=>ADDout , B=>REGout , Sel=>Add , Y=>MUXout);
	
	Reg : Reg_8b port map(D=>MUXout , Q=>REGout , Clk=>CLK , Clr=>REGclr);
	
	Zero1 : Zero_Out port map(X=>SRA1, F=>Zero);

	HI1 : HILO_Reg port map(CLK=>CLK, CLR=>Reset, LD=>Init, SH=>Shift, DIR=>Low, D=>A, Q=>SRA1);

	LOW1 : HILO_Reg port map(CLK=>CLK, CLR=>Reset, LD=>Init, SH=>Shift, DIR=>High, D=>B, Q=>SRB);

end;


