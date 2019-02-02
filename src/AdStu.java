import java.awt.Font;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Action.MethodImpl;
import Beans.RegisterBean;
import Connection.MyCon;

import javax.swing.*;

public class AdStu extends JFrame implements ActionListener{

	JFrame f;
	JLabel hd,sid,sname,std,eml,dob,phn,fad,lad,city,mname,faname,ecnt,sesn;
	JTextField jfsid,jfsname,jfstd,jfeml,jfdob,jfphn,jfcity,jfmname,jffaname,jfecnt,jfsesn;
	JTextArea jffad,jflad;
	JButton jbrgst, jbbck,jbclr;
	
	public AdStu() {
		// TODO Auto-generated constructor stub
		f=new JFrame("Student Details");
		hd=new JLabel("Student Details");
		sname=new JLabel("Student Name");
		sid=new JLabel("Student Id");
		std=new JLabel("Standard");
		sesn=new JLabel("Session");
		eml=new JLabel("Email");
		dob=new JLabel("Date of Birth");
		phn=new JLabel("Contact No.");
		faname=new JLabel("Father Name");
		mname=new JLabel("Mother's Name");
		ecnt=new JLabel("Emergency Contact No.");
		lad=new JLabel("Local Address");
		fad=new JLabel("Permanent Address");
		jfsname=new JTextField("");
		jfsid=new JTextField("");
		jfstd=new JTextField("");
		jfsesn=new JTextField("");
		jfeml=new JTextField("");
		jfdob=new JTextField("");
		jfphn=new JTextField("");
		jffaname=new JTextField("");
		jfmname=new JTextField("");
		jfecnt=new JTextField("");
		jflad=new JTextArea("");
		jffad=new JTextArea("");
		jbrgst=new JButton("Register");
		jbbck=new JButton("Back");
		jbclr= new JButton("Clear");
		
		f.add(hd);
		f.add(sid);
		f.add(sname);
		f.add(std);
		f.add(sesn);
		f.add(eml);
		f.add(dob);
		f.add(phn);
		f.add(faname);
		f.add(mname);
		f.add(ecnt);
		f.add(lad);
		f.add(fad);
		f.add(jfsname);
		f.add(jfsid);
		f.add(jfstd);
		f.add(jfsesn);
		f.add(jfeml);
		f.add(jfdob);
		f.add(jfphn);
		f.add(jffaname);
		f.add(jfmname);
		f.add(jfecnt);
		f.add(jflad);
		f.add(jffad);
		f.add(jbrgst);
		f.add(jbbck);
		f.add(jbclr);
		
		hd.setBounds(200,30,200,50);
		sid.setBounds(70,110,140,30);
		sname.setBounds(70,150,140,30);
		std.setBounds(70,190,140,30);
		sesn.setBounds(70,230,140,30);
		eml.setBounds(70,270,140,30);
		dob.setBounds(70, 310, 140, 30);
		phn.setBounds(70, 350, 140, 30);
		faname.setBounds(70, 390, 140, 30);
		mname.setBounds(70,430, 140,30);
		ecnt.setBounds(70, 470, 140, 30);
		lad.setBounds(70, 510, 140, 50);
		fad.setBounds(70, 570, 140, 50);
		jfsid.setBounds(220, 110, 160, 30);
		jfsname.setBounds(220, 150, 160, 30);
		jfstd.setBounds(220, 190, 160, 30);
		jfsesn.setBounds(220, 230, 160, 30);
		jfeml.setBounds(220, 270, 160, 30);
		jfdob.setBounds(220, 310, 160, 30);
		jfphn.setBounds(220, 350, 160, 30);
		jffaname.setBounds(220, 390, 160, 30);
		jfmname.setBounds(220, 430, 160, 30);
		jfecnt.setBounds(220, 470, 160, 30);
		jflad.setBounds(220, 510, 160, 50);
		jffad.setBounds(220, 570, 160, 50);
		jbrgst.setBounds(80, 650, 100, 30);
		jbbck.setBounds(200, 650, 100, 30);
		jbclr.setBounds(320, 650, 100, 30);
		
		f.setSize(500,800);
		f.setLayout(null);
		f.setVisible(true);
		jbrgst.addActionListener(this);
		jbbck.addActionListener(this);
		jbclr.addActionListener(this);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdStu ad=new AdStu(); 
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource()==jbrgst)
		{
			try {
				Class.forName("java.sql.DriverManager");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/attendence", "root", "");
				Statement s=con.createStatement();
				int r=s.executeUpdate("insert into student_detail values('"+jfsid.getText()+"','"+jfsname.getText()+"','"+jfstd.getText()+"','"+jfsesn.getText()+"','"+jfeml.getText()+"','"+jfdob.getText()+"','"+Long.parseLong(jfphn.getText())+"','"+jffaname.getText()+"','"+jfmname.getText()+"','"+Long.parseLong(jfecnt.getText())+"','"+jflad.getText()+"','"+jffad.getText()+"')");
				if(r>0)
				{
					javax.swing.JOptionPane.showMessageDialog(this, "Registered");
				}else {
					javax.swing.JOptionPane.showMessageDialog(this, "Not Registered");
				}
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
		if(arg0.getSource()==jbbck) {
			f.dispose();
			new AdminHome();
		}
		if(arg0.getSource()==jbclr) {
			jfsid.setText(" ");
			jfsname.setText(" ");
			jfstd.setText("");
			jfsesn.setText("");
			jfeml.setText("");
			jfdob.setText("");
			jfphn.setText("");
			jffaname.setText("");
			jfmname.setText("");
			jfecnt.setText("");
			jflad.setText("");
			jffad.setText("");
		
		}
	}

}
