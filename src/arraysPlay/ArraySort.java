package arraysPlay;

import java.util.Arrays;

import sun.reflect.generics.tree.ArrayTypeSignature;

public class ArraySort {
	private int arraySort [] = {3,5,6,-4,3,-6};
	//private String[] anStringArray = new String[6];
	
	public void sortArray (int array []) {
		Arrays.sort(array);
	}

	public int [] getArray(){
		return arraySort;
	}
	
	 public static void printArray(int array []) {

	      for (int i = 0; i < array.length; i++) {
	         if(i != 0){
	            System.out.print(", ");
	         }
	         System.out.print(array[i]);                     
	      }
	      System.out.println();
	   }

}
