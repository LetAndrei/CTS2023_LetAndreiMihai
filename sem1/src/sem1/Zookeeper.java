package sem1;

public class Zookeeper {
	private String name;
	
	public void feedAnimal(Animal animal) {
		animal.eat(name);
	}

	public Zookeeper(String name) {
		super();
		this.name = name;
	}
	
	
}
