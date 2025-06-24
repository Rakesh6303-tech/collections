package maps;
import java.util.*;
/*
 * Write a program to remove the duplicate words in the string and occurence of string
 */
import java.util.Map.Entry;
public class WordOccurenceMore3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		OccurenceGreaterThree(s);
	}
	static void OccurenceGreaterThree(String s)
	{
		// Split the String 
		String ar [] = s.split(" ");
		Map<String,Integer> map = new LinkedHashMap<String,Integer>();
		for(int i=0;i<ar.length;i++)
		{
			
			// Check whether key already exists 
			if(map.containsKey(ar[i]))
			{
				int c = map.get(ar[i]);
				map.put(ar[i], c+1);  // key will be repeat it will be increment
			}
			// if key doesnt exists
			else
			{
				map.put(ar[i], 1);
			}
		}
		// Entry Sets Traversal
		Set<Entry<String, Integer>> entries = map.entrySet();
		// e----> contain key, value
		for(Entry<String, Integer> e: entries)
		{
			// For Unique String Occured in the given string
			// if(e.getValue()==1)
			// {
			// 	System.out.println(e.getKey());
			// }
				
			// String Greater Than 1 will be occured
//			if(e.getValue()>1)
//			{
//				System.out.println(e.getKey());
//			}
			// Occurence of Words 
			//System.out.println(e.getKey()+": "+ e.getValue());
			
			// Remove Duplicate Words
			System.out.println(e.getKey());
		}
	}

}
