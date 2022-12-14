package Heap_PriorityQueue;

public class heapSort {

    public static void heapify(int arr[], int i, int size){
        int left = i+1;
        int right = i+2;
        int maxIdx = i;

        if(left < size && arr[left] > arr[maxIdx]){
            maxIdx = left;
        }

        if(right < size && arr[right] > arr[maxIdx]){
            maxIdx = right;
        }

        if(maxIdx != i){
            int temp = arr[maxIdx];
            arr[maxIdx] = arr[i];
            arr[i] = temp;

            heapify(arr, maxIdx, size);
        }
    }

    public static void HeapSort(int arr[]){
        //step 1 = build max heap
        int n = arr.length;
        for(int i=n/2;i>=0;i--){
            heapify(arr, i, n);
        }

        //step 2 = push largest at the end
        for(int i=n-1;i>0;i--){
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            heapify(arr, 0, i);
        }
    }
    public static void main(String args[]){
        int arr[] = {1,3,2,6,5,7};
        HeapSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
