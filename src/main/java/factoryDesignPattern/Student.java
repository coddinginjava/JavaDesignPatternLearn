package factoryDesignPattern;

public abstract class Student {

	private int totalStudents;
	
	abstract void getStudents();
	
	public void totalStrength(int totalStudents) {
		System.out.println("Students and staff is -> " + (totalStudents+2));
	}
	
}
