package patterns;

public class SingletonPatternDemo {

	private static String demoString;
	private static int demoInt;
	private static char demoChar;
	
	
	private SingletonPatternDemo(String demoString, int demoInt, char demoChar) {
		SingletonPatternDemo.demoString=demoString;
		SingletonPatternDemo.demoInt=demoInt;
		SingletonPatternDemo.demoChar=demoChar;
	}
	
    private static SingletonPatternDemo instance = null;

	
	public static SingletonPatternDemo getInstance() {
        if (instance == null) instance = new SingletonPatternDemo( demoString,  demoInt,  demoChar);
        return instance;
	};
}
