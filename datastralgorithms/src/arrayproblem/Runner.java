package arrayproblem;
class Node{
	int data;
	Node next;
	 public Node(int data) {
		data= data;
		next=null;
		
	}
	 
}
class LinkedList{
	Node head;
	public void insert(int data) {
		Node newnode= new Node(data);
		newnode.next = null;
		if(head==null)
		{
			head=newnode;
		}
		else {
			
			Node last = head;
			while(last.next!=null) {
				last= last.next;
			}
			last.next=newnode;
			
		}
		
	}
public void display() {
	Node currnode=head;
	while(currnode!= null) {
		System.out.println(currnode.data);
		currnode = currnode.next;
	}
}	
}
	
public class Runner {
 public static void main(String[] args) {
	 LinkedList lst = new LinkedList();
	 lst.insert(34);
	 lst.insert(52);
	 lst.insert(65);
	 lst.insert(87);
	 System.out.println("successfuilly inserted");
	 lst.display();
	 
}

}
