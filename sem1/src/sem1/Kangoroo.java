package sem1;

public class Kangoroo extends Animal {

	public Kangoroo(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat(String ownerName) {
		System.out.println("The Kangoroo " + this.getName() + " has been fed by " + ownerName + ".");
	}

}
