/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class test
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0){
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    for(int i=0;i<n;i++){
		        arr[i] = sc.nextInt();
		    }
		    int i=0;
		    int j=n-1;
		    int ans = 0;
		    while(i<=j){
		        if(arr[i]==arr[j]){
		            i++;
		            j--;
		        }else if(arr[i]<arr[j]){
		            arr[j] -=arr[i];
		            i++;
		            ans++;
		        }else{
		            arr[i] -= arr[j];
		            j--;
		            ans++;
		        }
		        
		    }
		    System.out.println(ans);
		}
	}
}
