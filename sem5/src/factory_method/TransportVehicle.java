package factory_method;

public abstract class TransportVehicle {
	protected int noSeats;

	public TransportVehicle(int noSeats) {
		super();
		this.noSeats = noSeats;
	}
	
	public abstract void showInfo();
	public abstract void moveType();

	@Override
	public String toString() {
		return "TransportVehicle has [noSeats=" + noSeats + "]";
	}
	
	
}
