package ex3_Thread;

public class ThreadMain {
public static void main(String[] args) {
	MyThread mt=new MyThread();
	mt.start();//run() 메서드를 호출하는 메서드
	//run()을 호출하면 독릭적인 실행이 안되서 일반 메서드처럼 순차적으로 표기
	//start()는 독립적으로 수행해서 순서가 섞임/근데 시발 난 순차적이네 뭐가문제냐고
	
	MyThread2 mt2=new MyThread2();
	Thread t=new Thread(mt2);
	t.start();
}
}
