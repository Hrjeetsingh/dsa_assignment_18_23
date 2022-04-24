/* Create a linked list and add the following elements to it - 2,4,1,3,8,5
   Search for the number 3 and display ts index
*/

import java.util.*;

class SearchInALinkedList {
	public static void main(String[] args){

		LinkedList<Integer> ll = new LinkedList<>();
		
		ll.add(2);
		ll.add(4);
        ll.add(1);
        ll.add(3);
		ll.add(8);
		ll.add(5);
		
		int element = 3;

		int ans = -1;

		for (int i = 0; i < ll.size(); i++) {

			int llElement = ll.get(i);

			if (llElement == element) {

				ans = i;
				break;
			}
		}
		if (ans == -1) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("Element found in Linked List at " + ans);
		}
	}
}



//Output -> Found at 4th position

/*2. Create a liked list and add the following elements to it - 2,4,1,3,8,5.
   Add the element 20 at the end   

Output - 2,4,1,3,8,5,20 */


class LinkedList{
	Node head;
	class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	public void push(int new_data)
	{
		Node new_node = new Node(new_data);

	
		new_node.next = head;

		head = new_node;
	}

	public void insertAfter(Node prev_node,int new_data)
	{
	
		if (prev_node == null)
		{
			System.out.println("The given previous node cannot be null");
			return;
		}

		Node new_node = new Node(new_data);

		new_node.next = prev_node.next;

		prev_node.next = new_node;
	}
	
	public void append(int new_data)
	{
		Node new_node = new Node(new_data);

		if (head == null)
		{
			head = new Node(new_data);
			return;
		}

		new_node.next = null;

		Node last = head;
		while (last.next != null)
			last = last.next;

		last.next = new_node;
		return;
	}

	public void printList()
	{
		Node tnode = head;
		while (tnode != null)
		{
			System.out.print(tnode.data + " ");
			tnode = tnode.next;
		}
	}

	public static void main(String[] args)
	{
	
		LinkedList llist = new LinkedList();

		llist.append(2);

		llist.push(4);
		llist.push(1);

		llist.append(3);
		llist.append(8);
		llist.append(5);
		llist.append(20);

		System.out.println("Created Linked list is: ");
		llist.printList();
	}
}

//Output - 2,4,1,3,8,5,20 
