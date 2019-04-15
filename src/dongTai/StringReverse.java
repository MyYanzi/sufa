package dongTai;

import java.util.Scanner;

public class StringReverse {

	 public static void main(String[] args){
		/* Scanner in=new Scanner(System.in);
		 while(in.hasNext()){
			String line=in.nextLine();//next()是遇到空格；nextLine()是遇到回车
            StringBuffer sb=new StringBuffer(line);
            sb.reverse();
            System.out.println(sb.toString());
		}*/
		 String a="abcdef";
		// System.out.println(reverse2(a));
		// System.out.println(reverseString(a));
		 System.out.println(reverse3(a));
	 }
	 public static String reverseString(String s){
		int n=s.length();
		String reverse="";
		for (int i = 0; i<n; i++) {
			 reverse=s.charAt(i)+reverse;
		}
		return reverse;
	 }
	 
	 public static String reverse2(String str) {
		    char[] chars = str.toCharArray();
		    String reverse = "";
		    for (int i = chars.length - 1; i >= 0; i--) {
		      reverse += chars[i];
		    }
		    return reverse;
		  }
	 
	 public static String reverse3(String s){
		StringBuffer stringBuffer=new StringBuffer(s);
		stringBuffer.reverse();
		String a=stringBuffer.toString();
		return a; 
	 } 
}
