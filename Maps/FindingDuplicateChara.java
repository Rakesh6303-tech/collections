package maps;
import java.util.*;
/*
 * Write a program to find Duplicate cCharacters in the string
 */
import java.util.Map.Entry;
public class FindDuplicateChara {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		FinduplicateChara(s);
	}
	static void FinduplicateChara(String s)
	{
	
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
		{
			
		  // Convert To Character
			char ch = s.charAt(i);
				// Check whether key already exists 
			if(map.containsKey(ch))
			{
				int c = map.get(ch);
				map.put(ch, c+1);  // key will be repeat it will be increment
			}
			// if key doesnt exists
			else
			{
				map.put(ch, 1);
			}
		}
		// Entry Sets Traversal
		Set<Entry<Character, Integer>> entries = map.entrySet();
		// e----> contain key, value
		for(Entry<Character, Integer> e: entries)
		{
			
			if(e.getValue()>1)
			{
				System.out.println(e.getKey());
			}
		}
	}

}
