package programs;
import java.util.*;
public class printorderofoccurencestring {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String s = scan.nextLine();
	    Removeduplicateurls(s);
	  }
	  public static void Removeduplicateurls(String s)
	  {
		  // it will split the string where space is avaliable
	    String ar [] = s.split(" ");
	    // it will remove the dupliate and print order of occurence
	    LinkedHashSet<String> set = new LinkedHashSet<String>();
	    // the string array will intial to ending in for each loop
	    for(String xv:ar)
	    {
	    	// the duplcate values will remove and the store single value
	      set.add(xv);
	    }
	    // Entire  values are stored in the set and we will print the one by one value 
	    for(String  x:set)
	    {
	      System.out.print(x  + " ");
	    }
	  }
	  
	}

