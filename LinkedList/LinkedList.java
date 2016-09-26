 import java.util.*;

 class Node{// Define a node for the Linked List
 	Node next;
 	int data;
 	public Node(int data){
        this.data = data;
        this.next = null;
 	}
 } 

 public class LinkedList{
 	private Node head;
 	private int size = 0;
    
 	public void LinkedList(){
 		this.head = null;
 	}
 	public void addNode(int data){// Insert to the end.
 		 Node temp = new Node(data);
 		if (head == null){
          head = temp;
 		}
 		else{
 			Node  current = new Node(0);
 			current = head;
 			while (current.next != null){
                current = current.next;
 			}
 			current.next = temp;
 		}
 		size++;
 	}
 	public Node delete(int need) {// Delete the element 'need'
 		Node temp = head;
 		Node pre = head;
 		while (temp.data != need){
 			if (temp.next == null){
 				System.out.println ("Does not exist");
 			return null;
 			}
 			pre = temp;
 			temp = temp.next;
 		}
 		if (temp == head){
             head= head.next;
 		}
 		else{
 			pre.next = temp.next;
 		}
        size--;
 		return temp;
 	}
    public Node find(int need){
        int pos = 0;
         Node temp = head;
         while (temp.data != need){
            if (temp.next == null){
                System.out.println ("Does not exist");
            return null;
            }
            temp = temp.next;
            pos++;
         }
        System.out.println("The position is " + pos);
         return temp;

    }
   public Node ChangeData(int a,int b ){
    Node temp = head;
    while (temp.data != a ){
        if (temp.next == null){
             System.out.println ("Does not exist");
            return null;
        }
        temp = temp.next;
    }
    temp.data = b;
    return temp;
   }

   public void getSize(){
    System.out.println("The size is " + size);
   }

 	public void printNode(){
 		Node temp = head;
 		while (temp != null){
 			System.out.print(temp.data + "->");
 			temp =  temp.next;
 		}
        System.out.println("");  
 	}
public static void main(String[] args){
	LinkedList l = new LinkedList();
	l.addNode(5);
	l.addNode(6);
	l.addNode(7);
    l.addNode(8);
    l.printNode();
    l.getSize(); 
    l.delete(5);
    l.printNode();
    l.getSize();
    l.find(6);
    l.find(7);
    l.find(5);
    l.ChangeData(6,10);
    l.ChangeData(5,17);
    l.printNode();


 }
}
