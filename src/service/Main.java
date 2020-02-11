package service;
import java.sql.*;
import java.util.Scanner;

import bean.Trainer;
import bean.Values;
import bean.WeightLoss;
import dao.CustomerDatabase;
import dao.TrainerDatabase;
import dao.WeightLossDb;



public class Main {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		Scanner s=new Scanner(System.in);	
		
		System.out.println("enter the choice");
		System.out.println("1.Customer \n2.trainer \n3.Weight Loss");
		int ch=s.nextInt();
		char ans;
		switch(ch) {
		case 1:
		Values v=new Values();
		CustomerDatabase d=new CustomerDatabase();
		d.create();
		d.insert();
		d.display();
		break;
		case 2:
		Trainer t=new Trainer();
		TrainerDatabase td=new TrainerDatabase();
		td.create();
		td.insert();
		td.display();
		break;
		case 3:
		WeightLoss wl=new WeightLoss();
		WeightLossDb w=new WeightLossDb();
		w.create();
		w.insert();
		w.display();
		break;
		default:
			System.out.println("Invalid choice");
			}
	}

}
