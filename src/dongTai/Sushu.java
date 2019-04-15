package dongTai;
//打印出100以下的素数
public class Sushu {
	public static void main(String[] args) {
		int i,j,k;
		for (i = 2; i < 100; i++) {
			k=(int)Math.sqrt(i);
			for (j = 2;j<=k; j++) {
				if(i%j==0){
					break;
				}
			}
			if(j>k){
				System.out.println(i+"  ");
			}
		}
	}

}
