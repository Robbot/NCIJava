package OverloadedConstructor;

public class AssesmentApp {
	public static void main(String[] args){
		
		Assesment a =  new Assesment();
		
		a.setName("OOP Project");
		a.setType("Continous Assesment");
		a.setWeighting(35);
		
		System.out.println("Assesment Name "+a.getName());
		System.out.println("Assesment Type "+a.getType());
		System.out.println("Assesment Weighting: "+a.getWeighting());
		
		
		Assesment b = new Assesment("OOP Exam", "Terminal Assement", 50);
		
		System.out.println("Assesment Name "+b.getName());
		System.out.println("Assesment Type "+b.getType());
		System.out.println("Assesment Weighting: "+b.getWeighting());
		
		//new instance of the Project class called p
		//Date d = new Date(28,03,2013);
		Project p = new Project("OOP Project", "Continous Assesment", 30, 14862528000);
		
		System.out.println(p.getName());
		System.out.println(p.getType());
		System.out.println(p.getWeighting());
		System.out.println(p.getDeadline());
	}
}
