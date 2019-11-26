package isi.tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class oddOrPosTest {
	int x[];
	
	//tests oddOrPos
	@Test
	public void testTodoPos(){
		 x = new int[] {1,4,3,4};
		 Object obj = ejercicios.oddOrPos(x);
		 assertTrue ("Todos los elementos positivos", obj.equals (4));
	}
	@Test
	public void testTodoNeg(){
		 x = new int[] {-1,-2,-3,-4};
		 Object obj = ejercicios.oddOrPos(x);
		 assertTrue ("Todos los elementos negativos(2 impares)", obj.equals (2));
	}
	@Test
	public void testMitad(){
		 x = new int[] {-1,-2,3,4};
		 Object obj = ejercicios.oddOrPos(x);
		 assertTrue ("Todos los elementos negativos(2 impares)", obj.equals (3));
	}
	
}
