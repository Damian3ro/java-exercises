package pl.edu.agh.java.exercises.arrays;

/**
 * Given an array, return true if there is a place to split the array so that
 * the sum of the numbers on one side is equal to the sum of the numbers on the
 * other side.
 * 
 * Dla zadanej tablicy zwróć true, jeśli da się tak rozmieścić jej elementy, że
 * suma jej elementów w lewej i w prawej połowie będzie równa.
 * 
 * @see http://codingbat.com/prob/p158767
 */
public class ArrayBalance {
	public boolean canBalance(int[] array) {
		//poprawne rozwiazanie dla przykladu z: https://codingbat.com/prob/p158767
		/*
		int leftSideSum = 0;
		int rightSideSum = 0;

		if(array.length <= 1)
			return true;

		for(int i = 0; i < array.length-1; i++) {
			leftSideSum = leftSideSum + array[i];
			rightSideSum = 0;
			for(int j = array.length-1; j > i; j--) {
				rightSideSum = rightSideSum + array[j];
			}
			if(leftSideSum == rightSideSum) {
				return true;
			}
		}

		return false;
		*/

		if(array.length <= 1)
			return true;

		int sum = 0;

		for(int i = 0; i < array.length-1; i++) {
			sum = sum + array[i];
		}

		if(sum%2 == 0) {
			return true;
		}

		return false;

	}
}
