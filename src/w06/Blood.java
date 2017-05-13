package w06;

public class Blood{
	//declare vars
	private int age;
	private String bloodType,message;
	//constructor
	public Blood(){
		age=0;
		bloodType="";
		message="";
	}
	//set methods
	public void setAge(int age){
		this.age=age;
	}
	public void setBloodType(String bloodType){
		this.bloodType=bloodType;
	}
	//compute/process
	public void compute(){
		if(age>=18){
			if(bloodType.equalsIgnoreCase("ab")){
				message="You can recieve from AB, give to AB, A, B, 0";
			}
			else if(bloodType.equalsIgnoreCase("a")){
				message="You can recieve from A and AB give to A and 0";
			}
			else if(bloodType.equalsIgnoreCase("b")){
				message="You can recieve from B and AB give to B and 0";
			}
			else if(bloodType.equalsIgnoreCase("o")){
				message="You can recieve from AB, A, B, 0 give to O";
			}
			else{
				message="Incorrect bloodtype entered";
			}
		}
		else{
			message="18+ only";
		}
	}
	//get method
	public String getMessage(){
		return message;
	}
}

