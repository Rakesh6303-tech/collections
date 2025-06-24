package maps;
import java.util.*;
import java.util.Map.Entry;
public class MxmNubrOfString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		MxmumNumberOccString(s);
	}
	static void MxmumNumberOccString(String s)
	{
		String ar [] = s.split(" ");
		Map<String,Integer> map = new LinkedHashMap<String,Integer>();
		for(int i=0;i<ar.length;i++)
		{
			if(map.containsKey(ar[i]))
			{
				int c = map.get(ar[i]);
				map.put(ar[i], c+1);
			}
			else
			{
				map.put(ar[i], 1);
			}
		}
		// Traversal the Entry Set
		Set<Entry<String, Integer>> entries = map.entrySet();
		// Value
		int max=0;
		// key
		String maxkey=null;
		for(Entry<String, Integer> e : entries)
		{
			if(e.getValue()>max)
			{
				// store value into the max
				max = e.getValue();
				// store key into the maxkey
				maxkey = e.getKey();
			}
		}
		// print the final answer
		System.out.println(maxkey+":"+max);
	}

}
