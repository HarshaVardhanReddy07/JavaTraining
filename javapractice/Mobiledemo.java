package javapractice;

public class Mobiledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Airtel airtel =new Airtel();
		
		airtel.support4G();
		airtel.support5G();
		
		Mobileoperator.showOperator();
		Docomo docomo=new Docomo();
		
		docomo.support4G();
		docomo.support5G();
		
	}

}
