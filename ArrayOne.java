import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

//import jdk.internal.misc.FileSystemOption;

public class ArrayOne {

	public static void main(String[] ar) {
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter the length of the array");
		int l=in.nextInt();
		
		System.out.println("enter the elements in the array");
		int[] arr=new int[l];
		for(int i=0;i<l;i++) {
			arr[i]=in.nextInt();
		}
		
		//for(int i=0;i<l;i++) {
			//System.out.print(arr[i]+" ");
		//}
		
		//print using enhanced for loop
		//for(int i:arr) {
			//System.out.print(i+" ");
		//}
		
		
		//print array elements using simple way Array.tostring method
		
		System.out.println(Arrays.toString(arr));
	}
}
