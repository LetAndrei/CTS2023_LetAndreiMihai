package sem1;

public class Lion extends Animal{

	public Lion(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat(String ownerName) {
		System.out.println("The Lion "+ this.getName() + " has been fed by " + ownerName + ".");		
	}

}
