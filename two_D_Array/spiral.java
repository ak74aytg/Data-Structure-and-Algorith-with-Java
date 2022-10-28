package two_D_Array;

public class spiral {

    public static void print(int arr[][])
    {
        int n = arr.length;
        int m = arr[0].length;
        int startrow = 0;
        int startcol = 0;
        int endrow = n-1;
        int endcol = m-1;

        while(startrow<=endrow && startcol<= endcol)
        {
            // top row
            for(int i=startcol;i<=endcol;i++)
            {
                System.out.print(arr[startrow][i]+" ");
            }

            // right col
            for(int j=startrow+1;j<=endrow;j++)
            {
                System.out.print(arr[j][endcol]+" ");
            }

            // buttom row
            for(int i=endcol-1;i>=startcol;i--)
            {
                System.out.print(arr[endrow][i]+" ");
            }

            // left col
            for(int j=endrow-1;j>=startrow+1;j--)
            {
                System.out.print(arr[j][startcol]+" ");
            }

            startrow++;
            startcol++;
            endcol--;
            endrow--;
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        print(matrix);
    }
}
