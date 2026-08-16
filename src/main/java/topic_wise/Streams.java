package topic_wise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("BeStoic");
		names.add("Adament");
		names.add("Consistency");
		names.add("FocusOnPath");
		names.add("Belief");

		names.stream().filter(s -> s.startsWith("B")).forEach(s -> System.out.println(s)); // filter on prefix

		names.stream().filter(s -> s.startsWith("B")).limit(1).forEach(s -> System.out.println(s)); // filter only 1

		long d = Stream.of("stoic", "repetation").filter(a -> a.endsWith("c")).count();

		System.out.println(d);
	}

}
