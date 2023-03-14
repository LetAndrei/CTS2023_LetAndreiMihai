package singleton.ase.cts;

public class Director {

	private String nume;
	private int varsta;
	private static Director instanta = null; //lazy initialisation
	
	private Director(String nume, int varsta) {
		this.nume = nume;
		this.varsta = varsta;
	}
	
	@Override
	public String toString() {
		return "Director [nume=" + nume + ", varsta=" + varsta + "]";
	}

	public synchronized static Director getInstance(String nume) {
		if(instanta == null) {
			instanta = new Director(nume,30);
		}
		return instanta; //lazy initialisation
	}
	
}
