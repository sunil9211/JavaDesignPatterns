package design_patterns;

public class Singleton_Lazy_Synchronized_Block {

	public static void main(String[] args) {
		
		MyClass2 myClass1 = MyClass2.getInstance();
		MyClass2 myClass2 = MyClass2.getInstance();
		
	}
	
}

class MyClass2
{
	private static MyClass2 myClass2;
	
	private MyClass2()
	{
		System.out.println("Object created!");
	}
											// LAZY Instantiation - 
	public static MyClass2 getInstance()  // by not having whole method as
	{                                    // synchronized. We save some time  
		if(myClass2 == null)            // which could have been consumed otherwise.
		{
			synchronized(MyClass2.class) // still first time it can affect 
			{                             //  performance.
				if(myClass2 == null)
				{
					myClass2 = new MyClass2();
				}
			}
		}
		return myClass2;
	}
}
