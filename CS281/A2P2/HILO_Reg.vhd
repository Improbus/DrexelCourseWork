library IEEE;

use IEEE.std_logic_1164.all;

use IEEE.std_logic_arith.all;

--HILO_Reg design for a register that is capable of shifting bits for proper multiplication

entity HILO_Reg is

	port (CLK, CLR, LD, SH, DIR: in BIT; D: in BIT_VECTOR; Q: out BIT_VECTOR);

end HILO_Reg;

--Behavioral Design for a HILO Register that is capable of bit shifting

architecture behavioral of HILO_Reg is

--Definition of many Sub variables and processes needer to properly Shift bits

	begin Shift: process (CLR, CLK)

	subtype In_Bit is NATURAL range D'LENGTH-1 downto 0;

	subtype Out_Bit is NATURAL range Q'LENGTH-1 downto 0;

	variable Temp : BIT_VECTOR(Out_Bit);

	begin

		if CLR = '1' then

			Temp := (others => '0'); Q <= Temp ;

		elsif CLK'EVENT and CLK='1' then

			if LD = '1' then

				Temp := (others => '0');

				Temp(In_Bit) := D;

				Q <= Temp ;

			elsif SH = '1' then

				case DIR is

				when '0' => Temp := '0' & Temp(Temp'LEFT downto 1);

				when '1' => Temp :=  Temp(Temp'LEFT-1 downto 1) & '0';

				end case;

				Q <= Temp ;

			end if;

		end if;

	end process;

end;


