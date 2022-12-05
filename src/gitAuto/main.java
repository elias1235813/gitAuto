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

	}

} // end of main
class Auto{
	// ominaisuudet
	String merkki;
	String malli;
	int bensanMaara = 0;
	
	//toiminnot
	public void jarruta()
	{
		System.out.println("Auto jarruttaa");
	}
	public void kiihdyta()
	{
		System.out.println("Auto kiihdyttaa");
		bensanMaara = bensanMaara - 1;
	}	
	public void naytaTiedot()
	{
		System.out.println(merkki);
		System.out.println(malli);
		System.out.println(bensanMaara);
	}
}
	
