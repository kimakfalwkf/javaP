package loop;

public class While2 {
public static void main(String[] args) {
	//반복문: 유사한 코드 반복실행을 위해
	
	//안녕 15번
//	System.out.println("안녕");
//	System.out.println("안녕");
//	System.out.println("안녕");
//	System.out.println("안녕");
//	System.out.println("안녕");
//	System.out.println("안녕");
//	System.out.println("안녕");
//	System.out.println("안녕");
//	System.out.println("안녕");
//	System.out.println("안녕");
//	System.out.println("안녕");
//	System.out.println("안녕");
//	System.out.println("안녕");
//	System.out.println("안녕");
//	System.out.println("안녕");
	int i=0;
	//3번 수행
	while(i<3) {
		//반복 수행할 코드
		System.out.println("안녕");
		i++;//누적연산자
	}
	
	//while을 사용하려면 플래그 변수 필요/ 조건식 세우기/ 식 안에서 변수값 증가 필요
	
	//퀴즈: 반갑습니다 15번
	
	int J=0;
	while(J<15) {
		System.out.println("반갑습니다.");
		J++;
	}
}
}
