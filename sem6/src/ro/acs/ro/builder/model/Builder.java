package ro.acs.ro.builder.model;

public class Builder implements AbstractBuilder{
	
	Reservation reservation;

	@Override
	public Reservation getReservation() {
		return reservation;
	}
	
	public Builder(){
		reservation = new Reservation(false,false,false,false,null);
	}
	
	public AbstractBuilder setterIsWindowPosition(Boolean isWindowPosition) {
		reservation.setWindowPosition(isWindowPosition);
		return this;
	}
	
	public AbstractBuilder setErgoChairs(Boolean isErgoChairs) {
		reservation.setErgoChairs(isErgoChairs);
		return this;
	}
	
	public AbstractBuilder setDecoratedTable(Boolean isDecoratedTable) {
		reservation.setDecoratedTable(isDecoratedTable);
		return this;
	}
	
	public AbstractBuilder setAmbientalMusic(Boolean isAmbientalMusic) {
		reservation.setAmbientalMusic(isAmbientalMusic);
		return this;
	}
	
	public AbstractBuilder setMusicType(String musicType) {
		reservation.setMusicType(musicType);
		return this;
	}
}
