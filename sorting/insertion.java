package sorting;


public class insertion {
    public static void sort(int arr[])
    {
        for(int i=1;i<=arr.length-1;i++)
        {
            int curr = arr[i];
            int prev = i-1;

            while(prev>=0 && arr[prev]>curr)
            {
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]= {5,3,1,4,2};
        sort(arr);
    }
}
