package singleton.ase.cts;

public class Papa {

	private String nume;
	private int nrAniFunctie;
	private int alCatelea;
	
	public Papa(String nume, int nrAniFunctie, int alCatelea) {
		super();
		this.nume = nume;
		this.nrAniFunctie = nrAniFunctie;
		this.alCatelea = alCatelea;
	}
	
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public int getNrAniFunctie() {
		return nrAniFunctie;
	}
	public void setNrAniFunctie(int nrAniFunctie) {
		this.nrAniFunctie = nrAniFunctie;
	}
	public int getAlCatelea() {
		return alCatelea;
	}
	public void setAlCatelea(int alCatelea) {
		this.alCatelea = alCatelea;
	}
	
	
	
}
