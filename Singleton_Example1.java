package design_patterns;

public class Singleton_Example1 {

	public static void main(String[] args) {   // both objects access and modify the value in Class MyClass
		
	
		
		
//	MyClass myClass = new MyClass();
	MyClass myClass = MyClass.getInstance();	
	myClass.abc = 10;
	myClass.printValue();

	myClass.abc = 20;
	myClass.printValue();
	

	
		
	}
}

class MyClass
{
	
	private static MyClass myClass = new MyClass();
	
	private MyClass()
	{
		
	}
	
	public static MyClass getInstance()
	{
		return myClass;
	}
	
	int abc;
	public void printValue()
	{
		System.out.println("abc: "+abc);
	}
}
