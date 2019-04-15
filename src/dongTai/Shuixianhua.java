package dongTai;

public class Shuixianhua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 100; i < 200; i++) {
			if(shuixianhua(i)){
				System.out.println(i+" ");
			}
		}

	}
    private static boolean shuixianhua(int m){
    	int a,b,c;
    	 c=m/100;
    	 a=m%10;
    	 b=m/10-c*10;
    	 if(m==c*c*c+a*a*a+b*b*b){
    		 return true;
    	 }else{
    		 return false;
		}
	 }
  }
