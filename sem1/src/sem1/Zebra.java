package sem1;

public class Zebra extends Animal{

	public Zebra(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat(String ownerName) {
		System.out.println("The Zebra " + this.getName() + " has been fed by " + ownerName + ".");
	}

}
