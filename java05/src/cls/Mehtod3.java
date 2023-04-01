package cls;

public class Mehtod3 {
public static void main(String[] args) {
	my6 mc6=new my6();
	System.out.println(""+mc6.func(24)); //위 아래 다른 함수
	System.out.println(""+mc6.func(24,34));//위 아래 다른 함수
}
}
class my6{
	//클래스 안에는 변수와 매서드만 올수 있다,
	int num;
	 String str;
	 int func() {
		 return 0;
		 //메서드 안에는 코드를 쓸 수 있다.
	 }
	 //메서드 오버로딩: ()안의 내용이 달라지면 다른 메서드로 퀴급해줄 수 있다.
	 int func(int num1) {
		 return num1;
		 //메서드 안에는 코드를 쓸 수 있다.
	 }
	 int func(int num1, int num2) {
		 return num1+num2;
		 //메서드 안에는 코드를 쓸 수 있다.
	 }
}