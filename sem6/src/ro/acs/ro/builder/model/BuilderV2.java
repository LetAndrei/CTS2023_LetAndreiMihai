package ro.acs.ro.builder.model;

public class BuilderV2 implements AbstractBuilder{
	
	private boolean isWindowPosition;
	private boolean isErgoChairs;
	private boolean isDecoratedTable;
	private boolean isAmbientalMusic;
	private String musicType;

	@Override
	public Reservation getReservation() {
		return new Reservation(isWindowPosition,isErgoChairs,isDecoratedTable,isAmbientalMusic,musicType);
	}
	
	public BuilderV2() {
		isWindowPosition = false;
		isErgoChairs= false;
		isDecoratedTable= false;
		isAmbientalMusic= false;
		musicType=null;
	}

	@Override
	public AbstractBuilder setterIsWindowPosition(Boolean isWindowPosition) {
		this.isWindowPosition = isWindowPosition;
		return this;
	}

	@Override
	public AbstractBuilder setErgoChairs(Boolean isErgoChairs) {
		this.isErgoChairs = isErgoChairs;
		return this;
	}

	@Override
	public AbstractBuilder setDecoratedTable(Boolean isDecoratedTable) {
		this.isDecoratedTable = isDecoratedTable;
		return this;
	}

	@Override
	public AbstractBuilder setAmbientalMusic(Boolean isAmbientalMusic) {
		this.isAmbientalMusic = isAmbientalMusic;
		return this;
	}

	@Override
	public AbstractBuilder setMusicType(String musicType) {
		this.musicType =musicType;
		return this;
	}

}
