package two_D_Array;

public class search {
    public static boolean sortsearch(int arr[][], int key)
    {

        int row=0;
        int col=arr[0].length-1;

        while(row<arr.length && col>=0)
        {
            if(arr[row][col]==key)
            {
                System.out.println("row:"+row+" column:"+col);
                return true;
            }
            else if(arr[row][col]>key)
            {
                col--;
            }
            else if(arr[row][col]<key)
            {
                row++;
            }
        }


        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};


        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        int key= 4;
        sortsearch(matrix, key);
    }
}
