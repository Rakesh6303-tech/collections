package programs;

import java.util.TreeSet;
import java.util.Scanner;

public class AscendingOrder {

	public static void main(String[] args) {
		Scanner scan  = new Scanner (System.in);
		System.out.println("Enter the N value: ");
		int n = scan.nextInt();
		int ar [] = new int [n];
		System.out.println("Enter the values: ");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		// TreesSet follows the Ascending order nd remove the duplicate values nd dont follow the insertion order
		TreeSet<Integer> set = new TreeSet<Integer>();
		
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
