/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class test3
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-- != 0){
		    int N = sc.nextInt();
		    int x1 = sc.nextInt();
		    int y1 = sc.nextInt();
		    int x2 = sc.nextInt();
		    int y2 = sc.nextInt();
		    
		    int a = Math.min(x1, N-x1+1);
		    int b = Math.min(y1, N-y1+1);
		    int c = Math.min(x2, N-x2+1);
		    int d = Math.min(y2, N-y2+1);
		    
		    int aa = Math.abs(x2 - x1);
		    int bb = Math.abs(y2 - y1);
		    int cc = aa + bb;
		    int mm = Math.min(cc, Math.min(c, d)+ Math.min(a, b));
		    System.out.println(mm); 
		    
		  //  int a1 = x1 + (N - x2);
		  //  int a2 = x2 - x1;
		  //int l11 = x1 + (N - x2);
		  //int l1 = x1;
		  //int r1 = x2 - x1;
		  //int t1 = y1;
		  //int b1 = y2 - y1;
		  
		  
		  //int r2 = N - x2 + 1;
		  //int b2 = N - y2 + 1;
		  
		  //int c1 = r1 + b1;
		  //int c2 = l1 + r2;
		  //int c3 = t1 + b2;
		  //int c4 = l1 + b2;
		  //int c5 = t1 + r2;
		  
		  //int aa = Math.min(c1, c2);
		  //int bb = Math.min(c3, c4);
		  //int cc = Math.min(aa, c5);
		  //int mm = Math.min(bb, cc);
		  
		  ////System.out.println(mm);
		    
		    
		  ////  int b2 = y2 - y1;
		    
		  ////  int a = a1 + b1;
		  ////  int b = a1 + b2;
		  ////  int c = a2 + b1;
		  ////  int d = a2 + b2;
		    
		  ////  int aa = Math.min(a, b);
		  ////  int bb = Math.min(c, d);
		  ////  int mm = Math.min(aa, bb);
		    
		  //  System.out.println(mm);
		}
	}
}
