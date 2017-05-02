package OverloadedConstructor;

public class Assesment {
	private String name;
	private String type;
	private int weighting;
	
	public Assesment(){
		name = new String();
		type = new String();
		weighting = 0;
	}
	
	//overloaded constructor, cool isn't? the order of argument is very important
	public Assesment(String name, String type, int weighting){
		this.name = name;
		this.type = type;
		this.weighting = weighting;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getWeighting() {
		return weighting;
	}

	public void setWeighting(int weighting) {
		this.weighting = weighting;
	}
}
