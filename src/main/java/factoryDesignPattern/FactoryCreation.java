package factoryDesignPattern;

public class FactoryCreation {

	public OS getTheOS(String OsType) {

		if (OsType.equalsIgnoreCase("Android")) {
			return new Android();
		}

		else if (OsType.equalsIgnoreCase("IOS")) {
			return new IOS();
		} else
			return null;

	}

}
