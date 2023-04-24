package ex4_Thread;

public class MainThread {
public static void main(String[] args) {
	ThreadName tn=new ThreadName();
	tn.start();
	
	System.out.println("현재 진행되고 있는 스레드의 이름:1 "+Thread.currentThread().getName());
	System.out.println("현재 진행되고 있는 스레드의 상태:1 "+Thread.currentThread().getState());
	System.out.println("현재 진행되고있는 스레드의 우선순위:1 "+Thread.currentThread().getPriority());
	
	//우선순위는 1에서 10까지이며 숫자가 적을 수록 느린것이다.
}
}
