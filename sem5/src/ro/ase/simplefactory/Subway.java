package ro.ase.simplefactory;

public class Subway implements ITransportVehicle {

	private int noSeats;
	
	@Override
	public void showInfo() {
		System.out.println("Subway has "+ this.noSeats + " seats.");
		
	}

	@Override
	public void movingType() {
		System.out.println("The subway goes underground.");
	}

	protected Subway(int noSeats) {
		super();
		this.noSeats = noSeats;
	}
	
	
	
}
