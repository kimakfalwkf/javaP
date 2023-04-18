package ex1_abstract;

abstract public class AbsParent {

	//추상메서드를 하나라도 가지고 있는 클래스는 추상클래스라고 정의한다
	
	int value=100;
	
	
	
	public int getValue() {//일반적인 메서드
		return value;
		
	}
	public abstract void setValue(int n);//추상메서드=미완성적 개념(body가 없어서)
	//=abstract public void setValue(int n);
	
	//그러므로 이 미완성적 개념을 자식이 물려받아서
	//완성시켜야 하는 것이 하나의 조건이 된다.
	
	

}

