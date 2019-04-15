package dongTai;

public class Test {
	
static ListNode head=null;
public static void main(String[] args) {
 int input[]=new int[]{1,2,3,3,4,5};
 ListNode listNode=buildListNode(input);
 head=listNode;
 while (listNode!=null) {
	 System.out.println("......."+listNode.val+".........."+listNode.nextNode);
	 listNode=listNode.nextNode;
 }
 

 head=removeElements(head, 5);
 ListNode listNode2=head;
 
 while (listNode2!=null) {
	System.out.println("......"+listNode2.val+"......."+listNode2.nextNode);
	listNode2=listNode2.nextNode;
}
 
}
	 private static ListNode buildListNode(int[] input){
		ListNode first=null,last=null,newNode;
		if (input!=null) {
			for (int j = 0; j < input.length; j++) {
				newNode=new ListNode(input[j]);
				newNode.nextNode=null;
				if(first==null){
					first=newNode;
					last=newNode;
				}else {
					last.nextNode=newNode;
					last=newNode;
				}
			}
			
		}
		
		return first;
  }
	 

private static ListNode removeElements(ListNode head,int val){
	
	  if(head==null){
		 return null;
		} 
		
	   ListNode p=head,q=p.nextNode;
	   while(q.nextNode!=null){
		if(q.val==val){
           p.nextNode=q.nextNode;
           q=q.nextNode;
           
		}else{
			p=p.nextNode;
			q=q.nextNode;
		}
		  }
	   
		if(head.val==val){
		   head=head.nextNode;
		}
		
		return head;
	
	  }
	
}
