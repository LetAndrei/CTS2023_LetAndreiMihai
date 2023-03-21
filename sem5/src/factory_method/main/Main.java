package factory_method.main;

import java.util.ArrayList;
import java.util.List;

import factory_method.Factory;
import factory_method.FactoryAutobuz;
import factory_method.FactoryTroleibuz;
import factory_method.TransportVehicle;

public class Main {

	public static void main(String[] args) {
		Factory factoryAutobuze = new FactoryAutobuz();
		Factory factoryTroleibuze = new FactoryTroleibuz();
		
		List<TransportVehicle> mijloaceTransport = new ArrayList<>();
		mijloaceTransport.add(factoryAutobuze.createObject(10));
		mijloaceTransport.add(factoryAutobuze.createObject(25));
		mijloaceTransport.add(factoryTroleibuze.createObject(20));

		for(TransportVehicle t: mijloaceTransport) {
			t.showInfo();
			t.moveType();
		}

	}

}
