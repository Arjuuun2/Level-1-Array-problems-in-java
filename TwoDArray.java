import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] ar) {
		
		Scanner input=new Scanner(System.in);
		//2D Array
		
		
		
		 //int[][] arrt= {{2,2,4},
		//{1,2,3},
		//{3,4,5}
		//};
		
		//take 2D array input from user
		System.out.println("enter the size of the array");
		
		int n=input.nextInt();
		
		
		int[][] arr=new int[n][3];
		
		
		//n is the no of arrays
		System.out.println("enter the elements into the 2d array");
		//take the array input from user
		for(int i=0;i<n;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=input.nextInt();
			}
			
		}
		
		//ways to print multidimentional array
		
		//for(int i=0;i<n;i++) {
			//System.out.println(Arrays.toString(arr[i]));
		//}
		
		//for(int i=0;i<n;i++) {
			//for(int j=0;j<arr[i].length;j++) {
				//System.out.println(arr[i][j]);
			//}
	//}
//		for(int i=0;i<n;i++) {
//			System.out.println(Arrays.toString(arr[i]));
//		}
		
		//using enhanced for loop
		
		for(int[] a: arr) {
			System.out.println(Arrays.toString(a));
		}
		
		
		
		
		
	}
}
