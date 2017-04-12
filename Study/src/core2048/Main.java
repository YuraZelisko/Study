package core2048;

import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public class Main {

	public static void main(String[] args) throws InterruptedException {
//		Thread.currentThread().setName("my threat");
//		System.out.println(Thread.currentThread().getName());
//		MyThreat myThreat = new MyThreat();
//		myThreat.start();
//		myThreat.join();
//		MyThreat myThreat2 = new MyThreat();
//		myThreat2.start();
//		System.out.println(1111111);
//		Thread thread = new Thread(new MyRunnable());
//		thread.start();
//		Thread thread = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("in annon class");				
//			}
//		});
//		thread.start();
//		(new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("start");
//				
//			}
//		})).start();
//		MyThreat myThreat = new MyThreat();
//		myThreat.start();
//		int counter = 0;
//		while (counter<5) {
//			System.out.println(counter);
//			counter++;
//			if(counter==5){
//				Main main = new Main();
//				main.wakeUp(new Thread(new Runnable() {
//					
//					@Override
//					public void run() {
//						// TODO Auto-generated method stub
//						
//					}
//				}));
//				myThreat.notify();
//			}
//			
//		}
//		
//		}
//	public synchronized void wakeUp(Thread threat){
//		threat.notify();
		
//		ScheduledExecutorService service = Executors.new
		
		
			int a = 1;
			int b = 1;
			Scanner scanner = new Scanner(System.in);
			int n = scanner.nextInt();
			if(n==1){
				System.out.println(1);
			}
			else if(n==0){
				System.out.println("insent valuse from 1 to infinity");
			}
			else if(n<0){
				System.out.println("insert value from 1 to infinity");
				
			}
			else{
			System.out.println(1);
			System.out.println(1);
			for (int i = 0; i < n-2; i++) {
				int sum = a+b;
				a=b;
				b=sum;
				System.out.println(sum);
				
			}
				
			}
	}

}
