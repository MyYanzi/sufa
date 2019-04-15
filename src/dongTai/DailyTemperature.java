package dongTai;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DailyTemperature {
	/*根据每日 气温 列表，请重新生成一个列表，对应位置的输入是你需要再等待多久温度才会升高的天数。如果之后都不会升高，请输入 0 来代替。
	例如，给定一个列表 temperatures = [73, 74, 75, 71, 69, 72, 76, 73]，你的输出应该是 [1, 1, 4, 2, 1, 1, 0, 0]。
	提示：气温 列表长度的范围是 [1, 30000]。每个气温的值的都是 [30, 100] 范围内的整数。*/

	public static void main(String[] args) {
		int[] a={73, 74, 75, 71, 69, 72, 76, 73};
		int[] b=dailyTemperatures2(a);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

	}
	
	public static int[] dailyTemperatures2(int[] T) {
        int len = T.length;
		int[] dist = new int[len];
		//用栈记录下遍历过元素的下标，
		Stack<Integer> stack = new Stack<Integer>();
		//当前元素和栈中记录的下标处的元素进行比较，如果大那么出栈，并设出栈下标为差值，循环，这样遍历完成之后即可得到解。
		for (int i = 0; i < len; i++) {
			while (!stack.isEmpty() && T[i] > T[stack.peek()]){
				int preIndex = stack.pop();
				dist[preIndex] = i - preIndex;
			}
			stack.add(i);
		}
		return dist;
    }
	
    
    public static int[] dailyTemperatures(int[] T){
    	List<Integer> list=new ArrayList<Integer>();
    	for (int i = 0; i <T.length; i++) {
    		 int a=T[i];
    		 int d=T.length;
			for (int j = i+1; j <= T.length; j++)
			if (j==d){
				int c=0;
				list.add(c);
				break;
			 }else if (a>T[d-1]&&j==d-1) {
				 list.add(0);
				break;
			}else {
				if (a<T[j]){
					  int b=j-i;
			          list.add(b);
			          break;
				}
			}
		
		}
    	for (int i = 0; i < T.length; i++) {
			T[i]=list.get(i);
		}
		return T;
    }
    public static int[] dailyTemperatures3(int[] T){//[73, 74, 75, 71, 69, 72, 76, 73]
    	int n=T.length;
    	int[] dist=new int[n];
    	for (int i = 0; i < n-1; i++) {
			int a=T[i];
			int j=i+1;
			while(a>T[j] ||(a==T[j]&&j!=i)){
				if (j<n-1) {
					j++;
				}else {
					j=i;
				}
			}
			dist[i]=j-i;
		}
		return dist;
    	
    }
    

}
