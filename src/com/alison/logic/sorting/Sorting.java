package com.alison.logic.sorting;

/**
 * Math Sorting
 * @author Alison Augusto Miranda Pereira
 *
 */
public class Sorting {

	/**
	 * Sorts a given array using the Bubble Sort algorithm
	 * 
	 * @param items the array to be sorted
	 * @return a {@link Long} which represents the factorial
	 */
	void bubbleSort(final int[] items) {
		int temp;

		for (int i = 0; i < items.length - 1; i++) {
			for (int j = 1; j < items.length - i; j++) {

				if (items[j] < items[j - 1]) {
					temp = items[j];
					items[j] = items[j - 1];
					items[j - 1] = temp;
				}

			}
		}
	}
	
	/**
	 * Main method used only to run and validate the class methods
	 *  
	 */
	public static void main(String[] args) {
		Sorting sorting = new Sorting();
		int[] items = { 5, 3, 2, 4, 7, 1, 0, 6 };
		
		sorting.bubbleSort(items);
		
		StringBuilder results = new StringBuilder();
		
		for (int i = 0; i < items.length; i++) {
			results.append("[" +  items[i] + "] - ");
		}
		
		System.out.println("Final array: " + results.toString());
	}

}
