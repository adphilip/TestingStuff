/**
 * 
 */


import java.util.ArrayList;

import factory.Shape;
import factory.ShapeFactory;
import singleton.SingleObject;
import testing.Animals;
import testing.Cat;
import testing.NoRepeatedCharInAString;
import testing.TestingVector;

/**
 * @author adrian
 *
 */
public class TestingStuff {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		
		
		try {
			Animals animalInst = new Cat();
			animalInst.getName();
			animalInst.addArrayL("InMain");
			System.out.println("Array list from CAT: " + animalInst.getaString());
			System.out.println("Array list from Interface: " + animalInst.getPI());
			
			//Static attribute - print element
			System.out.println("Print a static element " + Animals.oneStaticString );
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String sOriginal = "abcdea";
		
		//Strings in others - anagramamare
		String[] anStringArray = new String[6];
		
		anStringArray[0] = "adfgff";
		anStringArray[1] = "abcdef";
		anStringArray[2] = "adfaff";
		anStringArray[3] = "adfaff";
		anStringArray[4] = "adgaff";
		anStringArray[5] = "adfaff";
		

		//TODO: in other class
		
		//Solution with indexof is not ok because we can have the same character several times.
		for (int i=0; i<sOriginal.length(); i++) {
			if (anStringArray[0].indexOf(sOriginal.charAt(i)) != -1){
				System.out.println("The char is: " + sOriginal.charAt(i));
			}
				
		}
		
		//Problem with find out unique char (Amazon)
		/*
		 * http://javahungry.blogspot.com/2013/12/first-non-repeated-character-in-string-java-program-code-example.html
		 * http://javahungry.blogspot.com/2013/06/top-25-most-frequently-asked-core-java.html
		 */
		
		NoRepeatedCharInAString charStringInstance = new NoRepeatedCharInAString();
		charStringInstance.usingBufferedReader();
		charStringInstance.charCount();
		//TODO: Search and print the char
		//afasdf
		
		/**
		 * Vector Testing
		 */
		
		TestingVector testVector = new TestingVector();
		testVector.printCapacity();
		testVector.addVectorElementInt(4);
		testVector.addVectorElementInt(5);
		testVector.printCapacity();
		testVector.addVectorElementDouble(4.8);
		testVector.addVectorElementDouble(5.9);
		testVector.printCapacity();
		
		
		/**
		 * Factory Design patterns
		 * Creational Patterns (Structural patterns,Behavioral Patterns)
		 */
		System.out.println("\n------Factory Design-------\n");
		
		ShapeFactory shapeFact = new ShapeFactory();
		
		//interface shape = new object RECTANGLE;
		Shape shape1 =  shapeFact.getShape("RECTANGLE"); // return new Rectangle ();
		shape1.draw();
		
		//interface shape = new object CIRCLE;
		Shape shape2 =  shapeFact.getShape("CIRCLE"); // return new Circle ();
		shape2.draw();
		
		
		/**
		 * Singleton Design patterns
		 * Creational Patterns (Structural patterns,Behavioral Patterns)
		 */
		
		System.out.println("\n------Singleton Pattern-------\n");
		SingleObject object = SingleObject.getInstSO();
		object.ShowSomething();
	}

}
