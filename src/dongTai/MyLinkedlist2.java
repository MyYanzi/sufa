package dongTai;

public class MyLinkedlist2{
    Node head;
    int size;
    public MyLinkedlist2() {
        head = null;
        size = 0;
    }
    public int get(int index) {
        if (index >= size) {
            return -1;
        }
        Node cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.val;
    }
    public void addAtHead(int val) {
        Node newHead = new Node(val);
        newHead.next = head;
        head = newHead;
        size++;
    }
    public void addAtTail(int val) {
        Node newTail = new Node(val);
        if (size == 0) {
            head = newTail;
        } else {
            Node pre = head;
            for (int i = 1; i < size; i++) {
                pre = pre.next;
            }
            pre.next = newTail;
        }
        size++;
    }
    public void addAtIndex(int index, int val) {
        if (index <= size) {
            if (index == 0) {
                addAtHead(val);
            } else {
                Node node = new Node(val);
                Node pre = head;
                for (int i = 1; i <= index - 1; i++) {
                    pre = pre.next;
                }
                node.next = pre.next;
                pre.next = node;
                size++;
            }
        }
    }
    public void deleteAtIndex(int index) {
        if (index >= 0 && index < size) {
            if (index == 0) {
                head = head.next;
            } else {
                Node pre = head;
                for (int i = 1; i <= index - 1; i++) {
                    pre = pre.next;
                }
                Node next = pre.next;
                pre.next = next.next;
                next.next = null;
            }
            size--;
        }
    }
}
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
    }
}
