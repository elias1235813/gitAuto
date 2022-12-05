package gitAuto;

public class main {

	public static void main(String[] args) {
		// muodostetaan auto-olio
		Auto auto1 = new Auto();
		auto1.merkki = "Toyota";
		auto1.malli = "Avensis";
		auto1.bensanMaara = 10;
		auto1.naytaTiedot();
		auto1.kiihdyta();
		auto1.naytaTiedot();
		auto1.tankkaaAuto(5);
		
		// muodostetaan toinen auto-olio
		Auto auto2 = new Auto("Hyundai", "getz", 7);
		auto2.naytaTiedot();

	}

} // end of main
class Auto{
	// ominaisuudet
	String merkki;
	String malli;
	int bensanMaara = 0;
	
	// muodostimet
	public Auto()
	{
			
	}	
	public Auto(String merkinNimi, String mallinNimi, int bensaMaara)
	{
		merkki = merkinNimi;
		malli = mallinNimi;
		bensanMaara = bensaMaara;
	}
	
	//toiminnot
	public void jarruta()
	{
		System.out.println("Auto jarruttaa");
	}
	public void kiihdyta()
	{
		System.out.println("Auto kiihdyttaa");
		if (bensanMaara > 0)
		{
			bensanMaara = bensanMaara - 1;
		}
		else 
		{
			System.out.println("Bensa lopussa, et voi kiihdyttää");
		}
	}	
	public void naytaTiedot()
	{
		System.out.println(merkki);
		System.out.println(malli);
		System.out.println(bensanMaara);
	}
	public void tankkaaAuto(int tankkaa)
	{
		System.out.println("Tankissa bensaa " + bensanMaara);
		System.out.println("Tankkaus: " + tankkaa);
		bensanMaara = bensanMaara + tankkaa;
		System.out.println("Tankissa bensaa tankkauksen jälkeen " + bensanMaara);
	}
}
	
