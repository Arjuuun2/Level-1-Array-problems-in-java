import java.io.*;
import java.util.*;


public class ArrayQmaxRange {
	//print the maximum value from a given range
	
	public static void main(String[] ar) {
		
	Scanner in=new Scanner(System.in);
	
	System.out.println("enter the length of the array");
	int len=in.nextInt();
	
	int[] arr=new int[len];//initializing array
	
	System.out.println("enter the elements into the array");
	for(int i=0;i<len;i++) {
		arr[i]=in.nextInt();//adding elements to array from the user
	  }
	
	System.out.println("enter the range from where to where you have to find the maximum number");
	int startRange=in.nextInt();
	int endRange=in.nextInt();
	
	int maximum=max(arr,startRange,endRange);
	
	System.out.println(maximum);
	}
	
	public static int max(int[] arr,int start ,int end) {
		
		int maxi=Integer.MIN_VALUE;
		
		for(int i=start;i<end;i++) {
			if(arr[i]>maxi) {
				maxi=arr[i];
			}
		}
		return maxi;
	}
}
