package sets;
import java.util.*;
/*
 * LinkedHashSet--> is a Java Collection that Stores Unique Elements while Maintaining the Insertion Order
 * 
 * 
 * ---->Properties---->
 * Follow----->Insertion Order
 * Duplicates--->Not Allowed
 * No Size
 * Null values----> not Accepted
 * Hetergenous Elements are Stored
 * Follow  ---> OI
 * Index ---> No
 * Insert at random Location---> Not Good
 * DataStructure---->HashTable
 * Constructors----->5
 * MemoryAllocation-->Continue
 * 
 * 
 * ----> Methods----->
 * 
 * 
 */
public class LinkedHashSet1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar [] = new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for(int v:ar)
		{
			set.add(v);
		}
		for(int num:set)
		{
			System.out.print(num +" ");
		}		
	}

}
