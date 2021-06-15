package Domaci18Maj;

public class Glavna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Putnik putnik1 = new Putnik("Filip Filipovic", 65.0);
		Putnik putnik2 = new Putnik("Maja Manojlovic", 130.0);
		Putnik putnik3 = new Putnik("Vesa Vesic", 110.0);
		
		Vozac vozac1 = new Vozac("Kosta Kostic", "sofer");
		
		Autobus bus = new Autobus("Dunavprevoz", "Kosta Kostic", 220, "Vesa Vesic");
		
		bus.dodajPutnika(putnik1);
		bus.dodajPutnika(putnik2);
		bus.dodajPutnika(putnik3);
		bus.stampajVozaca();
		bus.stampajAutobus();
		
		System.out.println("Putnici u autobusu koji putuju sa Vama su: " + putnik1 + putnik2 + putnik3);
	}
}

/* RESENJE:

Putnik p1 = new Putnik("Bogdan", "Miricki", 1000);
Putnik p2 = new Putnik("Milan", "Milanovic", 500);

Vozac v1 = new Vozac("Dragan", "Matic", "sofer autobusa");

Autobus bus = new Autobus("Lasta", 180);

bus.dodajPutnika(p1);
bus.dodajPutnika(p2);
bus.setVozacAutobusa(v1);
bus.stampaBus();
System.out.println("________");
bus.stampaListaPutnika();

bus.stampajVozaca();

p1.oduzimanjeNovca(180);
System.out.println("_______");
bus.stampaListaPutnika();

} */