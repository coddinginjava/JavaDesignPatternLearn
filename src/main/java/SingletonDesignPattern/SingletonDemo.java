package SingletonDesignPattern;

public class SingletonDemo {

	public static void main(String[] args) {

		StudentSingleton student = StudentSingleton.getInstance();

		StudentSingleton anotherStudent = StudentSingleton.getInstance();

		System.out.println(student == anotherStudent);

		System.out.println(student);

		System.out.println(anotherStudent);

	}

}
