package design_patterns;


public class BuildPhone 
{


	int battery;

	int ram;
	int rom;

	int front_camera;

	int rear_camera;

	String processor;

	
	public BuildPhone(int battery, int ram, int rom, int front_camera, int rear_camera, String processor) {
		
		this.battery = battery;
		this.ram = ram;
		this.rom = rom;
		this.front_camera = front_camera;
		this.rear_camera = rear_camera;
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "Phone [battery=" + battery + ", ram=" + ram + ", rom=" + rom + ", front_camera=" + front_camera
				+ ", rear_camera=" + rear_camera + ", processor=" + processor + "]";
	}

	
}
