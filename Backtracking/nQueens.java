package Backtracking;

public class nQueens {
    public static boolean isSafe(char board[][], int row, int col){
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='q'){
                return false;
            }
        }
        for(int i=row-1, j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='q'){
                return false;
            }
        }
        for(int i=row-1, j=col+1;i>=0 && j<board[0].length;i--,j++){
            if(board[i][j]=='q'){
                return false;
            }
        }
        return true;
    }
    public static void printBoard(char board[][]){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    public static void Nqueens(char board[][], int row){
        if(row==board.length){
            printBoard(board);
            System.out.println("----------chess board----------");
            count++;
            return;
        }
        for(int i=0;i<board.length;i++){
            if(isSafe(board, row, i)){
                board[row][i] = 'q';
                Nqueens(board, row+1);
                board[row][i] = 'x';
            }
        }
    }
    static int count = 0;
    public static void main(String[] args) {
        int n = 5;
        char board[][] = new char[n][n];

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                board[i][j] = 'x';
            }
        }
        Nqueens(board, 0);
        System.out.println("total ways to arrange n queens in n rows "+count);
    }
}
