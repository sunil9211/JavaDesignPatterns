package design_patterns;

public class Singleton_Lazy_Bill_PughImplementation {

	public static void main(String[] args) {
		
		MyClass3 myClass3_1 = MyClass3.getInstance();
		MyClass3 myClass3_2 = MyClass3.getInstance();
		
	}
}

class MyClass3                     // Suggested by Bill Pugh, this is the most
{									// optimal way of creating a Singleton class
	private MyClass3()
	{
		System.out.println("Object created!");
	}
	
	private static class Inner_MyClass3
	{
		private static final MyClass3 MY_CLASS3 = new MyClass3();
	}
	
	
	public static MyClass3 getInstance()
	{
		return Inner_MyClass3.MY_CLASS3;
	}
	
}
