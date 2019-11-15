package isi.tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class countPositiveTest {
	int x[];
	
	@Test
	public void testTodoPositivo(){
		 x = new int[] {1,2,3,4};
		 Object obj = ejercicios.countPositive(x);
		 assertTrue ("4 elementos positivos", obj.equals (4));
	}
	
	@Test
	public void testTodoNegativo(){
		 x = new int[] {-1,-2,-3,-4};
		 Object obj = ejercicios.countPositive(x);
		 assertTrue ("0 elementos positivos", obj.equals (0));
	}
	
	@Test
	public void testMitadPosNeg(){
		 x = new int[] {1,2,-3,-4};
		 Object obj = ejercicios.countPositive(x);
		 assertTrue ("2 elementos positivos", obj.equals (2));
	}
	
	@Test
	public void testConCeros(){
		 x = new int[] {0,2,-3,2};
		 Object obj = ejercicios.countPositive(x);
		 assertTrue ("2 elementos positivos", obj.equals (2));
	}

}
