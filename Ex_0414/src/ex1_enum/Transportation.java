package ex1_enum;

public enum Transportation {
	BUS(100) {
		@Override
		int totalFare(int distance) {
			// TODO Auto-generated method stub
			return distance *fare;
		}
	},TRAIN(150) {
		@Override
		int totalFare(int distance) {
			// TODO Auto-generated method stub
			return distance *fare;
		}
	},SHIP(200) {
		@Override
		int totalFare(int distance) {
			// TODO Auto-generated method stub
			return distance *fare;
		}
	},AIRPLANE(250) {
		@Override
		int totalFare(int distance) {
			// TODO Auto-generated method stub
			return distance *fare;
		}
	};//값을 넣어주면 ; 필요
	int fare;// 위의 값이 바로 대입
	
	Transportation(int fare){
		this.fare=fare;

		//클래스일떄 이와 같다.
		
		//public static final int Transportation BUS=new Transportation(100);
		
	}
	abstract int totalFare(int distance);
	
	
}
