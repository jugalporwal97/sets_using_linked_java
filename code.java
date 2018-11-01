// A complete working Java program to demonstrate all insertion methods 
// on linked list 
class LinkedList 
{ 
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
	
	
 int find(Node node)
   {
       int cnt=0;
       Node iterator = head;
       while(iterator != null)
       {
             if(node.data == iterator.data) return 1;
             iterator = iterator.next;
       }

       return cnt;
  }

  void insert(int value)
  {

       Node newNode = new Node(value);
     

       if(find(newNode) != 1)
       {
             Node temp = head;
             head = newNode;
             newNode.next = temp;
       }
  }      



	public void printList() 
	{ 
		Node tnode = head; 
		while (tnode != null) 
		{ 
			System.out.print(tnode.data+" "); 
			tnode = tnode.next; 
		} 
	} 


	public static void main(String[] args) 
	{ 
	
		LinkedList llist = new LinkedList(); 

	
		llist.insert(6); 
		llist.insert(2); 
		llist.insert(6); 
		llist.insert(3); 
		llist.insert(5); 

	
 

		System.out.println("\nCreated Linked list is: "); 
		llist.printList(); 
	} 
} 

