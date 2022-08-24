import java.io.*;
import java.util.*;

public class ArrayListC {

	public static void main(String[] ar) {
		
		//creating an multidimentional arraylist
		
		Scanner in=new Scanner(System.in);
		
		ArrayList<ArrayList<Integer>> marr=new ArrayList<>();
		
		//initializing the multidimentional arraylist
		
		for(int i=0;i<4;i++) {
			marr.add(new ArrayList<>());
			
		}
		
		//adding elements to an multidimentional arraylist
		
		for(int i=0;i<marr.size();i++) {
			for(int j=0;j<marr.size();j++) {
				marr.get(i).add(in.nextInt());
			}
		}
		
		//removing elements from an arraylist
		
		
		
		
		//adding elements dynamically arraylist
		
		
		
	}
}
