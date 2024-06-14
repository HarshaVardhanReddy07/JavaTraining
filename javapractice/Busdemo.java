package javapractice;

public class Busdemo {

	public static void main(String[] args) {
		
		Bus b=new Bus();
		
		b.fuel=Fuel.DISEL;
		
		b.setBusNumber(111);
		b.setBusServiceNumber("AP1345");
		
		b.showvehicle();
		
		b.start();
		b.stop();
		
		
}
}
