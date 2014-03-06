library IEEE;
use IEEE.std_logic_1164.all;

entity or_4 is
	port (
		a: in STD_LOGIC;
		b: in STD_LOGIC;
		c: in STD_LOGIC;
		d: in STD_LOGIC;
		e : out STD_LOGIC;
	);
end or_4;

architecture behavioral of or_4 is
begin
  e <= (a or b or c or d) after 2 ns;
end behavioral;
