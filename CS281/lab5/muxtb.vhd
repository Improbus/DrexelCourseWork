library IEEE;
use IEEE.std_logic_1164.all;

entity  muxb_tester is
end entity;

architecture behavioral of  muxb_tester is

component mux is
	port (
		x,y,z,j : in std_logic; 
		i : in std_logic_vector (1 downto 0);
		k : out std_logic);
		
end component;

signal i_in : std_logic_vector (1 downto 0) ; 
signal x_in, y_in, z_in, j_in, k_out  :  STD_LOGIC ;


begin

  TopLevelToBeTested : mux
    port map(
    x => x_in,
    y => y_in,
    z => z_in,
    j => j_in, 
    i => i_in,
    k => k_out
    );
    
      
   x_in <= '1' after 0 ns, '0' after 30 ns;
   y_in <= '0' after 0 ns, '0' after 30 ns;
   z_in <= '0' after 0 ns, '0' after 30 ns;
   j_in <= '0' after 0 ns, '0' after 30 ns;

    	
end behavioral;

