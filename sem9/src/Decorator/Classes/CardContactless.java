package Decorator.Classes;

public class CardContactless extends AbstractDecorator {
	public CardContactless(ICard newCard) {
		super(newCard);
	}

	@Override
	public void payContactless(double sum) {
		System.out.println("S-a platit contactless suma de "+sum);
		
	}
}
