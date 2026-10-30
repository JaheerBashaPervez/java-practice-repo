package prep;

import java.util.Optional;
import java.util.stream.Stream;


public class streamsPractice {

	public static void main(String[] args) {
//		Stream<String> streamEmpty = Stream.empty();		
//		streamEmpty = Stream.of("a", "b", "c");		
//		System.out.println((streamEmpty.filter(s->s.equals("b"))).count());
		
		Optional<String> s = Optional.of("test");
		if(Optional.of("TEST").equals( s.map(String::toUpperCase))) {
			System.out.println("True");
			
		}

	}

}
