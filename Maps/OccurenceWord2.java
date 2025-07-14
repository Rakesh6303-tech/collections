package com.tap.supai;
import java.util.*;
public class CountWords {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		countWordEach(input);
}
	static void countWordEach(String input)
	{
		Map<String,Integer> map = new TreeMap<String,Integer>();
		for(String word : input.split(" "))
		{
			if(map.containsKey(word))
			{
				map.put(word, map.get(word)+1);
			}
			else {
				map.put(word, 1);
			}
		}
		System.out.println(map);
		
 	}

}
