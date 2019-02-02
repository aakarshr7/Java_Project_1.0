package Main;

import Connection.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import Action.MethodImpl;
import Beans.RegisterBean;


public class DbMain {
	
	public DbMain() {
		// TODO Auto-generated constructor stub
	
		int ch,i;
		ResultSet j;
		int accno;
		String accname;
		double balance;
		String actype;
		Scanner sc=new Scanner(System.in);
		
		MethodImpl mi=new MethodImpl();
		RegisterBean rb=new RegisterBean();
		Connection con= new MyCon().config() ;
		
		ResultSet rs;
		do {
			System.out.println("\n 1.Insert");
			System.out.println("2.Update");
			System.out.println("3.Delete");
			System.out.println("4.Retrieve All");
			System.out.println("5.Retrieve One");
			System.out.println("6.Exit");
			System.out.println("7.Transfer");
			System.out.println("Enter your choice: ");
			ch=Integer.parseInt(sc.nextLine());
			switch (ch) {
			case 1: System.out.println("Enter Account no ");
					accno=Integer.parseInt(sc.nextLine());
					
					System.out.println("Enter type ");
					actype=sc.nextLine();
					
					System.out.println("Enter Name ");
					accname= sc.nextLine();
					
					System.out.println("Enter Balance ");
					balance=Double.parseDouble(sc.nextLine());
					
					
					
				/*	rb.setAccno(accno);
					rb.setType(actype);
					rb.setName(accname);
					rb.setBal(balance);*/
					
					i=mi.insertRecord(rb, con);
					if(i>0)
					{
						System.out.println("Inserted");
					}
					
					break;
			case 2: System.out.println("Enter Account no ");
					accno=Integer.parseInt(sc.nextLine());
					
					System.out.println("Enter Type");
					actype=sc.nextLine();
					
					System.out.println("Enter Balance ");
					balance=Double.parseDouble(sc.nextLine());
					
					System.out.println("Enter Name ");
					accname=sc.nextLine();
					
		/*			rb.setAccno(accno);
					rb.setBal(balance);
					rb.setType(actype);
					rb.setName(accname); */
					i=mi.updateRecord(rb, con);
					if(i>0)
					{
						System.out.println("Updated");
					}
					
					break; 
			case 3: System.out.println("Enter the account no");
					accno=Integer.parseInt(sc.nextLine());
					
					i=mi.deleteRecord(con, accno);
					if(i>0)
					{
						System.out.println("Deleted");
					}
					
					break;
			case 4: ResultSet rst=mi.selectAll(con);
			try {
				while(rst.next())
				{
					System.out.println(rst.getInt(1)+" "+rst.getString(2)+" "+rst.getString(3)+" "+rst.getDouble(4));
				
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					break;
			case 5: System.out.println("Enter the Account no. ");
					accno=Integer.parseInt(sc.nextLine());
					
					ResultSet rt=mi.selectOne(con, accno);
			
			
			default:
				break;
			
			}
			i=sc.nextInt();
		}while (i!=0);
	}
	
	public static void main(String args[])
	{
		new DbMain();
	}
	
}


