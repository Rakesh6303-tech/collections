package lists;
import java.util.*;
/*
 * Collections.sort is not sort the data, C.S calls the Sort(Don't know how to compare) --> call the CompareTo() so CompareTo() sort the data
 * And Return The Data to the Collections.sort()
 */
public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList set = new ArrayList<Integer>();
		set.add(10);
		set.add(30);
		set.add(47);
		set.add(20);
		set.add(8);
		set.add(88);
		// Used To find The Minimum Value
		System.out.println(Collections.min(set));
		// Used To Find The Maximum Value
		System.out.println(Collections.max(set));
		// Frequency of Array Elements
		System.out.println(Collections.frequency(set, 88));
		System.out.println(set);
         // Data Can be Jumbled into in order
		Collections.shuffle(set);
		System.out.println(set);
		// Sort The Data Without Using the TreeSet
		Collections.sort(set);
		System.out.println(set);
	
	}
	}
