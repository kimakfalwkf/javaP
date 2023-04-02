package cls;

public class Constructor2 {
public static void main(String[] args) {
	Person a=new Person("A",18);
	Person b=new Person("B",81);
	
	PersonView view=new PersonView();  
	PersonView view2=new PersonView(b);
	
	view.test(a); //들러온 값을 저장하고 정보출력
	view2.test();  //바로 정보출력
}
}
class Person{
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	
	private String name;
	private int age;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
class PersonView{
	private Person person;
	
	public PersonView() {
		
	}
	// 생성자 오버로딩 : 받아온 객체를 멤버변수에 백업
		// PersonView b = new PersonView(person);
	public PersonView(Person person) {
			this.person = person;
		}
	//메서드(멤버면수 출력용)
	public void test() {
		System.out.println(person.getName()+"(은)는 "+person.getAge()+"살 입니다");
	}
	
	// 메서드 오버로딩(바뀐사람으로 저장 후 출력)
	public void test(Person person) {
		this.person=person;
		System.out.println(person.getName()+"(은)는 "+person.getAge()+"살 입니다");
	}
	
	
}