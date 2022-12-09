/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class test4
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0){
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		    int c = sc.nextInt();
		    int[] arr = new int[n];
		    for(int i=0;i<n;i++){
		        arr[i] = sc.nextInt();
		    }
		    int sum = 0;
		    int flag = 0;
		    for(int i=0;i<n;i++){
		        if(x - arr[i] - c > 0){
		            arr[i] = x;
		            flag++;
		        }
		    }
		    
		    for(int i=0;i<n;i++){
		        sum += arr[i];
		    }
		    
		    int margin = sum - flag*c;
		    System.out.println(margin);
		}
	}
}
