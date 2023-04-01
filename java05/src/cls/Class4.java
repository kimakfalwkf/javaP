package cls;

public class Class4 {
public static void main(String[] args) {
	
	//1.객체화
	//2.setStr
	my8 mc8=new my8();
	mc8.setStr("담기!");
	mc8.getStr();
}
}
class my8{
	//클래스: 변수와 함수를 묶어놓은것
	//변수>>멤버함수
	//함수>>메서드
	String str;// 클래스 멤버변수
	
	void func() {}//클래스에 있는  함수는 메서드'
	//this(포인터)
	
	void setStr(String a_str) {
		//str변수에 값을 담는 함수
		str=a_str;
		
	}
	//this(포인터)
	
	void setStr1(String str) {
		//str변수에 값을 담는 함수
		this.str=str; 	//this(포인터)쓰면 보이드 함수 밖의 str 로 인식
		
		
	}
	String getStr() {
		//str변수를 사용하는 함수
		System.out.println("애옹");
		return str;
	}
}