//create java program for social media 
//feild navigation for next post preveious post 
//and delete a post and insert a sponser post;
import java.util.*;
class Node{
	String content;
	Node prev;
	Node next;
	Node(String content){
		this.content=content;
		this.next=null;
		this.prev=null;
	}
}
class DoublyLL{
	private Node head;
	private Node current_node;
	private Node tail;
	public void addPost(String content){
		Node newNode=new Node(content);
		if(head==null){
			head=tail=current_node=newNode;
		}
		else{
			tail.next=newNode;
			newNode.prev=tail;
			tail=newNode;
		}
	}
	public void showCurrentPost(){
		if(current_node!=null){
			System.out.println("Current post running is   : "+current_node.content);
		}
		else{
			System.out.println("No current posts available ");
		}
	}
	public void nextPost(){
		if(current_node!=null &&current_node.next!=null){
			current_node=current_node.next;
			showCurrentPost();
		}
		else{
			System.out.println("No next posts are available");
		}
	}
	public void previousPost() {
        if (current_node != null && current_node.prev != null) {
            current_node = current_node.prev;
            showCurrentPost();
        } else {
            System.out.println("No previous post.");
        }
    }
	public void deleteCurrentPost() {
        if (current_node == null) {
            System.out.println("No post to delete.");
            return;
        }
        System.out.println("Deleting: " + current_node.content);

        if (current_node.prev != null) {
            current_node.prev.next = current_node.next;
        } else {
            head = current_node.next;
        }

        if (current_node.next != null) {
            current_node.next.prev = current_node.prev;
            current_node = current_node.next;
        } else {
            tail = current_node.prev;
            current_node = current_node.prev;
        }
    }
	public void insertSponsoredPost(String content) {
        if (current_node == null) {
            System.out.println("No current post to insert after.");
            return;
        }
        Node sponsored = new Node("[Sponsored] " + content);
        sponsored.next = current_node.next;
        sponsored.prev = current_node;

        if (current_node.next != null) {
            current_node.next.prev = sponsored;
        } else {
            tail = sponsored;
        }
        current_node.next = sponsored;
		System.out.println("Sponsored post inserted after current.");
    }
    public void displayFeed() {
        System.out.println("Feed:");
        Node temp = head;
        while (temp != null) {
            System.out.println(" - " + temp.content);
            temp = temp.next;
        }
    }
}
public class DoublyLinkedList {
    public static void main(String[] args) {
        DoublyLL feed = new DoublyLL();
        feed.addPost("Hello Selciya mam ....");
        feed.addPost("My second post");
        feed.addPost("Enjoying Java coding");
        feed.displayFeed();
        feed.showCurrentPost();
        feed.nextPost();
        feed.insertSponsoredPost("Check out my github account");
        feed.displayFeed();
        feed.nextPost();
        feed.deleteCurrentPost();
        feed.displayFeed();
        feed.previousPost();
    }
}
