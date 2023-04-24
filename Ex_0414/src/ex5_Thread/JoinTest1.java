package ex5_Thread;

public class JoinTest1 implements Runnable{
	//join(): 특정한 스레드가 작업을 먼저 수행할 떄 사용
	//실행순서를 지켜야 하는 스레드를 제어한다.
	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++) {
			System.out.println("t1: "+i);
		}
		
		System.out.println(".t1완료.");
	}

}
