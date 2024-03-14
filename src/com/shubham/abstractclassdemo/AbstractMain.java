package com.shubham.abstractclassdemo;

import java.util.Scanner;

import com.shubham.abstractclassdemomodel.AbstractModel;
import com.shubham.abstractclassdemomodel.AbstractModel.*;

public class AbstractMain {
	
		AbstractModel abstractmodel = new AbstractModel();
	
	public void input() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Student id:");
	    abstractmodel.setid(scanner.nextInt());
		System.out.println("Enter the Student Name:");
		abstractmodel.setname(scanner.next());
		System.out.println("Enter the Student fees:");
		abstractmodel.setfees(scanner.nextDouble());
	}
	public void output() {
		
		System.out.println("ID="+abstractmodel.getid());
		System.out.println("name="+abstractmodel.getname());
		System.out.println("fees="+abstractmodel.getfees());
		
	}

	public static void main(String[] args) {

		AbstractMain abstractmain = new  AbstractMain();
		
		 abstractmain. input();
		 abstractmain.output();
	}

}
