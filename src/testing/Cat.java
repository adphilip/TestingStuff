package testing;

import java.util.ArrayList;

public class Cat extends Animals{
	private String nameAnimal = "abcdef";
	private ArrayList<String> aString = new ArrayList<String>();

//	//add elements to 
	public void addArrayL(String s) {
		aString.add(s);
	}
	
	public ArrayList<String> getaString (){
		return aString;
	}
	
	public void getName(){
		System.out.println("CAT extended class -> Nume animal: " + nameAnimal);
	}


}
