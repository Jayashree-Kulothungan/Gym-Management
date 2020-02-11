package dao;
import java.sql.*;
import java.util.*;

import bean.*;
import util.*;

public class TrainerDatabase {
	Connection c=null;
	public void create() throws SQLException, ClassNotFoundException{
		DBConnection con=new DBConnection();
		c=con.connector();
		Statement s=c.createStatement();
		s.executeUpdate("drop table Trainer");
		String str="Create table trainer(tid varchar2(10),tname varchar2(10), temail varchar2(10),tphone number(10),tsalary number(10))";
		s.executeUpdate(str);
		System.out.println("Trainer table created");
	}
	public void insert() throws SQLException {
		Trainer  t=new Trainer();
		PreparedStatement p=c.prepareStatement("insert into trainer values(?,?,?,?,?)");
		System.out.println("enter the number of records to be inserted");
		int i;
		Scanner st=new Scanner(System.in);
		int n = st.nextInt();
		char ans;
		do {
			for(i=0;i<n;i++)
			{
				System.out.println("id");
				t.setTid(st.nextInt());
				p.setInt(1, t.getTid());
				System.out.println("name");
				t.setTname(st.next());
				p.setString(2,t.getTname());
				System.out.println("email");
				t.setTemail(st.next());
				p.setString(3,t.getTemail());
				System.out.println("phone");
				t.setTphone(st.nextInt());
				p.setInt(4,t.getTphone());
				System.out.println("salary");
				t.setTsalary(st.nextInt());
				p.setInt(5,t.getTsalary());
			}
			System.out.println("do you want to continue?(y/n)");
			ans=st.next().charAt(0);
		}while(ans=='y');
		p.executeUpdate();
		System.out.println("the trainer table has been updated");
	}
		public void display() throws SQLException {
			Statement s=c.createStatement();
			ResultSet r=s.executeQuery("select * from trainer");
			while(r.next())
			{
				System.out.println("trainer id="+r.getInt(1)+" ,trainer name="+r.getString(2)+" ,trainer email="+r.getString(3)+" ,trainer phone number="+r.getInt(4)+" ,trainer salary="+r.getInt(5));
			}
	}
}




