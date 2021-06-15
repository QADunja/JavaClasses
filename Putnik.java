package Domaci18Maj;

public class Putnik extends Covek {

	public Putnik(String imeIPrezime, double novac) {
		super(imeIPrezime);
		this.novac = novac;
	}	

	public double novac;

	public double getNovac() {
		return novac;
	}

	public void setNovac(double novac) {
		this.novac = novac;
	}
	
	public void dodajNovac(double dodajNovac) {
		this.novac += dodajNovac;
	}
	
	public void oduzmiNovac(double oduzmiNovac) {
		double cenaKarte = 0;
		this.novac = oduzmiNovac - cenaKarte ;
	}
}
/*RESENJE:
public class Putnik extends Covek {

	private double novac;

	public Putnik(String ime, String prezime, double novac) {
		super(ime, prezime);
		this.novac = novac;
	}

	public double getNovac() {
		return novac;
	}

	public void setNovac(double novac) {
		this.novac = novac;
	}

	public void dodavanjeNovca(double dodajNovac) {
		this.novac += dodajNovac;
	}

	public void oduzimanjeNovca(double cenaKarte) {
		this.novac = this.novac - cenaKarte;

	}
}
*/
