package pl.edu.agh.java.exercises.arrays;

/**
 * Consider the leftmost and righmost appearances of some value in an array.
 * We'll say that the "span" is the number of elements between the two
 * inclusive. A single value has a span of 1. Returns the largest span found in
 * the given array. (Efficiency is not a priority.)
 * 
 * Przyjmijmy, że odstęp "span" danej wartości w tablicy to liczba elementów
 * pomiędzy pierwszym i ostatniem jej wystąpieniem, włączając je same. Jeśli
 * wartość pojawia się w tablicy tylko raz, jej "span" jest równe 1. Metoda
 * maxSpan powinna zwracać największy istniejący odstęp w zadanej tablicy.
 * 
 * @see http://codingbat.com/prob/p189576
 */
public class ArraySpan {
	public int maxSpan(int[] array) {
		if(array.length == 0) {
			return 0;
		}
		int maxSpan = 1;
		for(int i = 0; i < array.length-1; i++) {
			int initialSpan = 1;
			for(int j = 1; j < array.length; j++) {
				if(array[i] == array [j]) {
					initialSpan = j-i+1;
				}
			}
			if(maxSpan < initialSpan) {
				maxSpan = initialSpan;
			}
		}
		return maxSpan;
	}
}
