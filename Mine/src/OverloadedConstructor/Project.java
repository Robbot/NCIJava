package OverloadedConstructor;

import java.util.Date;

public class Project extends Assesment {
	private Date deadline;
	
	public Project(String name, String type, int weighting, Date deadline){
		super(name, type, weighting);
		this.deadline = deadline;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	

}
