package Domaci18Maj;

public class Autobus  {

	
	public String naziv;
	public String vozac;
	public double cenaKarte;
	public String putnik;
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getVozac() {
		return vozac;
	}
	public void setVozac(String vozac) {
		this.vozac = vozac;
	}
    public double getCenaKarte() {
		return cenaKarte;
	}
	public void setCenaKarte(double cenaKarte) {
		this.cenaKarte = cenaKarte;
	}
	public String getPutnik() {
		return putnik;
	}
	public void setPutnik(String putnik) {
		this.putnik = putnik;
	}
	
	public Autobus(String naziv, String vozac, double cenaKarte, String putnik) {
		super();
		this.naziv = naziv;
		this.vozac = vozac;
		this.cenaKarte = cenaKarte;
		this.putnik = putnik;
	}
	public void dodajPutnika(Putnik putnik1) {
		// TODO Auto-generated method stub
	}
	public void stampajVozaca() {
		System.out.println("Vozac autobusa: " + getVozac());
	}
	public void stampajAutobus() {
		System.out.println("Autobus kojim danas putujete je: " + getNaziv());
		
	}
		
	
}

/*RESENJE:
public class Autobus {
	
	private String nazivAutobusa;
	private double cenaKarte;
	private Vozac vozacAutobusa;
	private ArrayList<Putnik> listaPutnika;
	
	
	public Autobus(String nazivAutobusa, double cenaKarte) {
		super();
		this.nazivAutobusa = nazivAutobusa;
		this.cenaKarte = cenaKarte;
		this.listaPutnika = new ArrayList<Putnik>();
	}


	public String getNazivAutobusa() {
		return nazivAutobusa;
	}


	public void setNazivAutobusa(String nazivAutobusa) {
		this.nazivAutobusa = nazivAutobusa;
	}


	public double getCenaKarte() {
		return cenaKarte;
	}


	public void setCenaKarte(double cenaKarte) {
		this.cenaKarte = cenaKarte;
	}


	public Vozac getVozacAutobusa() {
		return vozacAutobusa;
	}


	public void setVozacAutobusa(Vozac vozacAutobusa) {
		this.vozacAutobusa = vozacAutobusa;
	}
	
	public void dodajPutnika (Putnik putnik) {
		listaPutnika.add(putnik);
	}
	
	public void ukloniPutnika (Putnik putnik) {
		listaPutnika.remove(putnik);
	}
	
	public void stampaBus () {
		System.out.println("Dobrodosli u autobus autoprevoznika: " + this.nazivAutobusa);
		System.out.println("Cena karte iznosi: " + this.cenaKarte + " dinara.");
	}
	
	public void stampaListaPutnika () {
		System.out.println("Lista putnika je: ");
		for (int i = 0; i < this.listaPutnika.size(); i++) {
			System.out.println(listaPutnika.get(i).getIme() + " " + listaPutnika.get(i).getPrezime() + " i ima novca " + listaPutnika.get(i).getNovac() + " dinara");
			
		}
	}
	
	public void stampajVozaca () {
		System.out.println("Vozac autobusa je: " + vozacAutobusa.getIme() + " " + vozacAutobusa.getPrezime());
	}
*/