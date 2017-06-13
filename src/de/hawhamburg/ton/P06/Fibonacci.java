/**
 * Fibonacci.java
 * @author Ferdinand Trendelenburg.
 * @author Thorben Schomacker.
 */
package de.hawhamburg.ton.P06;

import java.util.stream.Stream;

/**
 * @author Thorben
 *
 */
public class Fibonacci {

	public static void main(String[] args) {
		Stream.generate(Fibonacci::collatz).
		limit(25).
		forEach(System.out::println);

	}

	static int n = 0;

	private static int fibonacci() {
		int x = 0, y = 1, z = 1;
		for (int i = 0; i < n; i++) {
			x = y;
			y = z;
			z = x + y;
		}

		n++;
		return x;
	}

	static int c = 5;

	private static int collatz() {
		if(c == 0){
			c = 0;
		}else if (c % 2 == 0) {
			c = c / 2;
		} else {
			c = 3 * c + 1;
		}

		return c;
	}

}
