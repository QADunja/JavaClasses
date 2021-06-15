package domaci11Maj;

public class Racun {
	
	public String brRacuna;
	
	public double stanje;
	
	public Racun () {
		
	}
	
	public Racun (String brRacuna, double stanje) {
		this.brRacuna = brRacuna;
		this.stanje = stanje;
	}
	
	public void setstanje (double stanje) {
		this.stanje = stanje;
	}
	
	public void pocetnaVrednostRacuna(double[] vrednost) {
	    double pocetnaVrednostRacuna = 0;
	}
	
	public void getstanje (double stanje) {
		this.stanje = stanje;
	}
	
	public String getbrRacuna () {
		return this.brRacuna;
	}	
	
	public void stampanjePodatakaORacunu () {
		System.out.println("Stanje na racunu je: " + this.stanje);
	}
	
}

//Napisati klasu Racun koja ima 2 atributa.
//Prvo atribut 'brRacuna' tipa String predstavlja broj racuna.
//brRacuna moze da se dohvati, ali ne i postavi
//Drugi atribut 'stanje' tipa double i predstavlja stanje na racunu
//Stanje ima pocetnu vrednost 0 i moze da se dohvati/postavi
//Napraviti metode za dodavanje i oduzimanje novca za drugi atribut
//dohvati=get
//postavi=set

/* RESENJE ZADATKA 
 
 package zadatak1;

public class Racun {

	private String brojRacuna;
	private double stanje;

	public Racun() {
		this.stanje = 0;
	}

	public String getBroj() {
		return this.brojRacuna;
	}

	public double getStanje() {
		return this.stanje;
	}

	public void dodavanjeNovca(double iznos) {

		this.stanje += iznos;

	}

	public void uzimanjeNovca(double iznos) {

		this.stanje -= iznos;
	}

}
 */

