/**
 * 
 */
package testing;

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
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String s = "abcdef";
		
		//Strings in others - anagrama
		String[] anStringArray = new String[6];
		
		anStringArray[0] = "adfaff";
		anStringArray[1] = "abcdef";
		anStringArray[2] = "adfaff";
		anStringArray[3] = "adfaff";
		anStringArray[4] = "adgaff";
		anStringArray[5] = "adfaff";
		
		//TODO: indexof
		//TODO: in other class
		

	}

}
