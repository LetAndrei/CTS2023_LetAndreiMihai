package sem1;

public class Safari extends Zoo {
	
	private float maxCarWeight;

	public Safari(String name, Zookeeper zookeeper, float weight) {
		super(name, zookeeper);
		// TODO Auto-generated constructor stub
		this.maxCarWeight = weight;
	}
	
	public boolean checkWeight(Car car) {
		if(car != null) {
			return false;
		}
		return !(car.getCarWeight() > this.maxCarWeight); // SAU  return car.getCarWeight() < this.maxCarWeight;
	}
	
	public float computeFee(Car car) {
		if(!checkWeight(car)) {
			return 0f;
		}
		if(car.getCarWeight() < this.maxCarWeight/2) {
			return 10.10f;
		}
		
			return 20.20f;
		
	}

}
