package com.java.dsa;

public class DoublyLinkedListMain {

	public static void main(String[] args) {
		 	
		 	DoublyLinkedList myList = new DoublyLinkedList();
			myList.insertAtFirst(10);
		    myList.insertAtLast(20);
		    myList.insertAtLast(30);
		    myList.insertAfter(20, 25);

		    myList.display();
		    myList.deleteFirst();
		    myList.deleteNode(30);
		    myList.deleteLast();

	}

}
