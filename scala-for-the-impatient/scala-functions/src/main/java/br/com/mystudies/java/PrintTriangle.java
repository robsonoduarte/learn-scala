package br.com.mystudies.java;

import static java.util.Arrays.asList;
import static java.util.stream.IntStream.range;
import static org.apache.commons.lang3.StringUtils.repeat;

// USING THE TRADITIONAL EXERCISE OF PROGRAMMING FOR COMPARE THE JAVA/SCALA AND JAVA EVOLUTION
public class PrintTriangle {

	public static void main(String[] args) {

		// UNTIL THE JAVA 7

		// traditional form with nested Loops
		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}


		// simplifying using the org.apache.commons.lang3.StringUtils.repeat ->> http://goo.gl/Bho0sM
		for (int i = 1; i < 10; i++) {
			System.out.println(repeat('*', i));
		}



		// JAVA 8 STREAM API

		// using the stream method ->> http://goo.gl/u6yatS
		asList(1,2,3,4,5,6,7,8,9)
			.stream()
			.map(n -> repeat('*', n))
			.forEach(System.out::println);



		// using the range method ->> http://goo.gl/KNXnyc
		range(1, 10)
			.mapToObj(n -> repeat('*', n))
			.forEach(System.out::println);
	}

}
