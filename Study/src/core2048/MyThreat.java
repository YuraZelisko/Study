package core2048;

public class MyThreat extends Thread{
	public void run(){
		
//		try {
//			Thread.currentThread().sleep(2000);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		System.out.println(2222);
		try {
//			someWait();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i < 10; i++) {
			System.out.print(i+" ");
		}
		
		
	}
	
}
