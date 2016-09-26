

class Node{
	 int data;
	 Node pre;
	 Node next;
	 public Node(){
	 	this.pre = null;
		this.next = null;
	 }
	public  Node(int data){
		this.data = data;
		this.pre = null;
		this.next = null;
	}

}
public class DoublyLinkedList{
	private Node head;
	private Node tail;
	public DoublyLinkedList(){
		this.head = null;
		this.tail = new Node();
	}
	public void addNode(int test){
		Node temp = new Node(test);
		if (head == null){
			head = temp;
			tail.pre = temp;
		}
		else{
			tail.pre.next = temp;
			temp.pre = tail.pre;
			tail.pre = temp;
		}
	}
	public void DeleteNode(int need){
		Node past = head;
		while (past.next != null){
			
			if (past == null){
				System.out.println ("Does not exist");
			}
			else{System.out.println (past.data);
				if (need == past.data ){
					System.out.println ("gggg");
					past.pre.next = past.next;
					break;
				}
				else{
					past = past.next;
					System.out.println (past.data);
				}

			}
		}

	} 


	public void printNode(){
		if (head == null){
			System.out.println("Empty List");
		}
		else{
			Node temp = head;
			while(temp != null){
				System.out.print(temp.data + "<-->");
				temp = temp.next;
			}
			System.out.println("");
		}
	}
	public static void main(String[] args){
		DoublyLinkedList l = new DoublyLinkedList();
		l.addNode(2);
		l.addNode(3);
		l.addNode(4);
		l.addNode(5);
		l.printNode();
		l.DeleteNode(4);
		l.printNode();
	}
}