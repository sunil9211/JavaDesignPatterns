package design_patterns;

public class Factory_Design_Pattern {
public static void main(String[] args) {
	Factory_CreatesObjects  factory_CreatesObjects = new Factory_CreatesObjects();
	Phone p = factory_CreatesObjects.getIt("I");
	p.specs();
}
}

// Factory design patterns creates objects without letting the client know of which
// class the object belongs to.