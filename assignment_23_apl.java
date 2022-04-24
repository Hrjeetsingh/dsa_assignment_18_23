import java.util.Iterator;

/*1. Create a linked list and add ten values to it by taking it from the user. 
     Delete all nodes which are greater than 40*/

// A complete working Java program
// to demonstrate deletion
// in singly linked list

class LinkedList {
	Node head; 

	class Node {
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	void deleteNode(int key)
	{
		// Store head node
		Node temp = head, prev = null;

		
		if (temp != null && temp.data == key) {
			head = temp.next; // Changed head
			return;
		}

		
		
		while (temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}

		
		if (temp == null)
			return;

		
		prev.next = temp.next;
	}

	public void push(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	public void printList()
	{
		Node tnode = head;
		while (tnode != null) {
			System.out.print(tnode.data + " ");
			tnode = tnode.next;
		}
	}

	public static void main(String[] args)
	{
		LinkedList llist = new LinkedList();

		llist.push(7);
		llist.push(1);
		llist.push(3);
		llist.push(2);
		llist.push(80);
		llist.push(72);
		llist.push(9);
		llist.push(8);

        Iterator i=llist.i();
		System.out.println("\nCreated Linked list is:");
		llist.printList();
        int num=iterateUsingForLoop(llist);
		//llist.deleteNode(1); 
        if(num>40){
            llist.deleteNode(num);
        }

		System.out.println(
			"\nLinked List after Deletion of 1:");
		llist.printList();
	}
    public static void iterateUsingForLoop(LinkedList<Integer> linkedList)
    {
  
        System.out.print("Iterating the LinkedList using a simple for loop : ");
  
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i) + " ");
        }
    }
}



/*2. Print the node which is at index 5

Input - 10->20->20->40->50->60->70->null
Output - 50
*/
