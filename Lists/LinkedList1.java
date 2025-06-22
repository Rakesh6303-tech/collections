package lists;
import java.util.*;
/*
 * LinkedList: A Ll in Java is a Linear DataStructure . 
 * That Stores elements in Nodes where each node points to nexts
 * Allowing efficent insertion and Deletion of elements
 * 
 * <---- Method---->
 * Duplicates --- Allowed
 * Heterogenous ---> ALlowed
 * DataStructure----> Double LinkedList
 * Constructors  ---->  2
 * null values----->  Allowed
 * Size------> 0
 * Order of Insertion---> yes
 * Waste of Memory---->No
 * peek()---> Give Head of The List   copy and paste
 * poll()---> Give Head of the List and it will eliminate and cut and paste
 * addFirst--->Add the element in the first element
 * addLast----> Add the element in the last array
 * removeFirst---> It will the firstElment
 * removeLast----> It will the remove the last Element
 * offer---> first check if any space is the Ram it will be store otherwise not store
 * offerFirst----> Add at the First
 * offerLast-----> Add the last 
 */
public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList lst = new LinkedList<>();
		lst.add(10);
		lst.add(20);
		//lst.add("rakesh");
		//lst.add(true);
		lst.add(10);
//		lst.add(null);
		lst.addLast(100);
		lst.addFirst(1000);
		lst.offer(55);   
		System.out.println(lst);
		//System.out.println(lst);
		
//		System.out.println(lst);
//		System.out.println(lst.peek());  // it will give head of the list
//		System.out.println(lst);
//		//System.out.println(lst.poll());
//		System.out.println(lst);
//		System.out.println(lst.removeFirst());
//		System.out.println(lst.removeLast());
	
		

	}

}
