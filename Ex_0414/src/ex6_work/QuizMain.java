package ex6_work;

public class QuizMain {
	public static void main(String[] args) {
		QuizThread qt=new QuizThread();
		qt.start();
		qt.StartGame();
		
		
		
	}
	//QuizThread 클래스를 만들어 스레드를 상속받는다.
	//startGame 메서드를 만들고 그 안에서 1-100나이의 난수 두개를 합하는 문제를 출제
	//키보드에서 답을 입력하여 5문제가 정답이 될 때까지 로직 반복한다.
	
	//정답을 맞히고 난 후에 모든 문제를 맞히는데 몇 초가 걸렸는지 화면에 출력해서 프로그램 종료
	

	
	
	//실행결과
	//23+48=xx
	//정답
	
	//....
	
	// 결과: 30초...
}
