package com.yash.java;

public class JavaTraining {

	// Requirement gathering
	int trainers;
	String lapy;
	int pen;
	String keyboards;
	String notebook;
	String bag;
	String chargers;
	

	public JavaTraining(int trainers, String lapy, int pen, String keyboards, String notebook, String bag,
			String chargers) {
		super();
		this.trainers = trainers;
		this.lapy = lapy;
		this.pen = pen;
		this.keyboards = keyboards;
		this.notebook = notebook;
		this.bag = bag;
		this.chargers = chargers;
	}

	public JavaTraining() {
//		
	}

	public int getTrainers() {
		return trainers;
	}

	public void setTrainers(int trainers) {
		this.trainers = trainers;
	}

	public String getLapy() {
		return lapy;
	}

	public void setLapy(String lapy) {
		this.lapy = lapy;
	}

	public int getPen() {
		return pen;
	}

	public void setPen(int pen) {
		this.pen = pen;
	}

	public String getKeyboards() {
		return keyboards;
	}

	public void setKeyboards(String keyboards) {
		this.keyboards = keyboards;
	}

	public String getNotebook() {
		return notebook;
	}

	public void setNotebook(String notebook) {
		this.notebook = notebook;
	}

	@Override
	public String toString() {
		return "JavaTraining [trainers=" + trainers + ", lapy=" + lapy + ", pen=" + pen + ", keyboards=" + keyboards
				+ ", notebook=" + notebook + "]";
	}

	public void display() {
		// TODO Auto-generated method stub
		
	}
	

}
