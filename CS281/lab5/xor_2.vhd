library IEEE;
use IEEE.std_logic_1164.all;

entity xor_2 is
	port (
		a: in STD_LOGIC;
		b: in STD_LOGIC;
		c: out STD_LOGIC
	);
end xor_2;

architecture behavioral of xor_2 is
begin
  c <= (a xor b) after 2 ns;
end behavioral;
