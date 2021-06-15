package Domaci18Maj;

public class Vozac extends Covek {


	public Vozac(String imeIPrezime) {
		super(imeIPrezime);
	}

	public String zanimanje;

	public Vozac(String imeIPrezime, String zanimanje) {
		super(imeIPrezime);
		this.zanimanje = zanimanje;
	}

	public String getZanimanje() {
		return zanimanje;
	}

	public void setZanimanje(String zanimanje) {
		this.zanimanje = zanimanje;
	}
	
	
}

/*RESENJE:
	
public class Vozac extends Covek{
	
	private String zvanje;

	public Vozac(String ime, String prezime, String zvanje) {
		super(ime, prezime);
		this.zvanje = zvanje;
	}

	public String getZvanje() {
		return zvanje;
	}

	public void setZvanje(String zvanje) {
		this.zvanje = zvanje;
	}
*/	