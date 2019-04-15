package dongTai;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class IsValid {
/*	给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
	有效字符串需满足：
	左括号必须用相同类型的右括号闭合。
	左括号必须以正确的顺序闭合。
	注意空字符串可被认为是有效字符串。
	输入: "(),"()[]{}","([)]""
          输出: true*/
	public static void main(String[] args) {
		String b=")[)]";
		System.out.println(isValid(b));

	}
	
	 public static boolean isValid(String s) {
	        Stack<Character> stack = new Stack<>();
	        
	        for (int i = 0; i < s.length(); i++){
	            char ch = s.charAt(i);
	            if(ch == '(' || ch == '[' || ch == '{'){
	                stack.push(ch);
	            }else{
	                if(stack.isEmpty()){
	                    return false;
	                }
	                char topChar = stack.pop();
	                if(ch == ')' && topChar != '('){
	                    return false;
	                }else if(ch == ']' && topChar != '['){
	                    return false;
	                }else if(ch == '}' && topChar != '{'){
	                    return false;
	                }
	            }
	        }
	 
	        return stack.isEmpty();

       }
    }
