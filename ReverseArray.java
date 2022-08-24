import java.io.*;
import java.util.*;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter the length of the array");
		int len=in.nextInt();
		
		int[] arr=new int[len];//initializing array
		
		System.out.println("enter the elements into the array");
		for(int i=0;i<len;i++) {
			arr[i]=in.nextInt();//adding elements to array from the user
		  }
		
		System.out.println("reversed array is :");
		
		revArray(arr);
		System.out.println(Arrays.toString(arr));
			
		}
		
		
//	   revArray(arr);
//		System.out.println(Arrays.toString(arr));
	   
	
	
	public static void revArray(int[] arr) {
	int len=arr.length-1;
		int start=0;
		int end=arr.length-1;
		while(start<end) {
		swap(arr,start,end);
		start++;
		end--;
		}
		
		
	}
	
public static void swap(int[] arr,int s1,int s2) {
		
		int temp=arr[s1]; //swapping happens here
		arr[s1]=arr[s2];
		arr[s2]=temp;
	}

}
