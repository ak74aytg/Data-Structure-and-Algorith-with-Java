public class maxSum {

    public static void prefix(int arr[])
    {
        int curr=0;
        int max = Integer.MIN_VALUE;

        int prefi[] = new int[arr.length];
        prefi[0]=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            prefi[i]=prefi[i-1]+arr[i];
        }

        for(int i=0;i<arr.length;i++)
        {
            int start=i;
            for(int j=i;j<arr.length;j++)
            {
                int end=j;
                curr = start==0?prefi[end]:prefi[end]-prefi[start-1];
            }
            if (curr>max){
                max = curr;
            }
        }
        System.out.println(max);
    }

    public static void bruteForce(int[] arr){
        int curr = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            curr=0;
            for(int j=i;j<arr.length;j++)
            {
                curr+=arr[j];
            }
            if(curr>max)
            {
                max=curr;
            }
        }
        System.out.println(max);
    }


    public static void kadane(int arr[]){
        int curr = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            curr += arr[i];
            if(curr<0)
            {
                curr=0;
            }
            if(curr>max)
            {
                max=curr;
            }
        }
        System.out.println(max);
    }

    public static void main(String argv[]){
        int arr[] = {2, -40, 6, 20, 10, 12, 14};
        bruteForce(arr);
        prefix(arr);
        kadane(arr);
    }
}
