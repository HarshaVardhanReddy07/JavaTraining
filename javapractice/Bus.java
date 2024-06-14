package javapractice;

public class Bus extends Vehicle implements Transport {

	private int busNumber;
	private String busServiceNumber;
	Fuel fuel;
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Bus starts");
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Bus stops!!!");
	}
	public int getBusNumber() { 
		return busNumber;
	}
	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}
	public String getBusServiceNumber() {
		return busServiceNumber;
	}
	public void setBusServiceNumber(String busServiceNumber) {
		this.busServiceNumber = busServiceNumber;
	}
	@Override
	public void bookTicket() {
		// TODO Auto-generated method stub
		System.out.println("booking ticket for bus");
	}
	@Override
	public void showTransport() {
		// TODO Auto-generated method stub
		
	}
	

}
