package ro.ase.simplefactory;

public class Trolley implements ITransportVehicle{

	
	private int noSeats;
	
	
	protected Trolley(int noSeats) {
		super();
		this.noSeats = noSeats;
	}


	@Override
	public void showInfo() {
		System.out.println("The trolley has " + this.noSeats + " seats.");
	}


	@Override
	public void movingType() {
		System.out.println("The bus is moving on electricity.");		
	}

}
