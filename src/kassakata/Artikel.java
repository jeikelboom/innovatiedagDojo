package kassakata;

public class Artikel {

	private int prijs;
	private String artikelgroep;
	private String sku;
	private String merk;

	public Artikel(int prijs, String artikelgroep, String sku, String merk) {
		super();
		this.prijs = prijs;
		this.artikelgroep = artikelgroep;
		this.sku = sku;
		this.merk = merk;
	}

	public int getPrijs() {
		return prijs;
	}

	public String getArtikelgroep() {
		return artikelgroep;
	}

	public String getSku() {
		return sku;
	}

	public String getMerk() {
		return merk;
	}
	
	
}
