package design_patterns;

public class Phone_Builder 
{

	
int battery;
	int ram;
	
int rom;
	
int front_camera;

	
int rear_camera;
	
String processor;
	

	public void setBattery(int battery) {

		this.battery = battery;
	
}
	
public void setRam(int ram)
 {
		
this.ram = ram;
	
	//return this;
	
}
	
public void setRom(int rom)
 {
		
this.rom = rom;
	
	//return this;

	}

	public void setFront_camera(int front_camera) 
{
		
this.front_camera = front_camera;

		//return this;
	
}
	
public void setRear_camera(int rear_camera)
 {
		
this.rear_camera = rear_camera;
	
	//return this;

	}
	
public void setProcessor(String processor) 
{
		
this.processor = processor;
	
	//return this;
	
}
	
	
public BuildPhone getInstance()

	{
		
return new BuildPhone(battery, ram, rom, front_camera, rear_camera, processor);

	}
	
}
