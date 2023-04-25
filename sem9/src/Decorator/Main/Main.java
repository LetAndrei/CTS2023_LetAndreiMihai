package Decorator.Main;

import Decorator.Classes.AbstractDecorator;
import Decorator.Classes.Card;
import Decorator.Classes.CardContactless;
import Decorator.Classes.CardContactlessVirtual;
import Decorator.Classes.ICard;

public class Main {

	public static void aplicatie(ICard card) {
		card.payOnline(1000);
		card.payPOS(2000);
	}
	
	public static void main(String[] args) {
		ICard card = new Card();
		

		AbstractDecorator decorator = new CardContactless(card);
		AbstractDecorator decoratorVirtual = new CardContactlessVirtual(card);
		decorator.payContactless(500);
		decoratorVirtual.payContactless(480);
		aplicatie(decorator);
	}

}
