package AdapterObject.Classes;

import adapter.designpattern.Existent.Credit;
import adapter.designpattern.NewFramework.CreditLeasing;

public class CreditAdapterObject implements Credit {
	private CreditLeasing credit;
	public CreditAdapterObject(CreditLeasing credit) {
		this.credit = credit;
	}
	
	@Override
	public void oferaCredit(int suma) {
		this.credit.oferaLeasing(suma);
		
	}
	
}
