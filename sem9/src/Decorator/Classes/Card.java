package Decorator.Classes;

public class Card implements ICard{

	@Override
	public void payOnline(double sum) {
		System.out.println("Plata online in valoare de " +sum);
		
	}

	@Override
	public void payPOS(double sum) {
		System.out.println("Plata cu POS in valoare de "+sum);
		
	}

}
