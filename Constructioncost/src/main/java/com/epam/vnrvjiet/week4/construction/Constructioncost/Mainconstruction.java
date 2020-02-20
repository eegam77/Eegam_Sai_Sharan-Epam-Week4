package com.epam.vnrvjiet.week4.construction.Constructioncost;
import java.util.*;
public class Mainconstruction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter land size(area sq meters):");
		Scanner sc=new Scanner(System.in);
		double landsize;
		landsize=sc.nextDouble();
		System.out.println("Enter the material you want to use:");
		System.out.println("1)Standard Material\n2)Above standard material\n3)High Standard material\n4)High standard and Fully automated house");
		int selectoption;
		selectoption=sc.nextInt();
		Constructioncostcalculator c=new Constructioncostcalculator();
		System.out.println("The total construction cost is:"+c.costcalculator(selectoption, landsize));
		sc.close();
	}
}
