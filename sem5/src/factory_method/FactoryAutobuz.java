package factory_method;

public class FactoryAutobuz implements Factory{

	@Override
	public TransportVehicle createObject(int noSeats) {
		return new Autobuz(noSeats);
	}

}
