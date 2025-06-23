package programs;
import java.util.*;
/*
 * Write a program to remove the duplicate string and print insertion order--->LinkedHashSet
 * 
 * Write a program to remove the duplicate string and print insertion order--->TreSet
 */
public class RemoveDuplctStrings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		RemoveDuplicateString(input);
	}
	static void RemoveDuplicateString(String input)
	{
		String ar [] = input.split(" ");
	//	Set<String> set = new LinkedHashSet<String>();
		Set<String> set = new TreeSet<String>();
		

		for(int i=0;i<ar.length;i++)
		{
			set.add(ar[i]);
		}
		for(String s:set)
		{
			System.out.print(s+" ");
		}
	}

}
