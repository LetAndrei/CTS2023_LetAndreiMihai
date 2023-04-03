package main;

import sem1.Kangoroo;
import sem1.Lion;
import sem1.Zebra;
import sem1.Zoo;
import sem1.Zookeeper;

public class Main {
	public static void main(String[] args) {
		Zookeeper zookeper = new Zookeeper("Marcel");
		Zoo zoo = new Zoo("Bucuresti", zookeper);
		
		Zebra zebra = new Zebra("Vergi");
		zoo.addAnimal(zebra);
		zoo.addAnimal(new Lion("Simba"));
		zoo.addAnimal(new Kangoroo("Buster"));
		
		zoo.feedAllAnimals();
		
	}
}
