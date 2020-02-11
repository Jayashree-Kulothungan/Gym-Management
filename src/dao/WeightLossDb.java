package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import bean.Values;
import bean.WeightLoss;
import util.DBConnection;

public class WeightLossDb {
		Connection c=null;
		public void create() throws SQLException, ClassNotFoundException{
			DBConnection con=new DBConnection();
			c=con.connector();
			Statement s=c.createStatement();
			s.executeUpdate("drop table WeightL");
			s.executeUpdate("create table weightl(name varchar2(10),begining number(5),ending number(5),loss number(10))");
			System.out.println("Weight loss table created");
		}
		public void insert() throws SQLException {
			WeightLoss wl=new WeightLoss();
			PreparedStatement p=c.prepareStatement("insert into weightl values(?,?,?,?)");
			System.out.println("enter the number of records to be inserted");
			int i;
			Scanner st=new Scanner(System.in);
			int n = st.nextInt();
			char ans;
			do {
				for(i=0;i<n;i++)
				{
					System.out.println("name");
					wl.setName(st.next());
					p.setString(1,wl.getName());
					System.out.println("initial weight");
					wl.setInitial(st.nextInt());
					p.setInt(2,wl.getInitial());
					System.out.println("final weight");
					wl.setEnd(st.nextInt());
					p.setInt(3,wl.getEnd());
					System.out.println("loss");
					wl.setLoss(st.nextInt());
					p.setInt(4,wl.getLoss());
				}
				System.out.println("do you want to continue?(y/n)");
				ans=st.next().charAt(0);
			}while(ans=='y');
			p.executeUpdate();
			System.out.println("the weight loss table has been updated");
		}
			public void display() throws SQLException {
				Statement s=c.createStatement();
				ResultSet r=s.executeQuery("select * from weightl");
				while(r.next())
				{
					System.out.println("name="+r.getString(1)+" ,initial weight="+r.getInt(2)+" ,final weight="+r.getInt(3)+" ,weight loss="+r.getInt(4));
				}
		}
	}




