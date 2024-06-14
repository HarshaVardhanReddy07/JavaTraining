package javapractice;

public abstract class Vehicle {

	private int id;
	protected String vehicleAccess;
	
 Fuel fuel;
	
public abstract void start();

public abstract void stop();

public void showvehicle() {
	
	System.out.println(this);
	
}

@Override
public String toString() {
	return "Vehicle [id=" + id + ", vehicleAccess=" + vehicleAccess + ", fuel=" + fuel + "]";
}


}
