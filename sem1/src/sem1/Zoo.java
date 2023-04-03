package sem1;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private String name;
	private Zookeeper zookeeper;
	private List<Animal> animals;
	
	
	public Zoo(String name, Zookeeper zookeeper) {
		super();
		this.name = name;
		this.zookeeper = zookeeper;
		this.animals = new ArrayList<Animal>();
	}

	public void feedAllAnimals() {
		for(int i =0; i<animals.size(); i++) {
			zookeeper.feedAnimal(animals.get(i));
		}
	}
	
	public void addAnimal(Animal animal) {
		animals.add(animal);
	}
}
