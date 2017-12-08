package baitap1;

import java.util.List;

public class Main {
	public static void main (String[] args){
		Programmer tu = new Programmer("Tứ","CSharp");
		Programmer xuan = new Programmer("Xuân", "Java");
		Programmer mai = new Programmer("Mai", "PHP");
		Programmer kha = new Programmer("Khả", "Java");
		Programmer le = new Programmer("Lê", "VB");
		 
		SoftwareHouse vnpt = new SoftwareHouse("VNPT");
		vnpt.hire(tu);
		vnpt.hire(xuan);
		vnpt.hire(mai);
		vnpt.hire(kha);
		vnpt.hire(le);
		
		theTeam teamAndroid = new theTeam("Android"); 
		teamAndroid.addMember(xuan);
		teamAndroid.addMember(mai);
		teamAndroid.setLeader(tu);
		
		theTeam teamiOS = new theTeam("iOS");
		teamiOS.addMember(kha); 
		teamiOS.setLeader(le);
		 
		vnpt.display();
		teamAndroid.display();
		List<Programmer> list1 = teamAndroid.getTeam();
		for(Programmer pgmA : list1)
			pgmA.display();
		
		teamiOS.display();
		List<Programmer> list2 = teamiOS.getTeam();
		for(Programmer pgmI : list2)
			pgmI.display();
	}
}
