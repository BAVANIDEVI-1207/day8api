package com.example.project.model;

public class Model {
	private int bikeid;
	private String regName;
	private String ownerName;
	private int year;
	private String bikeName;
	private String modelName;
	public Model(int bikeid, String regName, String ownerName, int year, String bikeName, String modelName) {
		super();
		this.bikeid = bikeid;
		this.regName = regName;
		this.ownerName = ownerName;
		this.year = year;
		this.bikeName = bikeName;
		this.modelName = modelName;
	}
	public int getBikeid() {
		return bikeid;
	}
	public void setBikeid(int bikeid) {
		this.bikeid = bikeid;
	}
	public String getRegName() {
		return regName;
	}
	public void setRegName(String regName) {
		this.regName = regName;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getBikeName() {
		return bikeName;
	}
	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public Model() {
		super();
	}
	
}
