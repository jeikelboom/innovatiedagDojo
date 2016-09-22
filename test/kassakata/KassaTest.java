package kassakata;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class KassaTest {

	Kassa kassa;
	
	@Before
	public void before() {
		kassa = new Kassa();
		kassa.setRepository(new ArtikelRepository() {
			
			@Override
			public Artikel findArtikel(String sku) {
				Artikel[] artikelLijst = {
						new Artikel(155, "zeep",  "23", "nivea"),
						new Artikel(250, "scheerzeep",  "24", "nivea"),
						new Artikel(125, "zeep",  "25", "nivea"),
				};
				
				for (Artikel artikel : artikelLijst) {
					if(artikel.getSku().equals(sku)) {
						return artikel;
					}
				}
				// TODO Auto-generated method stub
				return null;
			}
		});
	}
	
	@Test
	public void test() {
		kassa.scan("23");
		int antwoord = kassa.print();
		Assert.assertEquals(155, antwoord); 
	}
	
	@Test
	public void test2() {
		kassa.scan("23");
		kassa.scan("23");
		int antwoord = kassa.print();
		Assert.assertEquals(310, antwoord); 
	}
	
	@Test
	public void test3() {
		kassa.scan("23");
		kassa.scan("23");
		kassa.scan("25");
		
		int antwoord = kassa.print();
		Assert.assertEquals(435, antwoord); 
	}
	
	@Test
	public void test4(){
		kassa.scan("23");
		kassa.scan("24");
		kassa.scan("25");
		
		Assert.assertEquals(530, kassa.print());
	}
	
	
	
}
