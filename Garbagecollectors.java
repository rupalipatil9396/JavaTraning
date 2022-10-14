package com.yash.java;

public class Garbagecollectors {

	public void finalize() {
		System.out.println("object is garbage collected");
	}

	public static void main(String args[]) {
		// unreferance object
		Garbagecollectors s1 = new Garbagecollectors();
		Garbagecollectors s2 = new Garbagecollectors();
		s1 = null;
		s2 = null;
		System.gc();
       
		//refenrace object
		Garbagecollectors s3 = new Garbagecollectors();
		Garbagecollectors s4 = new Garbagecollectors();
		s3 = s4;
	}
}
