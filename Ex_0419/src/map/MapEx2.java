package map;

import java.util.HashMap;

public class MapEx2 {
public static void main(String[] args) {
	HashMap<String,Float>map=new HashMap<String,Float>();
	map.put("k1", 100.0f);
	map.put("k2", 3.14f);
	map.put("k3", 4.15f);
	
	if(map.containsKey("k3")) {  //(map.containsKey("k3"): 맵에 k3이 있다면 참
		System.out.println("k3라는 ket가 존재합니다");
	}
		
	if(map.containsValue(3.14f)) {
		System.out.println("맵에 3.14f가 존재합니다");
	}
	
}
}
