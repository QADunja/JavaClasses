package Domaci17Maj;

public class Klub extends Sportista {

	public String nazivKluba;
	public String gradKluba;
	public int godOsnivanja;
	
	public Klub(String imeIPrezime, int godRodjenja, String nazivKluba, String gradKluba, int godOsnivanja) {
		super(imeIPrezime, godRodjenja);
		this.nazivKluba = nazivKluba;
		this.gradKluba = gradKluba;
		this.godOsnivanja = godOsnivanja;
	}

	public String getNazivKluba() {
		return nazivKluba;
	}

	public void setNazivKluba(String nazivKluba) {
		this.nazivKluba = nazivKluba;
	}

	public String getGradKluba() {
		return gradKluba;
	}

	public int getGodOsnivanja() {
		return godOsnivanja;
	}
	
	public void stampaj() {
		System.out.println(this.nazivKluba + " se nalazi u " + this.gradKluba + " i osnovan je " + this.godOsnivanja);
	}
	
}

/* Klub poseduje naziv, sediste (grad), godinu osnivanja i sportistu. Sva polja mogu da se
dohvate, a naziv kluba moze i da se postavi.

Dodatak zadatku za vezbu: U Klubu napraviti niz sportista tipa Sportista umesto jednog sportiste.
Samim tim postojace metode koje ce dodavati i uklanjati sportistu. */


