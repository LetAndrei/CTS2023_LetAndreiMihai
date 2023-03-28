package ro.acs.ro.builder.model;

public interface AbstractBuilder {
	public abstract Reservation getReservation();
	
	public AbstractBuilder setterIsWindowPosition(Boolean isWindowPosition);
	
	public AbstractBuilder setErgoChairs(Boolean isErgoChairs);
	
	public AbstractBuilder setDecoratedTable(Boolean isDecoratedTable);
	
	public AbstractBuilder setAmbientalMusic(Boolean isAmbientalMusic);
	
	public AbstractBuilder setMusicType(String musicType);
}