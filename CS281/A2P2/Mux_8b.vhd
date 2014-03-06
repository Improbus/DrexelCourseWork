library IEEE;

use IEEE.std_logic_1164.all;

use IEEE.std_logic_arith.all;

--Behavioral Design for an 8 input Mux

entity Mux_8b is 

	port (A, B : in BIT_VECTOR (7 downto 0); Sel : in BIT := '0'; Y : out BIT_VECTOR (7 downto 0));

end;

--Mux Behavior

architecture behavioral of Mux_8b is

begin

	Y <= A when Sel = '1' else B ;

end;	

