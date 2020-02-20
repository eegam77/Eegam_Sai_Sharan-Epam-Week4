package com.epam.vnrvjiet.week4.SimpleIntrestAndCompoundIntrest;
import java.util.*;
public class MainIntrestCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to simple intrest and Compound intrest Calculator");
		boolean tobecontinued=true;
		do
		{
		System.out.println("1. Compound Intrest\n 2.Simple Intrest ");
		Scanner sc=new Scanner(System.in);
		int Intresttype;
		Intresttype=sc.nextInt();
			switch(Intresttype)
			{
			case 1: CompoundIntrest ci=new CompoundIntrest();
					ci.readInput();
					ci.Compound_Intrest();
					break;
			case 2: SimpleIntrest si=new SimpleIntrest();
					si.readInput();
					si.Simple_Intrest();
					break;
			default:System.out.println("Enter correct option");
			}
			System.out.println("Do you want to continue?:(true for continue / false for discontinue)");
			tobecontinued=sc.nextBoolean();
			sc.close();
		}while(tobecontinued);
	}
	
}
