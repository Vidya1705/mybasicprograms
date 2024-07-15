package eclipsepackage;

import java.util.LinkedList;

public class A_112_Linkedlist_Methods
{
public static void main(String[] args) 
{

	LinkedList l1= new LinkedList();
	
	l1.add("pen");
	l1.add("book");
	l1.add("paper");
	l1.add("pencil");
	l1.add("eraser");
	System.out.println(l1);
	
	l1.addFirst("cap");
	System.out.println(l1);
	
	l1.addLast("laptop");
    System.out.println(l1);	
    
    //l1.getFirst("mouse");//Error
	//System.out.println(l1);
    System.out.println(l1.getFirst());
    System.out.println(l1.getLast());
    
    l1.removeFirst();
    System.out.println(l1);
    //System.out.println(l1.removeFirst());
    
    l1.removeLast();
    System.out.println(l1);
    
    l1.pollFirst();
    System.out.println(l1);
    
    l1.pollLast();
    System.out.println(l1);
    
	
	}

}
