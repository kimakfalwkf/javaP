package ex4_Thread;

public class ThreadName extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.setName("Thread3");
		
		System.out.println("현재 진행되고 있는 스레드의 이름: "+Thread.currentThread().getName());
		System.out.println("현재 진행되고 있는 스레드의 상태: "+Thread.currentThread().getState());
		System.out.println("현재 진행되고있는 스레드의 우선순위: "+Thread.currentThread().getPriority());
	}
}
