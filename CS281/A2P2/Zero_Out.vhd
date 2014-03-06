library IEEE;

use IEEE.std_logic_1164.all;

use IEEE.std_logic_arith.all;

--Behavioral Model for Will Determine input width and add or remove zeros to make it 1 bit

entity Zero_Out is

	port (X : BIT_VECTOR; F : out BIT);

end;

architecture behavioral of Zero_Out is

--Process used to determine bit width and transform it to correct 1 bit output

begin 

process (X) 

	begin F <= '1';
	
	--Loop Structure to keep checking for variable width determined by the size of the Bit Vector

	for i in X'RANGE loop

		if X(i) = '1' then F <= '0'; 

		end if;

	end loop;

end process;

end;

