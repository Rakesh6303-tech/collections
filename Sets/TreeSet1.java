package sets;
import java.util.*;

/*
 * TreeSet ---> is a Java collection that store unique elements in sorted Ascending order using a Red-Black-Tree
 * 
 * TreeSet is Presented In Java.util.*;
 * It follow The LVR Rule --->(Left Value To Right)
 * 
 * -------Properties------
 * 
 * No Default Size
 * No Waste of Memory
 * Memory Allocation--->Dispatched like Graph
 * Duplicates Not Allowed
 * Follow Ascending order
 * Null Values are Not Accepted
 * Homogenous Data Will Stored
 * Heterogenous Data Not Accepted
 * Order of Insertion is not Participated
 * Constructor-->5
 * Data Structure---> Balanced Binary Search Tree
 * 
 * ------------> Methods----------->
 * ceiling ---> sop(ad.ceiling(10); --> it will be print otherwise > value
 * floor----> print user mention value or otherwise it will be print < value
 * Lower----> It will Print Directly Less Value
 * headSet()---> It will print remaining before headset values
 * tailset()---> It will print after tailset values
 * subset(_)---> It will print range values based on urs --->sop(ts.subset(20,40));---> Op: 30
 * 
 * 
 */
public class TreeSet1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar [] = new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		sortElements(ar);
	}
	static void sortElements(int ar [])
	{
		TreeSet<Integer> set = new TreeSet<Integer>();
		for(int v:ar)
		{
			set.add(v);
		}
		for(int value:set)
		{
			System.out.print(value +" ");
		}
	}

}
