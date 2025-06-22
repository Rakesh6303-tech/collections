package programs;

import java.util.Scanner;
import java.util.LinkedHashSet;

public class InsertionOrder {

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
		// LinkedHashSet follows the Insertion order nd remove the duplicate values
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		
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

