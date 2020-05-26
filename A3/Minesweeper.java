public class Minesweeper {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int c = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);
        int[][] board = new int[r][c];
        for (int i = 0; i < k; i++) {
            int x =  (int) (Math.random() * r);
            int y =  (int) (Math.random() * c);
            if (board[x][y] == -1) {
                i--;
                continue;
            }
            board[x][y] = -1;
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (board[i][j] == -1)
                    continue;
                else {
                    int count  = 0;
                    if (i-1 >= 0 && board[i-1][j] == -1)
                        count++;
                    if (i-1 >= 0 && j-1 >= 0 && board[i-1][j-1] == -1)
                        count++;
                    if (i-1 >= 0 && j+1 < c && board[i-1][j+1] == -1)
                        count++;
                    if (i+1 < r && board[i+1][j] == -1)
                        count++;
                    if (i+1 < r && j-1 >= 0 && board[i+1][j-1] == -1)
                        count++;
                    if (i+1 < r && j+1 < c && board[i+1][j+1] == -1)
                        count++;
                    if (j+1 < c && board[i][j+1] == -1)
                        count++;
                    if (j-1 >= 0 && board[i][j-1] == -1)
                        count++;
                    board[i][j] = count;
                }
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c-1; j++) {
                if (board[i][j] == -1) {
                    System.out.print("*  ");
                }
                else
                    System.out.print(board[i][j]+"  ");
            }
            if (board[i][c-1] == -1) {
                System.out.println("*");
            }
            else
                System.out.println(board[i][c-1]);
        }
    }
}