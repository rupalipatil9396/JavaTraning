package com.yash.java;

import java.util.ArrayList;
import java.util.Arrays;

public class MainClass {

	public void finalize() {
		System.out.println("object is garbage collected");
	}

	public static void main(String[] args) {
		MainClass m = new MainClass();
		m = null;
		System.gc();

		JavaTraining j = new JavaTraining();
		j.setTrainers(1);
		j.setLapy("lenovo");
		j.setPen(1);
		j.setKeyboards("hp");
		j.setNotebook("classmate");

		System.out.println(j);
		JavaTraining j2 = new JavaTraining();
		j2.setTrainers(2);
		j2.setLapy("dell");
		j2.setPen(2);
		j2.setKeyboards("feel");
		j2.setNotebook("clas");

		System.out.println(j.equals(j2));
		System.out.println(j.hashCode());
		System.out.println(j2.hashCode());

		System.out.println(j == j2);

		// create an array of JavaTraining object
		JavaTraining[] obj = new JavaTraining[5];
		// create & initialize actual JavaTraining objects using constructor
		obj[0] = new JavaTraining(1, "dell", 1, "Samasang", "Calssss", "Leneovo", "onepluw");
		obj[1] = new JavaTraining(2, "hjk", 4, "lkdsd", "idjsk", "kjsdddd", "skjdk");
		obj[2] = new JavaTraining(3, "hjk", 4, "lkdsd", "idjsk", "kjsdddd", "skjdk");
		obj[3] = new JavaTraining(4, "hjk", 4, "lkdsd", "idjsk", "kjsdddd", "skjdk");
		obj[4] = new JavaTraining(5, "hjk", 4, "lkdsd", "idjsk", "kjsdddd", "skjdk");
		// display the JavaTraining object data
		
		for (int i = 0; i < obj.length; i++) {
	        System.out.println("Retrived from the array of training object::::"+obj[i]);
	        
	    }
        
	}

}
