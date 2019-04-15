package dongTai;
/*懒汉式*/
public class Singleton {
	private Singleton(){
		
	}
    private static Singleton instance;
    private static Singleton getInstance(){
    	if(instance==null){
    	 instance=new Singleton();
    	}
    	return instance;
    }   
}
/*懒汉式2 同步方法*/
/*public class Singleton2{
	private Singleton2(){
		
	}
	private static Singleton2 singleton2;
	private static synchronized Singleton2 getInstance(){
		if (singleton2==null) {
			singleton2=new Singleton2();
		}
		return singleton2;
	}
}*/