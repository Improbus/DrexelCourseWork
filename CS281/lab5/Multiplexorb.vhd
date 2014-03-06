library IEEE;
use IEEE.std_logic_1164.all;

entity mux is
	port (x,y,z,j : in std_logic; 
		i : in std_logic_vector (1 downto 0);
		k : out std_logic);
end mux;

architecture archi of mux is
	begin
	process (x, y, z, j, i)
		begin
      			if (i ="00") then k <=x;
      			elsif (i ="01") then k <=y;
      			elsif (i ="10") then k <=z;
      			else k <=j;
      			end if;
	end process;
end archi;
      
	 


