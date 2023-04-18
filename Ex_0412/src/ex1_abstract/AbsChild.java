package ex1_abstract;

public class AbsChild extends AbsParent{
//추상 클래스를 상속받은 자식클래스는
	//부모가 가지고 있는 추상 메서드(미완성)을 무조건 받아둬야한다.
	//재정의할 필요는 없지만 오버라이딩을 해서 가지고는 있어야 한다.
	@Override
	public void setValue(int n) {
		System.out.println("추상메서드 재정의");
		
	}


}
