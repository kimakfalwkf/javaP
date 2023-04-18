package ex1_abstract;

public class AbsMain {
public static void main(String[] args) {
	//Absparent ap=new Absparent();
	//일반적인 객체화 방법으로는 추상클래스를 객체화 시킬수 없다.
	
	//추상클래스는 자신의 기능을 자식이 완성시키도록 조건부 상속하여 자식클래스가 생성될 떄 객체화된다.
	AbsChild ac=new AbsChild();
		ac.setValue(20);
	System.out.println(ac.getValue());                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
	
}
}
