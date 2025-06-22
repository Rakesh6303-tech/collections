package programs;
import java.util.*;
public class RemoveDuplcateChar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		RemoveDuplicateChar(s);
	}
	public static void RemoveDuplicateChar(String s)
	{
		// use LHS it uses for the remove duplicates and follow the insertion order
		Set<Character> set = new LinkedHashSet<Character>();
		// set traversal 
		for(int i=0;i<s.length();i++)
		{
			// in the all duplicates will remove
			set.add(s.charAt(i));
		}
		// it will print one by one char without repeating 
		for(char c :set)
		{
			System.out.print(c);
		}
	}

}
