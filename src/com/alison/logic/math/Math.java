package com.alison.logic.math;

/**
 * Math Class
 * @author Alison Augusto Miranda Pereira
 *
 */
public class Math {
	
	/**
	 * Calculates the factorial of a given number
	 * 
	 * @param number represents the number which the factorial will be calculated from
	 * @return a {@link Long} which represents the factorial
	 */
	public Long calculteFactorialOf(Long number) {

		if (number <= 1) {
			return 1L;
		}

		return number * this.calculteFactorialOf(number - 1);
	}
	
	/**
	 * Calculates the sum of all multiples of 3 or 5 which are lower than the parameter maximum value
	 *  
	 * @param maximumValue the stop condition for the sum operation, are multiples must lower the maximum value
	 * @return a {@link Long} which represents the sum of all multiples of 3 or 5
	 */
	public Long sumMultiplesOf3Or5LowerThan(Long maximumValue) {

		Long sum = 0L;
		Long counter = 3L;

		while (counter < maximumValue) {
			if (counter % 3 == 0 || counter % 5 == 0) {
				sum += counter;
			}
			counter++;
		}

		return sum;

	}
	
	
	/**
	 * Main method used only to run and validate the class methods
	 *  
	 */
	public static void main(String[] args) {
		Math math = new Math();

		System.out.println("Factorial of 1 is: " + math.calculteFactorialOf(1L));
		System.out.println("Factorial of 2 is: " + math.calculteFactorialOf(2L));
		System.out.println("Factorial of 3 is: " + math.calculteFactorialOf(3L));
		System.out.println("Factorial of 4 is: " + math.calculteFactorialOf(4L));
		System.out.println("Factorial of 5 is: " + math.calculteFactorialOf(5L));
		System.out.println("Factorial of 6 is: " + math.calculteFactorialOf(5L) + "\n\n");
		
		
		System.out.println("Sum of multiples of 3 or 5 lower than 10 is " + math.sumMultiplesOf3Or5LowerThan(10L));
		

	}

}
