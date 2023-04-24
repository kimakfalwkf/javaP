package map;

import java.util.HashMap;
import java.util.Scanner;

public class MapEx3 {
public static void main(String[] args) {
	HashMap<String, Integer> map=new HashMap<String, Integer>();
	map.put("kim", 1111);
	map.put("lee", 2222);
	map.put("park", 3333);
	
	//키보드에서  id와 pw를 준비합니다
	//id: aaa
	//pw:1111
	//아이디가 존재하지 않습니다
	
	//id: lee
	//pw: 3333
	//비밀번호 불일치
	
	//"park", 3333
	//로그인 성공, 프로그램 종료
	
	while(true){//반복문
	Scanner sc=new Scanner(System.in);
	

	
	System.out.println("아이디를 입력: ");
	String id=sc.next();
	
	System.out.println("비밀번호를 입력: ");
	int pw=sc.nextInt();
	
	if(!map.containsKey(id)) {//?????느낌표 왜넣음
		System.out.println("아이디가 존재하지 않습니다");
	}
	
	else {
		if(map.get(id) !=pw) {
			System.out.println("비밀번호 불일치");
		}
		else {
			System.out.println("로그인 성공");
			break;
		}
	}
	
	}
	
	
	
	
	
	
	
	
	
	
}
}
