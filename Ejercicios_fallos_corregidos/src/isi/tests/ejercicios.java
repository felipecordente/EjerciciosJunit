package isi.tests;

public class ejercicios {
	/**
	* Counts positive elements in array
	*
	* @param x array to search
	* @return number of positive elements in x
	* @throws NullPointerException if x is null
	*/
	public static int countPositive (int[] x){
		int count = 0;
		for (int i=0; i < x.length; i++){
			if (x[i] > 0){
				count++;
			}
		}
		return count;
	}
	
	/**
	* Find LAST index of zero
	*
	* @param x array to search
	* @return index of last 0 in x; -1 if absent
	* @throws NullPointerException if x is null
	*/
	public static int lastZero (int[] x){
		int pos = -1;
		for (int i = 0; i < x.length; i++){
			if (x[i] == 0){
				pos = i;
			}
		}
		return pos;
	}
	
	/**
	* Find last index of element
	*
	* @param x array to search
	* @param y value to look for
	* @return last index of y in x; -1 if absent
	* @throws NullPointerException if x is null
	*/
	public static int findLast (int[] x, int y){
		for (int i=x.length-1; i >= 0; i--){
			if (x[i] == y){
				return i;
			}
		}
		return -1;
	}
	
	/**
	* Count odd or positive elements in an array
	*
	* @param x array to search
	* @return count of odd or positive elements in x
	* @throws NullPointerException if x is null
	*/
	public static int oddOrPos (int[] x){
		int count = 0;
		for (int i = 0; i < x.length; i++){	
			if (Math.abs(x[i]%2) == 1 || x[i] > 0){
				count++;
			}
		}
		return count;
	}
}
