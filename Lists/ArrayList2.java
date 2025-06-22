package lists;
import java.util.*;
/*
 * ArrayList is a Resiazable array Implementation in Java
 * It allows Dyanamic Storage of Elements , maintain Insertion Order
 * 
 * ArrayList is an Inbuilt class which is present in the java.util.package
 * It stores Homongenous Data
 * Allows ---> Duplicates, Null Values
 * Preserver Order of Insertion
 * Default capactity is 16
 * if you want to increase we have formula == New Capactity  == old capactiy *3/2+1;
 * Order of Insertion---> not good
 * Waste of Memory----> yes
 *  */
public class ArrayList2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList al1 = new ArrayList();
		al1.add(10);
		//set.add("rakesh");
		al1.add(85);
//		set.add(null);
//		set.add(true);
		al1.add(85);
		al1.add(100);
		//set.add(1,20); // when data will be added the previous data is not deleted by using add
		//set.set(0, 110);// set--> It is used for add the data in a specific location and previous value is deleted
		//set.contains("rakesh");---> value is there or not in a list
		//set.removeAll(set);
		//set.retainAll(set); 
		//set.remove(0);  // Remove the specific  data
	    //System.out.println(set.size());  specific the size of the array
		//System.out.println(set.isEmpty());  // if data is there it will be print true, otherwise false
		
		
		// Loops Traditional for loop
//		for(int i=0;i<al1.size();i++) {
//			System.out.println(al1.get(i));
//		}
		
		// Enchanced For Loop 
		// what ever we store in the array in the format int not objects so that we are giving object below
//		for(Object v:al1)
//		{
//			System.out.println(v);
//		}
		// It will move only forward
//		Iterator itr = al1.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		 
		
		// Interivew Question
		// what is the difference between Iterator and ListIterator
		// in java we have courser based logic
		// 1) Iterator--->only traverse forward
		// 2) ListIterator---> can traverse forward and backward
		// ask him paper explain eloborately
		// List Iterator used to traverse the array forward and backward
		// Backward Process
		ListIterator ltr = al1.listIterator(4);
		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
		}
		
//		ListIterator ltr = al1.listIterator();
//		while(ltr.hasNext())
//		{
//			System.out.println(ltr.next());
//		}


	}

}
