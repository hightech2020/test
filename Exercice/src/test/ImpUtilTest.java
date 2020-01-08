package test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class ImpUtilTest {
	
	ImpUtil iu = new ImpUtil();
	

	@Test
	void testProd() {
		//fail("Not yet implemented");
		assertEquals(24,iu.prod(3, 8));
	}

	@Test
	void testDiv() {
		//fail("Not yet implemented");
		assertEquals(6,iu.div(6, 1));
	}

	@Test
	void testAdd() {
		//fail("Not yet implemented");
		assertEquals(9, iu.add(6, 3));
	}

	@Test
	void testSoustr() {
		//fail("Not yet implemented");
		assertEquals(9,iu.soustr(19, 10));
	}

	@Test
	void testPGCD() {
		//fail("Not yet implemented");
		assertEquals(15, iu.PGCD(15, 45));
	}

	@Test
	void testFact() {
		//fail("Not yet implemented");
		assertEquals(120,iu.Fact(5));
	}

	@Test
	void testBin() {
		//fail("Not yet implemented");
		assertEquals("1111",iu.bin(15));
		
	}
	@Test
	/*void test_exception() {
		Exception exception = assertThrows(ArithmeticException.class,() -> iu.div(1, 0));
		assertEquals("/ by zero", exception.getMessage());
		assertTrue(exception.getMessage().contains("zero"));
	}*/
	
	void testestPair() {
		assertTrue(iu.estPaire(12));
	}

}
