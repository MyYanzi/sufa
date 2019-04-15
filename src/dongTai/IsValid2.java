package dongTai;

import java.util.Stack;

public class IsValid2 {

	public static void main(String[] args) {
		String a="[(])";
        System.out.println(isValid(a));
	}

	public static boolean isValid(String s){
		
		if (s=="" || s.length()==0) 
			return true;
		Stack<Character> stack=new Stack<>();
		for (int j = 0; j < s.length(); j++) {	
		   char ch=s.charAt(j);
		   if (ch=='('||ch=='['||ch=='{') {
			stack.push(ch);
		  }else{
			  char topchar=stack.pop();
			  
			 if (ch==')'&& topchar!='(') {
				return false;
			}else if (ch==']'&&topchar!='['){
				return false;
			}else if (ch=='{'&&topchar!='}') {
				return false;
			} 
		  }
		}
		return stack.isEmpty();
		
	}
}
