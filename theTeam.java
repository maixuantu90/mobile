package baitap1;

import java.util.ArrayList;
import java.util.List;

public class theTeam {
	private String name;
	private String leader;
	private List<Programmer> team;
	 
	public theTeam(String name){
		this.name = name;
		this.team = new ArrayList<>();
		
	}
	public void setLeader(Programmer leader){
		team.add(leader);
		this.leader = "Leader: " + leader.getName();
	}
	
	public void addMember(Programmer pgm){
		team.add(pgm);
	}
	
	public List<Programmer> getTeam(){
		return this.team;
	}
	
	public void display(){
		System.out.println("------------Team: " + this.name + "--------------");
		System.out.println(this.leader);
		System.out.println("List Employees");
	
	}
}
