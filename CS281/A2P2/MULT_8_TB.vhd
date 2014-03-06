library IEEE;

use IEEE.std_logic_1164.all;

entity TB_MULTIPLIER_8 is

end TB_MULTIPLIER_8;

architecture behavioral of TB_MULTIPLIER_8 is

   component MULTIPLIER_8

      port(A        : in BIT_VECTOR ( 3 downto 0 );

           B        : in BIT_VECTOR ( 3 downto 0 );

           START    : in BIT ;

           CLK      : in BIT ;

           RESET    : in BIT ;

           RESULT   : out BIT_VECTOR ( 7 downto 0 );

           DONE     : out BIT );

   end component;

   constant PERIOD : time := 10 ns;

   signal W_A        : BIT_VECTOR ( 3 downto 0 );

   signal W_B        : BIT_VECTOR ( 3 downto 0 );

   signal W_START    : BIT ;

   signal W_CLK      : BIT  := '0';

   signal W_RESET    : BIT ;

   signal W_RESULT   : BIT_VECTOR ( 7 downto 0 );

   signal W_DONE     : BIT ;

begin

   TopLevelToBeTested : MULTIPLIER_8

      port map(A        => W_A,

               B        => W_B,

               START    => W_START,

               CLK      => W_CLK,

               RESET    => W_RESET,

               RESULT   => W_RESULT,

               DONE     => W_DONE);
    
      W_A        <= (others => '0');

      W_B        <= (others => '0');

      W_START    <= '0';

      W_RESET    <= '0';

end behavioral;


