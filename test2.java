/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class test2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();


        while(n-- != 0){
		    int t = sc.nextInt();
	        int[] arr = new int[t];
		    for(int i=0;i<t;i++){
		        arr[i] = sc.nextInt();
		    }
		    int flag = 0;
		    int s1 = 0;
		    int s2 = 0;
		    for(int i=0;i<t;i++){
		        for(int j=0;j<=i;j++){
		            s1+=arr[j];
		        }
		        for(int j=i+1;j<t;j++){
		            s2+=arr[j];
		        }
		        if((s1 * s2) % 2 != 0){
		            flag = 1;
		            System.out.println("YES");
		            break;
		        }
		    }
		    if(flag == 0){
		        System.out.println("NO");
		    }
		}
	}
}
