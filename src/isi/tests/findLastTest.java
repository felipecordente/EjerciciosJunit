package isi.tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class findLastTest {
	int x[];
	int y;
	
	@Test
	public void testPrimeraPosicion(){
		 x = new int[] {1,2,3,4};
		 y = 1;
		 Object obj = ejercicios.findLast(x,y);
		 assertTrue ("Elemento que busacmos esta en la primera posicion", obj.equals (0));
	}
	@Test
	public void testSegundaPosicion(){
		 x = new int[] {1,2,3,4};
		 y = 2;
		 Object obj = ejercicios.findLast(x,y);
		 assertTrue ("Elemento que busacmos esta en la segunda posicion", obj.equals (1));
	}
	@Test
	public void testUltimaPosicion(){
		 x = new int[] {1,2,3,4};
		 y = 4;
		 Object obj = ejercicios.findLast(x,y);
		 assertTrue ("Elemento que busacmos esta en la ultima posicion", obj.equals (3));
	}
	@Test
	public void testVariosElementos(){
		 x = new int[] {1,4,3,4};
		 y = 4;
		 Object obj = ejercicios.findLast(x,y);
		 assertTrue ("Elemento que busacmos esta en la ultima posicion", obj.equals (3));
	}

}
