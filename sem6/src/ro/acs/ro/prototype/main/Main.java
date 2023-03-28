package ro.acs.ro.prototype.main;

import ro.acs.ro.prototype.AbstractPrototype;
import ro.acs.ro.prototype.Client;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		AbstractPrototype clientPrototype = new Client("Andrei","0722123456","andrei@gmail.com");
		AbstractPrototype clientTwo = clientPrototype.createACopy();
		
		System.out.println(clientTwo.toString());

	}

}
