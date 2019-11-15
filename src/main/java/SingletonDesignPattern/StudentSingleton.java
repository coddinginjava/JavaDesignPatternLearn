package SingletonDesignPattern;

public class StudentSingleton {

	private static volatile StudentSingleton student = null;

	private StudentSingleton() {
		if (student != null) {
			throw new RuntimeException("dont use reflection use getinstance method to create the instance");
		}
	}

	public static StudentSingleton getInstance() {

		if (student == null) {
			synchronized (StudentSingleton.class) {
				if (student == null) {
					student = new StudentSingleton();
				}
			}
		}
		return student;
	}
}
