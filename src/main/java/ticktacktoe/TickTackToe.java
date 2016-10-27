package ticktacktoe;
import java.util.Scanner;

public class TickTackToe
{

	static char[][] board = new char[3][3];
	public TickTackToe()
	{
		board = fill_board();
	}
	static char whos_turn(int turn)
	{
		if (turn % 2 == 0)
			return 'X';

		return 'O';
	}

	static char input(int turn)
	{
		System.out.println(whos_turn(turn) + " position: ");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		while (!in_range(str.charAt(0)) || str.length() != 1 || !is_occupied(str.charAt(0)) )
		{
			System.out.println("illegal move ");
			 s = new Scanner(System.in);
			 str = s.nextLine();
		}
		return str.charAt(0);

	}

	static void modify_board(int turn, char letter)
	{
		board[(letter-49) / 3][(letter-49) % 3] = whos_turn(turn);
	}

	public char[][] fill_board()
	{
		char[][] board = new char[3][3];
		for (int i = 0; i <= 8; i++)
		{
			board[i / 3][i % 3] = (char) (i+49);
		}
		return board;
	}

	static boolean is_horizontal_winner()
	{
		for (int i = 0; i <= 2; i++)
		{
			if (board[i][0] == board[i][1] && board[i][0] == board[i][2])
				return true;
		}

		return false;
	}

	static boolean is_vertical_winner()
	{
		for (int i = 0; i <= 2; i++)
		{
			if (board[0][i] == board[1][i] && board[0][i] == board[2][i])
				return true;
		}

		return false;
	}

	static boolean is_diagonal_winner()
	{
		return ((board[0][0] == board[1][1] && board[2][2] == board[1][1]) || (board[0][2] == board[1][1] && board[2][0] == board[1][1]));
	}

	static boolean has_won()
	{
		return (is_horizontal_winner() || is_vertical_winner() || is_diagonal_winner());
	}

	static void output_board()
	{
		for (int i = 0; i <=  2; i++)
		{
			for (int y = 0; y <= 2; y++)
			{
				System.out.print( board[i][y] + " ");

			}

			System.out.println();

		}
	}

	static void output_winner(int turns,boolean is_winner)
	{
		if (is_winner)
			System.out.println("Winner is: "+ whos_turn(turns));
		else

			System.out.println("Draw!");

	}

	static boolean in_range(char letter)
	{
		return (letter >= 49 && letter <= 57);
	}

	static boolean is_occupied(char letter)
	{
		return (board[(letter - 49) / 3][(letter - 49) % 3] != 'X' && board[(letter - 49) / 3][(letter - 49) % 3] != 'O');
	}

	static boolean is_draw(int turns)
	{
		return(turns == 8);
	}


    public static void main(String[] args)
    {

    	int turns = -1;
    	char num = ' ';
			TickTackToe tick = new TickTackToe();
    	boolean is_over = false;
    	output_board();
    	while (!is_over)
    	{
    		turns++;
    		num = input(turns);

    		modify_board(turns, num);
    		output_board();
    		is_over = (is_draw(turns) || has_won());

    	}
    	output_winner(turns, has_won());

    }
}
