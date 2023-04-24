package ex2_Thread;

public class ThreadMain {
public static void main(String[] args) {
	ThreadTest tt=new ThreadTest();
	tt.start();
	
	RunnableTest rt=new RunnableTest();
	Thread t1=new Thread(rt);
	t1.start();
}
}
