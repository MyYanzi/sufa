package dongTai;

import java.util.HashMap;
import java.util.Map;
/*整数转罗马数字
 * 罗马数字包含以下七种字符： I， V， X， L，C，D 和 M。
字符                        数值
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。

通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：

I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
给定一个整数，将其转为罗马数字。输入确保在 1 到 3999 的范围内。*/
public class RomanToint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="LVIII";
		int a=romanToInt2(s);
		System.out.println(a);
	}

	public static int romanToInt2(String s) {
        Map<Character, Integer> r2i = new HashMap<Character, Integer>();
            r2i.put('I', 1);
            r2i.put('V', 5);
            r2i.put('X', 10);
            r2i.put('L', 50);
            r2i.put('C', 100);
            r2i.put('D', 500);
            r2i.put('M', 1000);
        
        Map<String, Integer> rr2i = new HashMap<String, Integer>(){{
            put("IV", 4);
            put("IX", 9);
            put("XL", 40);
            put("XC", 90);
            put("CD", 400);
            put("CM", 900);
        }};
        int len = s.length();
        int result = 0;
        for (int i = 0; i < len; i++){
        	//String str=s.substring(i, i + 2);
            if (i + 1<len && rr2i.containsKey(s.substring(i, i + 2))){
                result = result + rr2i.get(s.substring(i, i + 2));
                i++;
            }else{
                result = result + r2i.get(s.charAt(i));
            }
        }
        return result;
    }
	
	
	  public static int romanToInt(String s) {
		int n=s.length();
		int m=0;
		String str,str2;
		for(int i=0;i<n;i++){
			str=s.substring(i,i+1);
			if(str.equals("I")||str.equals("X")||str.equals("C")){
				if (str.equals("I")){
					if (i+2<=n) {
					str2=s.substring(i,i+2);
					if (str2.equals("IV")||str2.equals("IX")){
						if (str2.equals("IV")) {
							m=m+4;
						}else{
							m=m+9;
						}
						i++;
			          }else{
							m=m+1;
					}
				  }else{
					m=m+1;
				 }	
				}else if(str.equals("X")){
				 if (i+2<=n){
					 str2=s.substring(i,i+2);
					 if (str2.equals("XL")||str2.equals("XC")){
						 if (str2.equals("XL")){
							m=m+40;
						 }else{
							m=m+90;
						}
						i++;
					  }else {
						m=m+10;
					  } 
				  }else{
					    m=m+10;
					}
					
				}else{
					if (i+2<=n){
					str2=s.substring(i,i+2);
					if (str2.equals("CD")||str2.equals("CM")){
						if (str2.equals("CD")){
							m=m+400;
						}else{
							m=m+900;
						}
						i++;
					}else {
						m=m+100;
					 }
					}else{
					    m=m+100;
					}
				}	
			}else if(str.equals("V")){
				m=m+5;
				
			}else if (str.equals("L")) {
				m=m+50;
				
			}else if (str.equals("D")) {
				m=m+500;
				
			}else {
				m=m+1000;
			}
			
		}
		      
	        return m;
	          
	    }

}
