package cls;

public class CLass6 {
public static void main(String[] args) {
	car dad=new car();
	//dad.name="";  //private 직접 사용이 불가능해짐/대입
	//System.out.println(dad.name); //private 직접 사용이 불가능해짐/사용
	dad.setName("제네시스");
	System.out.println(dad.getName());

}
}

//멤버면수는 private, 메서드는 public

//접근권한 제어자
  //private: 다른 클래스에서 접근 불가능
 //default아무것도 안적으면 : 다른 패키지에서 접근 불가능
//protect: 다른 패키지에서 접근 불가능하지만 상속했을 경우엔 가능
//public:접근 가능(같은 프로젝트 내)

//캡술화: 멤버변수를 프라이빗으로 만들어서 외부 클래스로부터 데이터를 보호하고 퍼블릭 메서드로 제공한다

class car{
	//차종, 색상, 크기
	private String name;  //private: 다른 클래스에서 접근 불가능
	private String colar;
	private int num;
	//대입을 위해서는 set
	
	public void setName(String name) {
		this.name=name;
	}
	public void setColoar(String colar) {
		this.name=name;
	}
	public void setNum(int num) {
		this.name=name;
	}
	
	//사용을 위해서는 get
	public String getName() {
		return name;
	}
	public String getColoar() {
		return colar;
	}
	public int getNum() {
		return num;
	}
}