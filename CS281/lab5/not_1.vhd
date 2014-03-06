library IEEE;
use IEEE.std_logic_1164.all;

entity not is
	port (
		a: in STD_LOGIC;
		b: out STD_LOGIC;
		
	);
end not;

architecture behavioral of and_4 is
begin
  b <= (not a) after 2 ns;
end behavioral;
