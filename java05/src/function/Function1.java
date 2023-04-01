package function;

public class Function1 {
	
	//main(){}: 메인 메서드
	//메서드(함수) 코드를 저장해놓고 사용할 떄 그 코드들을 실행
	//main함수에 코딩을 하면>> 프로그램 실행시 mian함수 실행
public static void main(String[] args) {
	//자바에서는 막혀있지만 한수 개념이 있다.
	//함수: 코드를 저장해놓는 공간(){}
	//변수: 값을 저장하는 공간
	System.out.println(); //출력을 해주는 함수/출력 코드가 저장되어 있음
	
	//자바에서는 함수를 직접적로 사용하지 않고 
	//클래스 안에 담아서 '매서드' 개념으로 사용(c언어에서는 클래스 밖에서 함수)
	//자바는 클래스 밖 코딩을 허락하지 않음, 자바의 출시목적이 모든 프로그래밍 언어를 통일하기 위해서=근데 망함ㅋㅋ
	
	//메인의 static: 정적, 고정시켜놓음, 어디서든 접근할 수 있게 함/대신 많이쓰면 프로그램이 느려짐
	함수명(3,4,5); //안의 숫자를 한번에 더해주는 기호(연산자=함수=매서드)
	
	함수명(1,3,5);
	
}
//mian이 static이여서 static함수로 생성/일반적으로static 없음
static void 함수명(int num1, int num2,int num3) {
	//함수라는 것은 사용자가 직접 만드는 연산자(코드저장)
	//숫자 3개를 한번에 더할 수 있는 연산자(+는 2개만 더하기 가능)
	//A+B
	//함수명(A,B,C)
	System.out.println(num1+num2+num3);
	
}

}