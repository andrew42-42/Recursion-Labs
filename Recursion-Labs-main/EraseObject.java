import java.util.Scanner;

public class EraseObject
{
    private int [][] board;
    private Scanner in;

    public EraseObject(int [][] data)
    {
        board = data;
        in = new Scanner(System.in);
    }

    public void run()
    {
        DisplayData.display(board);
        input();
        DisplayData.display(board);
    }

    public void input()
    {
        System.out.println("Please input a row -> ");
        int r = in.nextInt();
        System.out.println("Please input a column -> ");
        int c = in.nextInt();
        erase(r, c);
    }

    public void erase(int row, int col)
    {
        if(board[row][col] == 1){
            board[row][col] = 0;
            if(row > 0){
              erase(row-1, col);
            }
            if(row < 20){
              erase(row+1, col);
            }
            if(col > 0){
              erase(row, col-1);
            }
            if(col < 20){
              erase(row, col+1);
            }
        }
    }
}