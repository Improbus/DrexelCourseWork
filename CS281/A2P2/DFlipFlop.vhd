library IEEE;

use IEEE.std_logic_1164.all;

use IEEE.std_logic_arith.all;

--Behavioral Model for a Basic D Flip Flop

entity DFlipFlop is

	port (CLR, CLK, D : in BIT; Q, QN : out BIT);

end;

--Behavioral Model for a D Flip Flop

architecture behavioral of DFlipFlop is

--Signals required for processing

signal QInput : BIT;

--Process to properly outpul and wire the inputs to the Flip Flop 

begin 

QN <= not QInput; Q <= QInput;

process (CLR, CLK) begin

	if CLR = '1' then QInput <= '0' ;

	elsif CLK'EVENT and CLK = '1'

		then QInput <= D ;

	end if;

end process;

end;

