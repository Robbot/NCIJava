
public class Name {
	//declare variables
	private String name;
	private int len;
	private char firstLetter;
	private char lastLetter;
	
	//constructor
	public Name(){
		name = " ";
		len = 0;
		firstLetter = ' ';
		lastLetter = ' ';
	}
	//set method
	public void setName(String name){
		this.name = name;
	}
	//compute method
	public void compute(){
		len = name.length();
		firstLetter = name.charAt(0);
		lastLetter =  name.charAt(len-1);
	}
	//get method
	public int getLen(){
		return len;
	}
	public char getFirstLetter(){
		return firstLetter;
	}
	public char getLastLetter(){
		return lastLetter;
	}
}
