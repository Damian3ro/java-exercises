package pl.edu.agh.java.exercises.arrays;

/**
 * Given n>=0, create an array length n*n with the following pattern, shown here
 * and in the unit tests: for n=3 : {0, 0, 1, 0, 2, 1, 3, 2, 1}
 * 
 * Dla zadanego n>=0 zwróć tablicę o długości n*n utworzoną wg wzoru podanego
 * tutaj oraz w testach jednostkowych: dla n=3: {0, 0, 1, 0, 2, 1, 3, 2, 1}
 * 
 *
 * @see http://codingbat.com/prob/p155405
 */
public class ArraySquareUp {
	public int[] squareUp(int n) {
		if(n == 0) {
			return new int[0];
		}

		int[] tab = new int[n*n];
		int multiplier = n;

		for(int i = multiplier; i > 0; i--) {
			int initialNumber = 1;
			for(int j = (n * multiplier)-1; j > (n * (multiplier-1))-1; j--) {
				if(initialNumber <= multiplier) {
					tab[j] = initialNumber;
					initialNumber++;
				} else {
					tab[j] = 0;
				}
			}
			multiplier--;
		}
		return tab;
	}
}
