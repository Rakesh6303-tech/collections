package programs;
import java.util.*;
public class RemoveduplicatesandprintAsc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar [] = new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		RemoveDplctASC(ar);
	}
	public static void RemoveDplctASC(int ar [])
	{
		// used for the removing the duplicates and follows the Ascending order
		TreeSet<Integer> set = new TreeSet<Integer>();
		// loop starting from the intial to end
		for(int i=0;i<ar.length;i++)
		{
			// values store without reoeating
			set.add(ar[i]);
		}
		// it will be print one by one value in the for each loop
		for(int v:set)
		{
			System.out.print(v + " ");
		}
		
	}

}
