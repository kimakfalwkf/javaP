package cls;

public class Class2 {
public static void main(String[] args) {
	person 이순신=new person();
	person 아빠=new person();
	person 나=new person();   //객체화를 할 떈 추상적인 클래스를 구체적으로 명시
	
	//클래스(설계도): 대상 아님
	//객체(object): 대상을 정한다
	
	이순신.이름="이순신";
	이순신.나이=36;
	이순신.키=188.8;	
	
	//이순신 객체의 정보 입력
	이순신.말하기();  //person에사 만든 메서드
	
	나.이름="홍길동";
	나.나이=20;
	나.키=177.1;	
	
	나.말하기();    //person에사 만든 메서드
	
}
}
//클래스는 포괄적인 개념>.객체는 구체적인 물체
class person{
	//'사람'클래스
	
	//변수==정보(사람이라면 갖고 있어야 하는 정보)
	String 이름;
	int 나이;
	double 키;    //변수는 클래스의 정보들을 저장하기 위해 생성
	
	//메서드==행위(사람이 할 수 있는 행위)/객체에 따라 황용되는 정보가 다름
	
	void 말하기() {
		System.out.println(이름+"(이)가 "+나이+"살이라고 말합니다.");
	}
	void 걷기() {
		int 거리=3;
		System.out.println(이름+"은"+거리+"km만큼 걷습니다");
	}
}