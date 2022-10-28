package Backtracking;

public class arrayBack {
    public static void print(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void change(int arr[], int i, int value){
        // base case
        if(i==arr.length){
            print(arr);
            return;
        }
        arr[i]=value;
        change(arr, i+1, value+1);
        arr[i]=arr[i]-2;    //backtracking step

    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        change(arr, 0, 1);
        print(arr);
    }
}
