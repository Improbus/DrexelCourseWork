library IEEE;

use IEEE.std_logic_1164.all;

use IEEE.std_logic_arith.all;

--Behavioral Design for a 1 bit Adder

entity  Adder_1b is

	port (X, Y, CarryIn: in BIT; CarryOut, Sum : out BIT);

end Adder_1b;

architecture Behavioral of Adder_1b is

begin

Sum <= X xor Y xor CarryIn ;

CarryOut <= (X and Y) or (X and CarryIn) or (Y and CarryIn) ;

end;

