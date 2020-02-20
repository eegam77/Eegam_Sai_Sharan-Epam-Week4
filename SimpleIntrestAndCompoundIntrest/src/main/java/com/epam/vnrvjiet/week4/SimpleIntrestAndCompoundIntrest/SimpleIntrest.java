package com.epam.vnrvjiet.week4.SimpleIntrestAndCompoundIntrest;

import java.util.Scanner;

public class SimpleIntrest {
	double principleAmount;
	double timeperiod;
	double rateOfIntrest;
	double simpleIntrest=0;
	Scanner sc=new Scanner(System.in);
	void readInput()
	{
		System.out.println("Enter number of months:(Time period)");
		timeperiod=sc.nextDouble();
		System.out.println("Enter principle amount:");
		principleAmount=sc.nextDouble();
		System.out.println("Enter Rate of Intrest:");
		rateOfIntrest=sc.nextDouble();		
	}
	public void Simple_Intrest()
	{
		timeperiod=timeperiod/12;
		simpleIntrest=(principleAmount*timeperiod*rateOfIntrest)/100;
		System.out.println("Simple Intrest:"+simpleIntrest);
	}
}
