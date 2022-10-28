package DevideandConquer;

public class quickSort {

    public static void print(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void sort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int pIdx = partition(arr, si, ei);
        sort(arr, si, pIdx-1);
        sort(arr, pIdx+1, ei);
    }

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i=si-1;
        
        for(int j=si;j<ei;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp = arr[ei];
        arr[ei]=arr[i];
        arr[i]=temp;

        return i;
    }


    public static void main(String[] args) {
        int arr[]={3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        sort(arr, 0, arr.length-1);
        print(arr);
    }
}
