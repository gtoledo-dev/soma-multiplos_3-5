package somaDosMultiplos3Ou5;

import java.util.stream.IntStream;

public class SomaDosMultiplosApplication {

	public static void main(String[] args) {
		
		System.out.print("Multiplos de 3 e 5 abaixo de 10: ");
		IntStream.range(1, 10).filter(n -> (n % 3 == 0) || (n % 5 == 0))
		.forEach(n -> System.out.print(n + " "));
		
		int x = IntStream.range(1, 10).filter(n -> (n % 3 == 0) || (n % 5 == 0)).sum();
		
		System.out.println();
		System.out.println("Soma dos multiplos: " + x);

	}

}
