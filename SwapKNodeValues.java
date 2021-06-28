package prac;
import java.lang.*;
import java.io.*;
import java.util.*;

public class SwapKNodeValues {
	public static void main(String args[]) {
		   Node n1=new Node(1);
		   Node n2=new Node(2);
		   Node n3=new Node(3);
		   Node n4=new Node(4);
		   Node n5=new Node(5);
		 //  Node n6=new Node(6);
		   
		   n1.next=n2;
		   n2.next=n3;
		   n3.next=n4;
		   n4.next=n5;
		 //  n5.next=n6;
		   
		   Node curr=n1;
		 
		   Node slow=curr;
		   Node fast=curr;
		   int x=0;
		   
		   int k=2;
		   
		   while(x!=k) {
			     fast=fast.next;
			     x++;
		   }
		   
		   Node temp=fast;
		   
		   while(fast.next!=null) {
			   slow=slow.next;
			   fast=fast.next;
		   }
		   
		   int var=temp.val;
		   temp.val=slow.val;
		   slow.val=var;
		   
		   Node c=n1;
		   while(c!=null) {
			   System.out.println(c.val);
			   c=c.next;
		   }
		   
	}
}
