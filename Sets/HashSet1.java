package sets;
import java.util.*;
/*
 * HashSet--> is a Java Collection that stores Unique Elements without any specific order.
 * 
 * Duplicates-->Not Allowed
 * Null--->Accepted
 * Size---> Default size is 16 (if 75% is filled with locations Then itself will be Double
 * Hetergenous---> Yes
 * Order Of  Insertion---> No
 * Data Structure--->Hash Table,  Hashing Algorithm
 * Wasteage Of Memory---> Yes
 * Constructors---> 5
 * 
 * Data will be store in the data using Buckets
 * 
 * 
 */

public class HashSet1 {

	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
		HashSet<Integer> st = new HashSet<Integer>();
		st.add(10);
		st.add(23);
		st.add(30);
		st.add(45);
		//st.add(45);
		//st.add(null);
		for(int x:st)
		{
			System.out.println(x);
		}
		
	}

}
