package ro.acs.ro.builder.main;

import ro.acs.ro.builder.model.AbstractBuilder;
import ro.acs.ro.builder.model.Builder;
import ro.acs.ro.builder.model.BuilderV2;
import ro.acs.ro.builder.model.Reservation;

public class Main {

	public static void main(String[] args) {
		AbstractBuilder builder = new Builder();
		builder.setAmbientalMusic(true).setMusicType("Jazz");
		Reservation reservation = builder.getReservation();
		System.out.println(reservation.toString());
		
//		reservation.setMusicType("Rock");
//		System.out.println(reservation.toString());

		
//		Reservation reservation2 = builder.getReservation();
		
		AbstractBuilder builder2 = new BuilderV2();
		Reservation reservation2 = builder2.setAmbientalMusic(true).setMusicType("Rock").getReservation();
		System.out.println(reservation2.toString());
		
		Reservation reservation3 = builder2.setMusicType("Metal").getReservation();
		System.out.println(reservation3.toString());
		
		
	}

}
