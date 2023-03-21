package ro.ase.simplefactory;

public class Tram implements ITransportVehicle{
	
	private int noSeats;
	
	

	protected Tram(int noSeats) {
		super();
		this.noSeats = noSeats;
	}



	@Override
	public void showInfo() {
		System.out.println("The tram has " + this.noSeats + " seats.");
	}



	@Override
	public void movingType() {
		System.out.println("The bus is moving on tracks.");		
	}

}
