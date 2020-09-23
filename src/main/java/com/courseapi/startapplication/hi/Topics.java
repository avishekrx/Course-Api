package com.courseapi.startapplication.hi;

public class Topics {

	
	private String name;	
	private String desc;
	private int fees;
	
	public  Topics()
	{
		
	}
	
	public Topics(String tname,String tdesc,int tfees)
	{
		super();
		this.name = tname;
		this.desc = tdesc;
		this.fees = tfees;
		
	}
	
	
	public String getName() {
	return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	
}
