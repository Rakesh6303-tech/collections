package programs;

import java.util.Scanner;
import java.util.TreeSet;

public class PrintonlyWebsiteName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		RemnoveDuplicateurlsandprintorder(s);
	}
	public static void 	RemnoveDuplicateurlsandprintorder(String s)
	{
		// split optor performs where , is found It'll split and store remaining into ar []
		String ar [] = s.split(",");
		// treeset use for remove the duplicates and print ascending order
		TreeSet<String> set = new TreeSet<String>();
		// here loop traversal from the starting to ending to string
		for(int i=0;i<ar.length;i++)
		{
			// here the string will split . we use \\. 
			String v [] = ar[i].split("\\.");
			// here we use the 1st index it reprsent the website name
			set.add(v[1]);
		}
		// for each loop traversal from intital to string set
		for(String x:set)
		{
			System.out.println(x +" ");
		}
	}
	}	


