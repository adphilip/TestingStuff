package testing;

import java.util.Vector;
/**
 * 
 * @author afilipescu
 * http://www.tutorialspoint.com/java/java_vector_class.htm
 */
public class TestingVector {
	
	Vector vectorInt = new Vector (3,2);

	public void addVectorElementInt(int i) {
		vectorInt.addElement(new Integer(i));
	}
	
	public void addVectorElementDouble(double d) {
		vectorInt.addElement(new Double(d));
	}
	
	public void printCapacity (){
		  System.out.println("Current capacity Vector : " + vectorInt.capacity());
	}
}
