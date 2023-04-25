package adapter.designpattern.Existent;

import adapter.designpattern.NewFramework.CreditLeasing;

public class CreditAdapterClass extends CreditLeasing implements Credit{

	@Override
	public void oferaCredit(int suma) {
		super.oferaLeasing(suma);
		
	}

}
