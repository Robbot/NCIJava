package overloadedConstructor;
import java.util.Date;
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
		Date d = new Date(28,03,2017);
		Project p = new Project("OOP Project", "Continous Assesment", 30, d);
		
		System.out.println(p.getName());
		System.out.println(p.getType());
		System.out.println(p.getWeighting());
		System.out.println(p.getDeadline());
		
		//A new instance of the Test Class
		Test t = new Test("OOP Exam", "Terminal", 70,10,60);
		System.out.println(t.getName());
		System.out.println(t.getType());
		System.out.println(t.getWeighting());
		System.out.println(t.getDuration());
		System.out.println(t.getNumQuestions());
	}
}
