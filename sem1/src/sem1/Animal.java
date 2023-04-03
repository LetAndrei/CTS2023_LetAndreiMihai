package sem1;

public abstract class Animal {
	private String name;
	private int age;
	
	public abstract void eat(String ownerName);

	public String getName() {
		return name;
	}

	public Animal(String name) {
		super();
		this.name = name;
		this.age = 10;
	}

	
}
