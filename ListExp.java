//Singly linked initialization and operations
import java.util.*;
public class ListExp{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Node f_node=new Node(10);
		Node s_node=new Node(20);
		Node t_node=new Node(30);
		//Node node=new Node();
		f_node.next=s_node;
		s_node.next=t_node;
		Node current = f_node;
		while (current != null) {
			System.out.print(current.data+"-> ");
			current = current.next;
		}
		System.out.println("null");
		System.out.println("Inserting one node at the middle of linked list");
		Node newNode=new Node(35);
		s_node.next=newNode;
		newNode.next=t_node;
		Node head = f_node;
		while (head != null) {
			System.out.print(head.data+"-> ");
			head = head.next;
		}
		System.out.println("null");
		System.out.println("Deleting one node at the middle of linked list");
		s_node.next=newNode.next;
		Node heads = f_node;
		while (heads != null) {
			System.out.print(heads.data+"-> ");
			heads = heads.next;
		}
		System.out.println("null");
		int a=f_node.next.data;
		System.out.println(a);
		

	}
	

}
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}