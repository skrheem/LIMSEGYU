package chap12;

import java.util.*;
import java.util.stream.*;

public class Etc2StreamDemo {

	public static void main(String[] args) {
		IntStream is1 = IntStream.iterate(1, x -> x + 2);
		
		IntStream is2 = new Random().ints(0, 10);
		
		Stream<Double> ds = Stream.generate(Math::random);
		
		IntStream is3 = IntStream.range(1, 5);
	}

}
