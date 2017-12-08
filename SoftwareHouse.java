package baitap1;

import java.util.ArrayList;
import java.util.List;
 
public class SoftwareHouse {
	private String name; 
	private List<Programmer>staff;
	public SoftwareHouse(String name) {
		this.name=name; 
		this.staff = new ArrayList<>();
	}
	public void hire (Programmer pg ){
		staff.add(pg);
	}
	public List<Programmer> getStaff(){
		return this.staff;
	}
	public void display(){
		  System.out.println("TÊN CÔNG TY " +  this.name);
	}

}
