library IEEE;
use IEEE.std_logic_1164.all;

entity mux is
	port (x,y,z,j : in std_logic; 
		i : in std_logic_vector (1 downto 0);
		k : out std_logic);
end mux;

architecture archi of mux is
	
	component and_3 
	  port(a,b,c,d : in std_logic;
	       e   : out std_logic);
  	end component;
  	
  	component or_4
	  port(a,b,c,d : in std_logic;
	       e   : out std_logic);
	end component;
	
	component not_1
	port(a : in std_logic;
	       b   : out std_logic);
	end component;
	
	
	begin
	  -- <<enter your statements here>>
	  
	
	
	
end archi;
      
	 




