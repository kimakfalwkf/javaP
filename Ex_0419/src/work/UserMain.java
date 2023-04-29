package work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMain {
public static void main(String[] args) {
	//유저의 아이디와 패스워드를 담을 수 있는 유저인포 클래스 생성 후
	//main 클래스에서 유저의 아이디와 비밀번호를 키보드에서 입력받아 객체에 저장하고
	//ArrayList에  추가해서 출력

	//결과
	//아이디생성:aaa
	//비번:1234
	//aaa
	//1234
	//-------------------
	//아이디생성:bbb
	//비번:5678
	//aaa
	//1234
	//----------------
	//bbb
	//5678
	//----------------
	List<UserInfor> list = new ArrayList<>();
	
	Scanner sc=new Scanner(System.in);

	outer: while(true)
	{

		UserInfor ui = new UserInfor();

		System.out.print("아이디 생성: ");
		ui.setId(sc.next());

		
		for (int i = 0; i < list.size(); i++) {
			if (ui.getId().equals(list.get(i).getId())) {
				System.out.println("중복된 아이디");
				continue outer;

			}
		}
		System.out.println("비번 생성: ");
		ui.setPw(sc.next());
		
		list.add(ui);
		for(UserInfor ui2: list) {
			System.out.println(ui2.getId());
			System.out.println(ui2.getPw());
			System.out.println("------------------------------");
		}
		


	}
	
}
}
