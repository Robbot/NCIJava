
public class Measure {

	private int m;
	private int cm;
	
	//constructor
	public Measure() {
		m=0;
		cm=0;
	}
	
	//set methods - one for every input
	public void setM(int m){
		this.m = m;
	}
	//compute - process
	public void compute(){
		cm = m*100;
	}
	//get method - one for every input
	
	public int getCm(){
		return cm;
	}
}
