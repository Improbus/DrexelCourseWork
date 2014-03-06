library IEEE;

use IEEE.std_logic_1164.all;

use IEEE.std_logic_arith.all;

--Structural design of an 8 Bit Register using the D Flip Flop

entity Reg_8b is 
	
	port (D : in BIT_VECTOR(7 downto 0); Clk, Clr : in BIT ; Q : out BIT_VECTOR(7 downto 0));

end;

architecture Structural of Reg_8b is

--Structural Components needed for the 8 Bit Register

	component DFlipFlop

		port(Clr, Clk, D : in BIT; Q, QN : out BIT);

	end component;

--Loop Designed to create an 8bit register with D FlipFLops

	begin

		Create_Reg: for i in 7 downto 0 generate

		FlipFlop: DFlipFlop port map(Clr, Clk, D(i), Q(i), open);

		end generate;

end;

