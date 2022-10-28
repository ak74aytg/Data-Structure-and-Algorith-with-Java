package sorting;


public class bubble {

    public static void sort(int[] arr) {
        for(int j=0;j<arr.length-1;j++){
            for(int i=0;i<arr.length-1-j;i++){
                if(arr[i]>arr[i+1])
                {
                    int temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        int arr[]={3,5,4,2,1};
        sort(arr);
    }
}
