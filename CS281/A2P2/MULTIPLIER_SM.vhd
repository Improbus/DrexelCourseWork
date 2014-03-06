library IEEE;

use IEEE.std_logic_1164.all;

use IEEE.std_logic_arith.all;

--This is a Finite State Machine Design for the Multiplier.  It will act as the control unit.

entity MULTIPLIER_SM is

	port (Start, Clk, LSB, Stop, Reset: in BIT; Init, Shift, Add, Done : out BIT);

end;

--Behavioral rules for a multiplier

architecture behavioral of MULTIPLIER_SM is

--Definition of types to use for the behavioral model

type STATES is (I, C, A, S, E);

--Signals required for processing

signal State: STATES;

begin

Init <= '1' when State = I

	else '0' ;

Add <= '1' when State = A

	else '0' ;

Shift <= '1' when State = S

	else '0' ;

Done <= '1' when State = E

	else '0' ;
	
--Process to reset the control unit

process (CLK, Reset) begin

	if Reset = '1' then State <= E;

	elsif CLK'EVENT and CLK = '1' then

		case State is

		when I => State <= C;

		when C =>

			if LSB = '1' then State <= A;

			elsif Stop = '0' then State <= S;

			else State <= E;

			end if;

		when A => State <= S;

		when S => State <= C;

		when E =>

			if Start = '1' then State <= I; 

			end if;

		end case;

	end if;

end process;

end;
		

