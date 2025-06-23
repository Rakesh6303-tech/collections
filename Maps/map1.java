package maps;
//import java.security.KeyStore.Entry;
import java.util.*;
/*
 * Map----> Is An Interface that represents Collection of Key Value Pairs 
 *          Where Each key Assoicated with a Value.
 *          
 *<-----------Methods---------->
 *   put(object key, object value);
 *   remove(object key)---> if pass key it will remove key as well as value based on ur mention
 *   putall(map m) -->  It will put another key, values pairs 
 *   clear()----> remove Entire Keys and values in ur code
 *   size()--->How many Entires are There
 *   get(Object key)----> return the value
 *   ContainsKey(Object key)----> Whether Key is Present or not in our Entires if there return true, no false
 *   ContainsValue(object value)---> Whether value is present or not if there return true, false
 *   KeySet()--> return all keys
 *   Values()---> return all values
 *   entrySet()---> return all key, value
 *   isEmpty()----> Whether data is or not
 *   getKey()-----> 
 *   getValue()--->
 *          
 */

public class Map1 {

	private static Set keySet;

	public static void main(String[] args) {
		
	   Map<String, Object> map = new HashMap<>();
		map.put("india", 5000);
		map.put("string", 8200);
		map.put("1", 783);
		map.put("false", "rakesh");
		map.put("fal", 4563);
		map.put("true", "rakesh");
		
		//System.out.println(map);
		
		//System.out.println(map.entrySet());
		//System.out.println(map.containsValue());
	//	System.out.println(map.getKey());
		
//		System.out.println(map.keySet());  // only keys
//		System.out.println(map.values());  // only values
//		// We Will Get Only Keys Here
		//Set<String> keys = map.keySet();    // ctrl+2
		//Set<String> keys = map.values();
//		Set<String> keys = map.keySet();
//		for (String key : keys) {
//		    Object value = map.get(key);  // for values
//		    System.out.println(key + ": " + value);    // combine key and values
//		}
		// Every entry
		 Set<Map.Entry<String, Object>> entries = map.entrySet();
	        for (Map.Entry<String, Object> e : entries) {
	            System.out.println(e.getKey() + ": " + e.getValue());
		

		
		
	        }	

	}

}
