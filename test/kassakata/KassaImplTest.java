package kassakata;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class KassaImplTest {

	KassaImpl kassa;
	
	@Before
	public void before() {
		kassa = new KassaImpl();
		kassa.setRepository(new MockedArtikelRepository());
	}
	
	@Test
	public void test() {
		kassa.scan("23");
		int antwoord = kassa.totaal();
		Assert.assertEquals(125, antwoord); 
	}
	
	@Test
	public void test2() {
		kassa.scan("23");
		kassa.scan("23");
		int antwoord = kassa.totaal();
		Assert.assertEquals(250, antwoord); 
	}
	
	@Test
	public void test3() {
		kassa.scan("23");
		kassa.scan("23");
		kassa.scan("25");
		
		int antwoord = kassa.totaal();
		Assert.assertEquals(500, antwoord); 
	}
	
	@Test
	public void test4(){
		kassa.scan("23");
		kassa.scan("24");
		kassa.scan("25");
		
		Assert.assertEquals(530, kassa.totaal());
	}
	
	
	
}
