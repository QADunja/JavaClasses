package Domaci17Maj;

public class Sportista {

	public String imeIPrezime;
	public int godRodjenja;
	
	public Sportista(String imeIPrezime, int godRodjenja) {
		this.imeIPrezime = imeIPrezime;
		this.godRodjenja = godRodjenja;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public int getGodRodjenja() {
		return godRodjenja;
	}
	
	public void stampaj() {
		System.out.println(this.imeIPrezime + ": " + this.godRodjenja);
	}
	
}

/*	Domaci 17.05.2021.
 
  Sportista poseduje ime, prezime i godinu rodjenja. Ime, prezime i godina rodjenja se
zadaju prilikom kreiranja i ne mogu da se promene. Sportistu ispisati u obliku:

IME_PREZIME: godinaRodjenja

Klub poseduje naziv, sediste (grad), godinu osnivanja i sportistu. Sva polja mogu da se
dohvate, a naziv kluba moze i da se postavi.

Napisati glavni program, gde cete testirati kako ove klase funkcionisu.

Dodatak zadatku za vezbu: U Klubu napraviti niz sportista tipa Sportista umesto jednog sportiste.
Samim tim postojace metode koje ce dodavati i uklanjati sportistu. */