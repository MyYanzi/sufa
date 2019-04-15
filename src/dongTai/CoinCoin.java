package dongTai;

/*学习动态规划的思想，采用自底向上，用迭代去实现
 * 题目描述:如果我们有面值为1元、3元和5元的硬币若干枚，如何用最少的硬币凑够11元？
 * */

public class CoinCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int m=11; 
		  System.out.println(m + "元最少需要" +conincoin(m) + "个硬币！");
	}
	
	private static int conincoin(int m){
		int[] a={1,3,5};//硬币的数值
		int[] temp=new int[m+1];//存储所需硬币的数目
		for(int i=0;i<=m;i++){
		  temp[i]=i; //默认全部使用1元，则i元最多使用i个币
		}
		for(int i=1;i<=m;i++){//这个外循环，依次对1到m个钱数，进行凑数
			for(int j=0;j<3;j++){//这个内层循环，每次会固定执行3次
				 if(a[j]<=i && temp[i-a[j]]+1<temp[i]){
					 temp[i]=temp[i-a[j]]+1;
				 }
			}
		}
		
		return temp[m];
		
	}

}
