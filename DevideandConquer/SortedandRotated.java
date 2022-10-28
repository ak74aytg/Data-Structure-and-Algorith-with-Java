package DevideandConquer;


public class SortedandRotated {
    public static int search(int arr[], int target, int si, int ei){
        if(si>ei){
            return -1;
        }
        int mid = si+(ei-si)/2;
        if(arr[mid]==target){
            return mid;
        }
        // line 1
        if(arr[si]<=arr[mid]){
            // on left
            if(arr[mid]>=target && arr[si]<=target){
                return search(arr, target, si, mid-1);
            }
            // on right
            else{
                return search(arr, target, mid+1, ei);
            }
        }
        // line 2
        else{
            //on right
            if(arr[mid]<=target && arr[ei]>=target){
                return search(arr, target, mid+1, ei);
            }
            // on left 
            else{
                return search(arr, target, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,0,1,2};
        int target= 0;
        int Idx = search(arr, target, 0, arr.length-1);
        System.out.println(Idx);
    }
}
