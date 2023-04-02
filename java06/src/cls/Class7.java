package cls;

public class Class7 {
public static void main(String[] args) {
	human man=new human();
	man.setname("A");
	man.setgender("male");
	man.setage(23);
	
	human woman=new human();
	woman.setname("B");
	woman.setgender("female");
	woman.setage(26);
	
	Hview viewP=new Hview();
	viewP.printN(man);
	viewP.printN(woman);
}
}
//멤버면수 프라이빗
//메서드 퍼블릭
class human{
	
	//데이터: name, gender, age
	private String print;
	private String name;
	private String gender;
	private int age;
	
	
	public void setname(String name) {
		this.name=name;
	}
	public void setgender(String gender) {
		this.gender=gender;
	}
	public  void setage(int age) {
		this.age=age;
	}
	//=======================================
	public String getname() {
		return name;
	}
	public String getgender() {
		return gender;
	}
	public int getage() {
		return age;
	}
	
	
}

class Hview{
	public void printN(human man) {
		System.out.println("이름: "+man.getname()+", 성별: "+man.getgender()+", 나이: "+man.getage());
		
	}
	
}