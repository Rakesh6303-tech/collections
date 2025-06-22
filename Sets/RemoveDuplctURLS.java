package programs;
import java.util.*;
public class RemoveDuplicateUrls {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		RemoveDuplicateUrls(s);
	}
	public static void RemoveDuplicateUrls(String s)
	{
		String ar [] = s.split(",");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i=0;i<ar.length;i++)
		{
			set.add(ar[i]);
		}
		for(String url:set)
		{
			System.out.println(url);
		}
	}

}
