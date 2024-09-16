package com.pric.GenericUtility;

import java.util.Random;

public class RandomNumber {
	public static int random() {
		Random r=new Random();
		int num=r.nextInt(5000);
		return num;
	}
	public static int randomNo() {
		Random r=new Random();
		int num=r.nextInt(10000);
		return num;
		
		
	}

}
