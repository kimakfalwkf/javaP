package ex6_interface;

public class Kitchen implements Menu1{

	@Override
	public String boggembab() {
	
		return "계란+춘장+쌀";
	}

	@Override
	public String tangsu() {
		
		return "고기+양념+양파";
	}

	@Override
	public String jajang() {
		
		return "면+춘장+완두콤";
	}

	@Override
	public String jambbong() {
		
		return "면+육수+해붛";
	}

}
