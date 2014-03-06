library IEEE;
use IEEE.std_logic_1164.all;

entity and_4 is
	port (
		a: in STD_LOGIC;
		b: in STD_LOGIC;
		c: in STD_LOGIC.
		d: in STD_LOGIC
		e: out STD_LOGIC
	);
end and_4;

architecture behavioral of and_4 is
begin
  e <= (a and b and c and d) after 2 ns;
end behavioral;
