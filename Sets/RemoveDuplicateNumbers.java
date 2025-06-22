package programs;
import java.util.*;
public class RemoveDuplicates {
public static void main(String args [])
{
	Scanner scan  = new Scanner (System.in);
	System.out.println("Enter the N value: ");
	int n = scan.nextInt();
	int ar [] = new int [n];
	System.out.println("Enter the values: ");
	for(int i=0;i<ar.length;i++)
	{
		ar[i]=scan.nextInt();
	}
	// HashSet Doesnt follow the insertion order nd remove the duplicates values
	HashSet<Integer> set = new HashSet<Integer>();
	
	// for array elements
	for(int x:ar)
	{
		// set the array values into set
		set.add(x);
	}
	// set loop traversing
	for(int x:set)
	{
		
		System.out.println(x);
	}
	
}
}
