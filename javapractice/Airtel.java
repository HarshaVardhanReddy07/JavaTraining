package javapractice;

public class Airtel implements Mobileoperator {

	protected String name;
	public Airtel()
	{
		name="Airtel";
	}
	@Override
	public void support4G() {
		// TODO Auto-generated method stub
		System.out.println(name+" supports 4G by router");
		
	}

	@Override
	public void support5G() {
		// TODO Auto-generated method stub
		System.out.println(name+" supports 5G by router");
	}

	
}
