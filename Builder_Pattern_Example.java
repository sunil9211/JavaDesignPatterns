package design_patterns;

public class Builder_Pattern_Example 
{

	public static void main(String[] args) 
{
		 Phone_Builder phone = new Phone_Builder();
		 
		 phone.setBattery(3100);
		 phone.setRam(4);
		 phone.setProcessor("Qualcomm 418");
		 
		 System.out.println(phone.getInstance());
	}
}
