package dao;

import java.sql.*;
import java.util.Scanner;
import bean.Values;
import service.Main;
import util.DBConnection;
public class CustomerDatabase {
	Connection c=null;
	public void create() throws SQLException, ClassNotFoundException{
		DBConnection con=new DBConnection();
		c=con.connector();
		Statement s=c.createStatement();
		s.executeUpdate("drop table customer");
		String str="Create table customer(cus_id number,cname varchar2(10), cemail varchar2(10),pack varchar2(10),fees number(10))";
		s.executeUpdate(str);
		System.out.println("Customer table created");
	}
	public void insert() throws SQLException {
		Values v=new Values();
		PreparedStatement p=c.prepareStatement("insert into customer values(?,?,?,?,?)");
		System.out.println("enter the number of records to be inserted");
		int i;
		Scanner st=new Scanner(System.in);
		int n = st.nextInt();
		char ans;
		do {
			for(i=0;i<n;i++)
			{
				System.out.println("id");
				v.setCus_id(st.nextInt());
				p.setInt(1, v.getCus_id());
				System.out.println("name");
				v.setCname(st.next());
				p.setString(2,v.getCname());
				System.out.println("email");
				v.setCemail(st.next());
				p.setString(3,v.getCemail());
				System.out.println("pack");
				v.setPack(st.next());
				p.setString(4,v.getPack());
				System.out.println("fees");
				v.setFees(st.nextInt());
				p.setInt(5,v.getFees());
			}
			System.out.println("do you want to continue?(y/n)");
			ans=st.next().charAt(0);
		}while(ans=='y');
		p.executeUpdate();
		System.out.println("the customer table has been updated");
	}
		public void display() throws SQLException {
			Statement s=c.createStatement();
			ResultSet r=s.executeQuery("select * from customer");
			while(r.next())
			{
				System.out.println("cus id="+r.getInt(1)+" ,cus name="+r.getString(2)+" ,cus email="+r.getString(3)+" ,cus pack="+r.getString(4)+" ,fees="+r.getInt(5));
			}
	}
}



