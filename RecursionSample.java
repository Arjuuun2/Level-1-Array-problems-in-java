import java.io.*;
import java.util.*;
//print to search in an array
public class RecursionSample {

	public static void main(String[] ar) {
		System.out.println(fact(5));
		
	}
	public static int fact(int n) {
		
		if(n<1)return 1;
		return  n* fact(n-1);
	}
	}

