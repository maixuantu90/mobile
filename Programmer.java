package baitap1;

public class Programmer extends Employee {
	String language;
	
	public Programmer(String name, String language){
		super(name);
		this.language=language;
	}
	
	public void display(){
		System.out.println(super.getName() + " - lập trình viên " + this.language);
	}
	

	
	
	
}
