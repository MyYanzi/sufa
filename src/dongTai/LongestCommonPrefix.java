package dongTai;
/*编写一个函数来查找字符串数组中的最长公共前缀。
如果不存在公共前缀，返回空字符串 ""
例：
输入: ["flower","flow","flight"]
输出: "fl"
输入: ["dog","racecar","car"]
输出: ""
解释: 输入不存在公共前缀。*/
public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a={"abc","ab","aacd"};
		String b=longestCommonPrefix4(a);
		System.out.println(b);

	}
	
	public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)   return "";
        StringBuilder sb = new StringBuilder();
        for (int r = 0; r < strs[0].length(); r++) {
            for (int i = 0; i < strs.length; i++) {
                if(r >= strs[i].length() || strs[0].charAt(r) != strs[i].charAt(r)){
                    return sb.toString();
                }
            }
            sb.append(strs[0].charAt(r));
        }
        return sb.toString();
    }
	
	 public static String longestCommonPrefix2(String[] strs) {
		    if (strs.length == 0) return "";
		    String prefix = strs[0];
			for (int i = 1; i < strs.length; i++)
				while (strs[i].indexOf(prefix) != 0) {
					int j=strs[i].indexOf(prefix);
		            prefix = prefix.substring(0, prefix.length() - 1);
		            if (prefix.isEmpty()) return "";
		        }        
		    return prefix;
		}
	 
	
	 public static String longestCommonPrefix4(String[] str) {
		 if(str==null||str.length==0) return "";
		 for (int i = 0; i < str[0].length(); i++) {
			char c=str[0].charAt(i);
			for (int j = 1; j < str.length; j++) {
				if (str[j].charAt(i)!=c||str[j].length()==i) {
					return str[0].substring(0, i);
				}
			}
		}
		 return str[0];
		 
	}
	 

}
