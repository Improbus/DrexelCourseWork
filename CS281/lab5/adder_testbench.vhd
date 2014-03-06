library IEEE;
use IEEE.std_logic_1164.all;

entity testbench is
	port (
		sum, carry: out std_ulogic
	);
end testbench;

architecture structural of testbench is

component full_adder
 port(a,b,c_in : in std_ulogic;
	 sum,c_out: out std_ulogic);
end component;

   signal myA, myB, myC, mySum, myC_out : std_ulogic;

begin
   TB: full_adder port map (a => myA, b => myB, c_in => myC, sum => mySum, c_out => myC_out);
   
   sum <= mySum;
   carry <= myC_out;
      
   myA <= '1' after 0 ns, '0' after 30 ns;
   myB <= '1' after 0 ns, '0' after 30 ns;
   myC <= '1' after 0 ns, '0' after 30 ns;
end structural;

