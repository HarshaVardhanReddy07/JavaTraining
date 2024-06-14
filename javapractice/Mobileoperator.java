package javapractice;

public interface Mobileoperator {


	public abstract void support4G();
	public default void support5G() {
		System.out.println("yet to be supported in the near future!");
	};
	public static void showOperator()
	{
		System.out.println(" Every operator must follow the rules of TRAI, The operator is:");
		System.out.println("""
				1.Operator should maintain privacy for the user data
				2.Operator should pay the ....
				""");

	}
	
}
