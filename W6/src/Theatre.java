public class Theatre{
	//declare vars
	private String day;
	private int cost;
	//constructor
	public Theatre(){
		day="";
		cost=0;
	}
	//set methods
	public void setDay(String day){
		this.day=day;
	}
	//compute
	public void compute(){
		if(day.equals("Monday")||day.equals("Tuesday")||day.equals("Wednesday")){
			cost=30;
		}
		else if(day.equals("Friday")||day.equals("Saturday")||day.equals("Sunday")){
			cost=20;
		}
		else{
			cost=0;
			System.out.println("Incorrect day entered");
		}
	}
	//get
	public int getCost(){
		return cost;
	}
}