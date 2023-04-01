package cls;
//public class 한 파일에 하나만
public class Class1 {
public static void main(String[] args) {
	//클래그와 메서드(코딩 방법론)
	//객체 지향 OOp
	//c언어에ㅐ는 구조체 라는 문법이 있음
	//변수들을 뭉쳐놓는 방법
	//근대 포인토 개념을 가리기 위해 구조체에 함수를 넣고 이름을 바꾼것이 클래스
	
	
	//클래스: 변수와 함수를 담아놓는 공간
	// 클래스를 다른 클래스에서 사용해려면 객체화 필요
	
	
	//객체화 하는 법
	//클래스명 객체명=new 클래스명();
	
	//Class1에서 my를 사용하고 싶다>> my 를 객체화
	
	my 변수명1=new my();
	
	//변수명1 이라는 이름으로 "객체화'/킄래스를 통해 객체를 실행
	//객체를 통해서 클래스(my)의 변수와 메서드를 사용가능
	변수명1.메서드명();
	변수명1.num=3;
System.out.println(변수명1.num);
	
}
}	
	class my{
		//클래스: 변수+함수
		//변수
		int num;
		String str;
		
		void 메서드명() {
			System.out.println("메서드를 사용했다");
			
		}
		
		
		int 정수형_메서드명() {
			System.out.println("정수형 메서드를 사용했다");
			return 0;
		}
	String  문자열형_메서드() {
		System.out.println("문자열형 메서드 사용");
		return "";
	}
	}


