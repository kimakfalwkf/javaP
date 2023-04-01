package cls;

public class Mehtod1 {
public static void main(String[] args) {
	//메서드 사용법
	//함수명();
	int result=3+4;//3과 4를 더한 결과를 반환
	//int err=3+;//+기호는 숫자를 앞뒤로 하나씩 넣어줘야함
	
	my4 mc4=new my4(); //객체화
	
	int re2=mc4.더하기(3,5);
	System.out.println(re2);
	
	
	
}
}
class my4{
	
	//메서드:  클래스 안의 함수 this 를 가지고 있음
	//메서드를 만든이유: 함수에 포인터 사용을 생략하기 위해서
	
	
	//메서드 만드는 방법(){}
	//자료형 함수명(){}
	
	//+  //숫자 두개를 받아서 합친 결과를 반환
	//더하기하는 기호 직접 만들어보기
	
	int 더하기(int num1,int num2) {  //값을 받기 위해서는 ()에 변수를 생성
		int re=num1+num2;
		return re; //결과값을 반환(사용한 곳에 전달한다)
		
		
	}
	
}