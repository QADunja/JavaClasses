package Domaci17Maj;

public class GlavniProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Sportista sportista[] = new Sportista[3];
		
		Sportista dunja = new Sportista("Dunja Ivezic", 1994);
		Sportista sanja = new Sportista("Sanja Vukasinovic", 1997);
		Sportista ivana = new Sportista("Ivana Maksimovic", 1991);
		
		sportista[0] = dunja;
		sportista[1] = sanja;
		sportista[2] = ivana;
		
		Klub k1 = new Klub ("Dunja Ivezic", 1994,"Novi Sad 1790", "Novom Sadu", 1790);
		Klub k2 = new Klub("Ivana Maksimovic", 1991, "Novi Beograd - Ušće", "Beogradu", 1997);
		
		dunja.stampaj();
		sanja.stampaj();
		ivana.stampaj();
		k1.stampaj();
		k2.stampaj(); 
	 	
	}

}