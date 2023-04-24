package ex5_Thread;


import java.util.Scanner;

public class ThreadCount extends Thread {
//스캐너를 이용해 숫자를 입력받고
	//스레드에서 입력받은 숫자가 1씩 감소하다가 0이 되었을떄 
	//종료라는 메세지와 함께 스레드를 빠져나오게 하자
	Scanner sc=new Scanner(System.in);
	int a;
	@Override
	public void run() {
		System.out.println("숫자를 입력: ");
		a=sc.nextInt();
		
		for(int i=a; i>=0; i--) {
			
			if(i !=0) {
				try {
					Thread.sleep(1000);
					System.out.println(i);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}System.out.println("종료");
	
	}

	
}
