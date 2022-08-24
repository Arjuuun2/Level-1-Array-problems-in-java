import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayQSwap {

	public static void main(String[] ar) {
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter the array length");
		int len=in.nextInt();
		
		System.out.println("enter the number of elements into the array");
		
		int[] arr=new int[len];
		
		for(int i=0;i<len;i++) {//take array elements from user
			arr[i]=in.nextInt();
		}
		
		System.out.println("enter the elements need to be swapped");
		int sw1=in.nextInt();
		int sw2=in.nextInt();//ask the user to swap which elements
		
		System.out.println("before swapping ");
		for(int i=0;i<len;i++) {
			System.out.println(arr[i]);
		}
		
		swap(arr,sw1,sw2);
		
		System.out.println("after swapping");
		
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	public static void swap(int[] arr,int s1,int s2) {
		
		int temp=arr[s1]; //swapping happens here
		arr[s1]=arr[s2];
		arr[s2]=temp;
	}
	
	
}
