package ex6_interface;

public interface Menu1 extends Menu2, Menu3 {
	//인터페이스는 인터페이스끼리만 상속이 가능하다
	//인터페이스는 구현능력이 없어서 다중상속도 가능하다
	
	abstract public String jajang();
	
	abstract public String jambbong();


}
