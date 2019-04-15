package dongTai;
/*写一个死锁例子*/
/*public class Sisuo implements Runnable {  
    public int flag = 1;  
    //静态对象是类的所有对象共享的  
    private static Object o1 = new Object(), o2 = new Object();  
    @Override 
    public void run() {  
        System.out.println("flag=" + flag);  
        if (flag == 1) {  
            synchronized (o1) {  
                try {  
                    Thread.sleep(500);  
                } catch (Exception e) {  
                    e.printStackTrace();  
                }  
                synchronized (o2) {  
                    System.out.println("1");  
                }  
            }  
        }  
        if (flag == 0) {  
            synchronized (o2) {  
                try {  
                    Thread.sleep(500);  
                } catch (Exception e) {  
                    e.printStackTrace();  
                }  
                synchronized (o1) {  
                    System.out.println("0");  
                }  
            }  
        }  
    }  
   
    public static void main(String[] args) {  
           
        Sisuo td1 = new Sisuo();  
        Sisuo td2 = new Sisuo();  
        td1.flag = 1;  
        td2.flag = 0;  
        //td1,td2都处于可执行状态，但JVM线程调度先执行哪个线程是不确定的。  
        //td2的run()可能在td1的run()之前运行  
        new Thread(td1).start();  
        new Thread(td2).start();  
   
    }  
}*/

public class Sisuo {
    private static Object lock1 = new Object();
    private static Object lock2 = new Object();

    public static void main(String[] args) {
            // TODO Auto-generated method stub
        /*Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run(){
                synchronized (lock1){
                    try{
                        System.out.println(Thread.currentThread().getName()+"获得了lock1锁");
                        Thread.sleep(500);//sleep的原因是等待thread2获取锁
                    }catch (InterruptedException ex){
                        ex.printStackTrace();
                    }
                    synchronized (lock2){
                        System.out.println(Thread.currentThread().getName()+"获得了lock2锁");
                    }
                }
            }
        },"Thread1");
        
        Thread thread2 = new Thread(new Runnable(){
            @Override
            public void run() {
                synchronized (lock2){
                    try{
                        System.out.println(Thread.currentThread().getName()+"获得了lock2锁");
                        Thread.sleep(500);
                    }catch (InterruptedException ex){
                        ex.printStackTrace();
                    }
                    synchronized (lock1){
                        System.out.println(Thread.currentThread().getName()+"获得了lock1锁");
                    }
                }
            }
        },"Thread2");
        
        
        thread1.start();
        thread2.start();*/
    	
    	sisuo();
            
    }
    
    public static void sisuo(){
    	 final Thread thread1=new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (lock1) {
					try {
						System.out.println("线程1已经获得锁1");
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (lock2) {
						System.out.println("线程1已经获得锁2");
					}
					
				}
			}
		});
    	
    	Thread thread2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				synchronized (lock2) {
					System.out.println("线程2获得锁2");
					synchronized (lock1) {
						System.out.println("线程2获得锁1");
					}			
				}
			}
		});
    	
    	thread1.start();
    	thread2.start();
    	
    }
    
}