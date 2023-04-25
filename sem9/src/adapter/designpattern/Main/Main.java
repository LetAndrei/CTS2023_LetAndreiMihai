package adapter.designpattern.Main;

import AdapterObject.Classes.CreditAdapterObject;
import adapter.designpattern.Existent.Credit;
import adapter.designpattern.Existent.CreditAdapterClass;
import adapter.designpattern.Existent.CreditIpotecar;
import adapter.designpattern.NewFramework.CreditLeasing;

public class Main {
	public static void afiseazaCredit(int suma,Credit c) {
		c.oferaCredit(suma);
	}

	public static void main(String[] args) {
		Credit ipotecar = new CreditIpotecar();
		afiseazaCredit(5000, ipotecar);
		CreditLeasing leasing = new CreditLeasing();
		Credit adapter = new CreditAdapterClass();
		afiseazaCredit(6000, adapter);
		Credit adapterObject = new CreditAdapterObject(leasing);
		afiseazaCredit(3000, adapterObject);
	}

}
