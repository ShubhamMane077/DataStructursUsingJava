package com.java.dsa;

class DoublyLinkedList {
	
	private class Node{
		Node prev;
	     int item;
	     Node next;
	}
	private Node start;
	public DoublyLinkedList() {
		super();
		this.start = start;
	}
	
	 public void insertAtFirst(int data){
		 Node n = new Node();
	        n.next = start;
	        n.item = data;
	        n.prev = null;
	        
	        if(start != null)
	            start.prev = n;
	        start = n;
	    }
	 public void insertAtLast(int data){
		 	Node t;
		 	Node n = new Node();
	        n.next = null;
	        n.item = data;
	        if(start == null)
	        {
	            n.prev = null;
	            n.next = start;
	            start = n;
	        }
	        else
	        {
	            t=start;
	            while(t.next != null)
	                t = t.next;
	            n.prev = t;
	            t.next = n;
	        }
	    }
	 public void deleteFirst(){
	        if(start == null)
	          System.out.println("underflow");
	        else
	        {
	        	Node t;
	            t = start;
	            start = t.next;
	            if(t.next != null)
	                t.prev = null;
	        }
	    }

	 public void deleteLast(){
	       if(start == null)
	    	   System.out.println("Underflow");
	       else {
	    	   Node t = start;
	    	   if(t.next != null) {
	    		   while(t.next.next != null)
	    			   t = t.next;
	    	   		Node t2 = t.next ;
	    	   		t2.next = null; 
	    	   }
	    	   else {
	    		   start = null;
	    		   
	    	   }
	       }
	    }
	 
	 public Node search(int data){
	        if(start == null)
	           System.out.println("Underflow");
	        Node t = start;
	        while(t != null)
	        {
	            if(t.item == data)
	                return t;
	            t = t.next;

	        }
	        return null;
	    }
	 public void insertAfter(int element,int data){
	        Node temp = search(element);
	        if(temp != null)
	        {
	            Node n = new Node();
	            n.prev = temp;
	            n.item = data;
	            n.next = temp.next;
	            temp.next = n;
	        }
	        else
	           System.out.println("element search flaild ");

	    }
	 public void deleteNode(int data){
	        Node t = search(data);
	        if(t != null){
	            Node t2 = t.prev;
	            if(t.next != null)
	                t2.next = t.next;
	            t2.next = null;
	        }
	        else
	        	System.out.println("element search flaild ");
	 }
	 public void display() {
		    Node current = start;
		    while (current != null) {
		    	System.out.println(current.item + " ");
		        current = current.next;
		    }
		    System.out.println();
		   }
}
