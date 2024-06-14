package javapractice;

public class Docomo implements Mobileoperator {
	protected String name;
	
	public Docomo()
	{
		name="Docomo";
	}
	@Override
	public void support4G() {
		// TODO Auto-generated method stub
		System.out.println(name+" supports 4G by router");
	}
	
	public void support5G()
	{
		System.out.println(name+" supports 5G now...");
	}
}
