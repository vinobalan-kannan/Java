package practise;

import java.util.ArrayList;
import java.util.List;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class FilterNamesWithLetter {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		names.add("BeStoic");
		names.add("Adament");
		names.add("Consistency");
		names.add("FocusOnPath");
		names.add("Belief");

//		int count = 0;
//
//		for (int i = 0; i < names.size(); i++) {
//
//			String j = names.get(i);
//
//			if (j.startsWith("B")) {
//
//				count++;
//			}
//		}
//
//		System.out.println(count);
//		
		
		
		names.stream().filter(s->s.startsWith("B")).forEach(s->System.out.println(s));
		
		names.stream().filter(s->s.startsWith("B")).limit(1).forEach(s->System.out.println(s));
		
	}
	

}
