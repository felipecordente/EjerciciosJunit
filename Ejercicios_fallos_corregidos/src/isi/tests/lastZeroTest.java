package isi.tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class lastZeroTest {
	int x[];
	
	@Test
	public void testSoloUnCero(){
		 x = new int[] {0,2,3,4};
		 Object obj = ejercicios.lastZero(x);
		 assertTrue ("1 cero en la primera posicion", obj.equals (0));
	}
	
	@Test
	public void testSoloUnCeroFinal(){
		 x = new int[] {1,2,3,0};
		 Object obj = ejercicios.lastZero(x);
		 assertTrue ("un cero en la ultima posicion", obj.equals (3));
	}
	
	@Test
	public void testVariosCeros(){
		 x = new int[] {1,0,1,0};
		 Object obj = ejercicios.lastZero(x);
		 assertTrue ("2 ceros", obj.equals (3));
	}
		
}
