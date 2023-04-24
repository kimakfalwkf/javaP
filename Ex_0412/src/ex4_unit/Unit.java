package ex4_unit;

public abstract class Unit {
	String name;//이름
	int energy;//체력
	
	abstract public void decEnergy();
	//캐릭터라 공격을 당했을때 체력 감소량을 관리하기 위한 메서드
	//가각 체력 감소량이 다르다고 가정해서 추상메서드로 정의
	
	
	public  int getEnergy() {
		return energy;
	}
}
