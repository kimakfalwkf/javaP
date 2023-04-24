package ex5_Thread;

public class JoinMain {
public static void main(String[] args) {
	JoinTest1 jt1=new JoinTest1();
	JoinTest2 jt2=new JoinTest2();
	
	Thread t1=new Thread(jt1);
	Thread t2=new Thread(jt2);
	
	t2.start();
	try {
		t2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}//t2를 제외한 나머지 스레드는 blocked상태로 만든다.
	t1.start();
	try {
		t1.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	for(int i=0; i<10; i++) {
		System.out.println("메인스레드: "+i);
	}
		
}
}
