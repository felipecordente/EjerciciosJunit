package isi.tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class countPositiveTest {
	int x[];
	
	//2)En el siguiente test no se llega a ejecutar el fallo
	@Test
	public void testNull(){
		 x = null;
		 try {
			 ejercicios.countPositive(x);
		 }catch(NullPointerException e){
			 return;
		 }
		 fail("NullPointerException expected");
	}
	
	//3)ejecuta el fallo, pero la salida  es la esperada
	@Test
	public void testTodoPositivo(){
		 x = new int[] {1,2,3,4};
		 Object obj = ejercicios.countPositive(x);
		 assertTrue ("4 elementos positivos", obj.equals (4));
	}
	
	//3)ejecuta el fallo, pero la salida  es la esperada
	@Test
	public void testTodoNegativo(){
		 x = new int[] {-1,-2,-3,-4};
		 Object obj = ejercicios.countPositive(x);
		 assertTrue ("0 elementos positivos", obj.equals (0));
	}
	
	//3)ejecuta el fallo, pero la salida  es la esperada
	@Test
	public void testMitadPosNeg(){
		 x = new int[] {1,2,-3,-4};
		 Object obj = ejercicios.countPositive(x);
		 assertTrue ("2 elementos positivos", obj.equals (2));
	}
	
	//3)ejecuta el fallo, pero la salida  es la esperada
	@Test
	public void testConCeros(){
		 x = new int[] {0,2,-3,2};
		 Object obj = ejercicios.countPositive(x);
		 assertTrue ("2 elementos positivos", obj.equals (2));
	}

	//4)no se puede obtener en este caso un error en el estado y no encontrar una disfunción
}
