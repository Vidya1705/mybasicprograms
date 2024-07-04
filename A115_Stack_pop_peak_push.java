package eclipsepackage;

import java.util.Stack;

public class A115_Stack_pop_peak_push 
{
public static void main(String[] args) 
{
       Stack s1= new Stack();
       s1.add("100");
       s1.add("200");
       s1.add("300");
       s1.add("400");
       s1.add("500");
       s1.add("600");

     System.out.println(s1);
     s1.pop();
     System.out.println(s1);  
     
     System.out.println(s1.peek());
     System.out.println(s1.push(700));
    






	}

}
