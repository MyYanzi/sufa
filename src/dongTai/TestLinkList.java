package dongTai;

import dongTai.MyLinkedList.Node;

public class TestLinkList {
	public static void main(String[] args) {
		//MyLinkedlist2 linkedList=new MyLinkedlist2();
		MyLinkedList linkedList=new MyLinkedList();
		linkedList.addAtHead(10);
		linkedList.addAtHead(11);
		linkedList.addAtHead(12);
		//linkedList.displayAllNodes();
		linkedList.addAtTail(8);
		linkedList.addAtIndex(1, 22);
		linkedList.deleteAtIndex(2);
		linkedList.displayAllNodes();
	/*	Node current=linkedList.head;
		while(current.next!=null){
			System.out.println(current.val);
			current=current.next;
		}*/
	}
}
