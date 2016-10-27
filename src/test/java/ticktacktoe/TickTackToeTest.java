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
     tick.board[0][0] = 'X';
     assertEquals(false, tick.is_occupied('1'));

     tick.board[0][1] = 'O';
     assertEquals(false, tick.is_occupied('2'));

     tick.board[0][2] = '3';
     assertEquals(true, tick.is_occupied('3'));
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

    @Test
    public void test_is_horizontal_winner()
    {
      TickTackToe tick = new TickTackToe();
      tick.board[0][0] = 'X';
      tick.board[0][1] = 'X';
      tick.board[0][2] = 'X';
      assertEquals(true,tick.is_horizontal_winner());
      tick.board = tick.fill_board();
      tick.board[1][0] = 'O';
      tick.board[1][1] = 'O';
      tick.board[1][2] = 'O';
      assertEquals(true,tick.is_horizontal_winner());
      tick.board = tick.fill_board();
      tick.board[2][0] = 'X';
      tick.board[2][1] = 'X';
      tick.board[2][2] = 'X';
      assertEquals(true,tick.is_horizontal_winner());
      tick.board = tick.fill_board();
      tick.board[2][0] = 'X';
      tick.board[2][1] = 'O';
      tick.board[2][2] = 'X';
      assertEquals(false, tick.is_horizontal_winner());
    }

    @Test
    public void test_is_vertical_winner()
    {
      TickTackToe tick = new TickTackToe();
      tick.board[0][0] = 'X';
      tick.board[1][0] = 'X';
      tick.board[2][0] = 'X';
      assertEquals(true,tick.is_vertical_winner());
      tick.board = tick.fill_board();
      tick.board[0][1] = 'O';
      tick.board[1][1] = 'O';
      tick.board[2][1] = 'O';
      assertEquals(true,tick.is_vertical_winner());
      tick.board = tick.fill_board();
      tick.board[0][2] = 'X';
      tick.board[1][2] = 'X';
      tick.board[2][2] = 'X';
      assertEquals(true,tick.is_vertical_winner());
      tick.board = tick.fill_board();
      tick.board[2][0] = 'X';
      tick.board[2][1] = 'O';
      tick.board[2][2] = 'X';
      assertEquals(false, tick.is_vertical_winner());
    }

    @Test
    public void test_is_diagonal_winner()
    {
      TickTackToe tick = new TickTackToe();
      tick.board[0][0] = 'X';
      tick.board[1][1] = 'X';
      tick.board[2][2] = 'X';
      assertEquals(true,tick.is_diagonal_winner());
      tick.board = tick.fill_board();
      tick.board[0][2] = 'O';
      tick.board[1][1] = 'O';
      tick.board[2][0] = 'O';
      assertEquals(true,tick.is_diagonal_winner());
      tick.board = tick.fill_board();
      tick.board[2][0] = 'X';
      tick.board[2][1] = 'O';
      tick.board[2][2] = 'X';
      assertEquals(false, tick.is_diagonal_winner());
      tick.board = tick.fill_board();
      tick.board[0][0] = 'X';
      tick.board[1][1] = 'O';
      tick.board[2][2] = 'X';
      assertEquals(false, tick.is_diagonal_winner());
    }
}
