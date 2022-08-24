import java.io.*;
import java.util.*;

public class ArrayQMax {

	public static void main(String[] args) {
//question to print the maximum value from the array
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter the length of the array");
		int len=in.nextInt();
		
		int[] arr=new int[len];//initializing array
		
		System.out.println("enter the elements into the array");
		for(int i=0;i<len;i++) {
			arr[i]=in.nextInt();//adding elements to array from the user
		}
		
		int max=Integer.MIN_VALUE;//if the array is empty
		
		for(int i=0;i<len;i++) {//the mistake was i didnt know the logic of the program. instead of this
			//logic i go for nested for loop using i and j variable 
			//finding the biggest number from the array using simple for loop
			if(arr[i]>max) {
				
				max=arr[i];
			}
			
		}
		System.out.println("biggest item is :"+ max);

	}

}
