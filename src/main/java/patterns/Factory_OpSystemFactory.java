package patterns;

public class Factory_OpSystemFactory {

	public IFactoryOpSystem getInstance(String str) {
		if(str.equals("android")) {
			return new FactoryAndroid();
		}
		else if(str.equals("Windows")) {
			return new FactoryWindows();
		}
		else {
			return null;
		}
		
		
		
	}
}
