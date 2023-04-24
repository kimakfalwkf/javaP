package ex6_work;

import java.util.Random;
import java.util.Scanner;

public class QuizThread extends Thread{
	int su1,su2;
	int timer=0;
	int playCount=0;
	boolean isCheck=true;
	final int Fin=5;
	
	
	public void StartGame() {
		while(isCheck){
			su1=new Random().nextInt(100)+1;
			su2=new Random().nextInt(100)+1;
			
			System.out.print(su1+"+"+su2+" = ");
			Scanner sc=new Scanner(System.in);
			int result=sc.nextInt();
			
			if(result==(su1+su2)) {
				System.out.println("정답");
			}else {
				System.out.println("오답");
				continue;//다시 위로 올라가서 반복
			}
			
			playCount++;
			
			if(playCount==Fin) {
				System.out.println("결과: "+timer+"초...");
				isCheck=false;
			}
		} 
	}//startGame
	
	@Override
	public void run() {
		while(isCheck) {
			try {
				Thread.sleep(1000);
				timer++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
