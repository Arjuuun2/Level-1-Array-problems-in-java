import java.io.*;
import java.util.Arrays;

public class ArrayTwo {

	public static void main(String[] f) {
		int[] ar= {2,4,5,6};
		System.out.println(Arrays.toString(ar));
		change(ar);
		System.out.println(Arrays.toString(ar));
		
	}
	public static void change(int ar[]) {
		 ar[1]=56;
	}
}
