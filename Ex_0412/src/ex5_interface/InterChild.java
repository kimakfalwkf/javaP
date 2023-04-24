package ex5_interface;

public class InterChild implements InterTest{
//인터페이스 구현을 위해서는 구현하려는 클래스에 implements 키워드 사용
	@Override
	public int getNum() {
		// TODO Auto-generated method stub
		return NUM;  //InterTest의 상수 A 반환
	}

}
