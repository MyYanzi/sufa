package dongTai;

class MyLinkedList {
    
    Node head;
    int size;
    
    /** Initialize your data structure here. */
    public MyLinkedList() {
      head = null;
      size=0;
    }
    
    public class Node {
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
        }

    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index>=size||index<0){
            return -1;
        }
        Node cur=head;
        for(int i=0;i<index;i++){
            cur=cur.next;
        }
        return cur.val;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node cur=new Node(val);
        if(size==0){
          head=cur;
        }else{
        	 cur.next=head;
             head=cur;
        }     
        size++;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val){
        Node cur=new Node(val);
        Node first=head;
        while(first.next!=null){
          first=first.next;
        }
        first.next=cur;
        cur.next=null;
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val){
        Node cur=new Node(val);
        Node first=head;
        Node per=head;
        for(int i=0;i<index;i++){
            per=first;
            first=first.next;
        }
        cur.next=first;
        per.next=cur;
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index){
        Node first=head;
        Node per=head;
        if(index==0){
            first=first.next;
        }else {
        	for(int i=0;i<index;i++){
                per=first;
                first=first.next;
            }
        	 per.next=first.next; 
		} 
    }
    // 显示出所有的节点信息
    public void displayAllNodes() {
         Node current = head;
          while (current != null) {
             System.out.println(current.val);
             current = current. next;
         }
    }
    
}
  
