package design_patterns;

public class Singleton_Lazy_Enum {

	public static void main(String[] args) { // available after Java 1.5
		
		MyClass4 myClass4_1 = MyClass4.INSTANCE;
		myClass4_1.i = 10;
		myClass4_1.printValueOfI();
		
		MyClass4 myClass4_2 = MyClass4.INSTANCE;
		myClass4_2.i = 20;
		
		myClass4_1.printValueOfI();
		
	}
}

enum MyClass4
{
	INSTANCE;
	
	int i;
	
	public void printValueOfI()
	{
		System.out.println("i: "+i);
	}
}