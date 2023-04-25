package Decorator.Classes;

public abstract class AbstractDecorator implements ICard{
	public abstract void payContactless(double sum);
	ICard card;
	
	public AbstractDecorator(ICard newCard) {
		this.card = newCard;
	}

	@Override
	public void payOnline(double sum) {
		card.payOnline(sum);
		
	}

	@Override
	public void payPOS(double sum) {
		card.payPOS(sum);
		
	}
}
