package patterns;

public class FactiryMain {

	public static void main(String[] args) {

		
		Factory_OpSystemFactory fact = new Factory_OpSystemFactory();
		
		IFactoryOpSystem obj = fact.getInstance("android");
		obj.specification();
		IFactoryOpSystem obj2 = fact.getInstance("Windows");
		obj2.specification();

	}

}
