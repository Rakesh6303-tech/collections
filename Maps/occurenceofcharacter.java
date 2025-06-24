package maps;
import java.util.*;
import java.util.Map.Entry;
public class OccurenceOfChara {

	private static Set<Entry<Character, Integer>> entrySet;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		OccurenceCharacter(input);
	}
	static void OccurenceCharacter(String input)
	{
		// LinkedHashMap -->Insertion Order  , Key value pairs
		// 
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		// Traversal The String
		for(int i=0;i<input.length();i++)
		{
			// Conert String into character
			char ch = input.charAt(i);
			// if key already exists
			if(map.containsKey(ch))
			{
				// we have to fetch the value(Integer)
				int c = map.get(ch);
				// The value will be incremented
				map.put(ch, c+1);
			}
			//if key Doesnt Exists we have to put, and count(value) become 1
			else
			{
				map.put(ch,1);
			}	
		}
		// For Storing the New String
		String t = "";
		// Traversal THe Map using entrySet
		Set<Entry<Character, Integer>> entries = map.entrySet();
		for(Entry<Character, Integer> e : entries)
		{
			t = t + e.getKey() + e.getValue() ;
		}
		System.out.println(t);
		
		
		
	}

}
