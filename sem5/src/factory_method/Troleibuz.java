package factory_method;

public class Troleibuz extends TransportVehicle {

	public Troleibuz(int noSeats) {
		super(noSeats);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showInfo() {
		System.out.println("The trolley " + super.toString());
		
	}

	@Override
	public void moveType() {
		System.out.println("The trolley is on electricity.");
		
	}

}
