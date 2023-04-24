package ex5_Thread;

public class SleepThread extends Thread{
	
	//sleep(): 스레드를 지정한 시간동안 blocked  상태로 만든다
	//시간은 1000분의 1초까지 지정할 수 있으며 지정된 시간이 지나면
	//스레드는 다시 Runnable상태로 돌아간다.
	
@Override
public void run() {
	System.out.println("카운트다운 5초");
	for(int i=5; i>=0; i--) {
		if(i !=0) {
			try {
				Thread.sleep(1000);
				System.out.println(i);
			} catch (InterruptedException e) {//간섭을 받을일이 있으면
				// TODO Auto-generated catch block
				e.printStackTrace();//오류문구를 띄워라
			}
		}
	}//for
	
	System.out.println("종료!");
}
}
