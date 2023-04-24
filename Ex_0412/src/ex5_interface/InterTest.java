package ex5_interface;

public interface InterTest {
//인터페이스에슷 상수와 추상메서드 이외에는 아무것도 들어갈 수 없다.
	
	final int NUM=100;  //상수명은 항상 대문자로 적기/final을 맨 앞에 적어야 함
	//num=120;  //상수는 대입이 다시 안됨
	
	abstract public int getNum();
	
	
	//interface에는 상수와 추상메서드만 오므로 final, abstract 생략가능하다
}
