package factoryDesignPattern;

public class FactoryMain {
	
	public static void main(String[] args) {

		FactoryCreation fc = new FactoryCreation();

		OS ios = fc.getTheOS("IOS");

		ios.printSpecs();

		OS android = fc.getTheOS("Android");

		android.printSpecs();
	}

}
