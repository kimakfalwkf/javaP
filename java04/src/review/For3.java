package review;

public class For3 {
	public static void main(String[] args) {
		// for(초기값;조건식;누적연산){반복코드;}
		for (int i = 0; i < 20; i += 2) {
			System.out.println(i + " ");
		}
//for문의 초기값을 밖에서 만들 수 있다
		int j=0;
		//변수를 for밖에서 만들면 조건문이 종료되도 변수 유지, 안에 변수를 만등면 조건문종료지 변수도 없어짐
		for(j=1;j<=10;j++) {
			System.out.println(j+" ");
		}
		System.out.println("for문 끝 "+j); //for문 밖에서 문자를 형성해서 변수 유지
		//for문 무한반복
		for(;;) {
			System.out.println("무한반복");
			break;
		}
		for(;j<20;) {
			System.out.println(j);
			j+=2;
		}
		
		
	}

}
