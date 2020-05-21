package JavaProg;
import java.io.*; 
import java.util.*;

public class LinkedList {
	 public static void main(String args[]) 
	    { 
	        
	        List<String> list = new java.util.LinkedList<String>(); 
	  
	       
	        list.add("a"); 
	        list.add("b"); 
	        list.add("c"); 
	        list.add("d"); 
	        list.add("e"); 
	  
	        //display
	        System.out.println("LinkedList:" + list); 
	        //get()
	        System.out.println("The element is: " + list.get(2)); 
	        //set()
	        System.out.println("The Object that is replaced is: " + list.set(2, "b"));
	        //remove
	        list.remove(1);
	        //size
	        System.out.println("The size of the linked list is: " 
                    + list.size()); 
	    }      
	  
	  
}
