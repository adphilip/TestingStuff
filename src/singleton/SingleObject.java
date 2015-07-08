package singleton;

public class SingleObject {
	
	//itsself instance, static !!!
	private static SingleObject instSO = new SingleObject();
	
	//private constructor (nu returneaza type)
	private SingleObject(){}
	
	public static SingleObject getInstSO (){
		return instSO;
	}
	
	
	public void ShowSomething(){
		System.out.println ("Show Singleton Pattern !");
	}

}
