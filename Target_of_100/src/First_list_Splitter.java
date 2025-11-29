import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class First_list_Splitter {
	public static void main(String[] args) {
		List<Integer> s= Arrays.asList(8,6,4,3,7,3,1,4,9);
		
		Spliterator<Integer> sout = s.stream().spliterator().trySplit();
		
		sout.forEachRemaining(System.out::println);//It is split approximately in half, like this:
	}

}
