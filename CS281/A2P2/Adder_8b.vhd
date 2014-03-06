library IEEE;

use IEEE.std_logic_1164.all;

use IEEE.std_logic_arith.all;

--Structural Representation of 8 1 bit Adders linked togerther to create an 8 bit adder

entity Adder_8b is 
	
	port (A, B: in BIT_VECTOR(7 downto 0); CarryIn: in BIT; CarryOut: out BIT; Sum: out BIT_VECTOR(7 downto 0));

end Adder_8b;

--Structural Components needed for the 8 Bit Adder

architecture structural of Adder_8b is

component Adder_1b

	port (X, Y, CarryIn: in BIT; CarryOut, Sum: out BIT);

end component;

--Signals required for processing

signal C: BIT_VECTOR(7 downto 0);

--Loop Structure Create_Adder wires together all 8 adders

begin

Create_Adders: for i in 7 downto 0 generate

	LB: if i = 0 generate

	ADD1: Adder_1b port map(A(0), B(0), CarryIn, C(0), Sum(0));

	end generate;

	Otherbits: if i /= 0 generate

	ADD1: Adder_1b port map

		(A(i), B(i), C(i-1), C(i), Sum(i));

	end generate;

end generate;

CarryOut <= C(7);

end;


