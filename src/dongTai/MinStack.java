package dongTai;

import java.util.ArrayList;
import java.util.List;

import com.sun.org.apache.bcel.internal.generic.POP;

public class MinStack {
	/*设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
	push(x) -- 将元素 x 推入栈中。
	pop() -- 删除栈顶的元素。
	top() -- 获取栈顶元素。
	getMin() -- 检索栈中的最小元素。*/
	
	 private List<Integer> data;
	    /** initialize your data structure here. */
	    public MinStack() {
	        data=new ArrayList<>();
	    }
	    
	    public void push(int x) {
	        data.add(x);        
	    }
	    
	    public void pop(){
	        data.remove(data.size()-1);
	    }
	    
	    public int top() {
	        return data.get(data.size()-1);
	    }
	    
	    public int getMin(){
	    	int min = data.get(0);
	        	for (int j = 1; j < data.size(); j++) {
	        		  if(min>data.get(j)) {
	 	                 min=data.get(j);
	 	            }   
				}
	        return min;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinStack minStack = new MinStack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		int a=minStack.getMin();
		minStack.pop();
		int b=minStack.top();  //--> 返回 0.
		int c=minStack.getMin();   //--> 返回 -2.
		System.out.println(c);
	}
	
}
