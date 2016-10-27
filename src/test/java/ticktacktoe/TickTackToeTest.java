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
   public void test_is_occupied()
   {
     TickTackToe tick = new TickTackToe();
     assertEquals(true, tick.is_occupied(true))
   }

}
