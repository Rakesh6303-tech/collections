package programs;
import java.util.*;
/*
 * Finding minimum value and maximum value
 */
public class minvalue {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(23);
		al.add(45);
		al.add(34);
		al.add(90);
		System.out.println(Collections.min(al));
		System.out.println(Collections.max(al));
	}

}
