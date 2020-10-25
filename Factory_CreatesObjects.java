package design_patterns;

public class Factory_CreatesObjects {

	public Phone getIt(String obj)
	{
		if(obj.equals("A"))
			return new MyAndroidPhone();
		if(obj.equals("I"))
			return new MyIPhone();
		else
			return new MyWindowsPhone();
	}
}
