package ticktacktoe;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TickTackToeTest {

  public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("java.ticktacktoe.TickTackToeTest");
    }

    @Test
    public void test_initial_fill()
    {
      TickTackToe tick = new TickTackToe();
      for (int i = 0; i <= 8; i++)
      {
        assertEquals(tick.board[i / 3][i % 3],(char) (i+49));
      }
    }

    @Test
    public void test_modify_board()
    {
      TickTackToe tick = new TickTackToe();
      tick.modify_board(0,'1');
      assertEquals('X', tick.board[0][0]);

      tick.modify_board(1,'2');
      assertEquals('O', tick.board[0][1]);
    }
}
