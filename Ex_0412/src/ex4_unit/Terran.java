package ex4_unit;

public class Terran extends Unit {
	//날면 t 아니면,f
	boolean fly;
	
	public Terran(String name, int energy, boolean fly) {
		super.name=name;
		super.energy=energy;
		this.fly=fly;
	}
	
	@Override
	public void decEnergy() {
		energy -=3;
		
	}

}
