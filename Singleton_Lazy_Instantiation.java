package design_patterns;

public class Singleton_Lazy_Instantiation {


	public static void main(String[] args) {
		
	
	
	Thread thread1 = new Thread(new Runnable() {
		
		@Override
		public void run() {
			MyClass1 myClass1 = MyClass1.getInstance();
		}
	});
	
	Thread thread2 = new Thread(new Runnable() {
		
		@Override
		public void run() {
			MyClass1 myClass1 = MyClass1.getInstance();
			
		}
	});
		
	thread1.start();
	thread2.start();
	
//	MyClass myClass = new MyClass();


		
	}
}

class MyClass1
{
	
	static MyClass1 myClass1;
	
	private MyClass1()
	{
		System.out.println("Object created!");
	}
	
	public static synchronized MyClass1 getInstance()
	{
		if(myClass1 == null)
			myClass1 = new MyClass1();
		
		return myClass1;
	}
	
	int abc;
	public void printValue()
	{
		System.out.println("abc: "+abc);
	}
}