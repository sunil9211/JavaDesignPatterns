package design_patterns;

import java.util.ArrayList;
import java.util.List;

public class CompositeTest {

	public static void main(String[] args) {
		Component bbk = new Leaf("Barabanki", 20000);
		Component lko = new Leaf("Lucknow", 40000);
		Component gkp = new Leaf("Gorakhpur", 35000);
		Component fza = new Leaf("Faizabad", 38000);
		
		Component pune = new Leaf("Pune", 50000);
		Component nagpur = new Leaf("Nagpur", 70000);
		
		Component jabalpur = new Leaf("Jabalpur", 70000);
		Component khujraho = new Leaf("Khjraho", 33000);
		
		Component ludhiyana = new Leaf("Ludhiyana", 28000);
		Component jalandhar = new Leaf("Jalandhar", 24500);
		
	//	bbk.showInfo();
		
		Composite punjab = new Composite("Punjab");
		Composite mp = new Composite("MP");
		Composite maharashtra = new Composite("Maharashtra");
		Composite up = new Composite("UP");
		
		punjab.addComponent(jalandhar);
		punjab.addComponent(ludhiyana);
		
		up.addComponent(fza);
		up.addComponent(gkp);
		up.addComponent(lko);
		up.addComponent(bbk);
		
		mp.addComponent(khujraho);
		mp.addComponent(jabalpur);
		
		maharashtra.addComponent(pune);
		maharashtra.addComponent(nagpur);
		
		//up.showInfo();
		mp.showInfo();
	}
}

interface Component
{
	void showInfo();
}

class Leaf implements Component
{
	String name;
	int population;
	
	public Leaf(String name, int population) {
		super();
		this.name = name;
		this.population = population;
	}

	@Override
	public void showInfo() {
		System.out.println(name+" "+population);
	}
	
}
class Composite implements Component
{
	List<Component> list = new ArrayList<Component>();
	String name;

	
	public Composite(String name) {
		super();
		this.name = name;
	}

	void addComponent(Component component)
	{
		list.add(component);
	}

	@Override
	public void showInfo() {
		System.out.println(name);
		for(Component component : list)
		{
			component.showInfo();
		}
	}
	
}
