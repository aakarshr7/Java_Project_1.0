import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;
public class ViewStu extends JFrame implements ActionListener{
	
	JFrame f;
	JLabel hd,sid,sname,std,eml,dob,phn,fad,lad,city,mname,faname,ecnt,sesn;
	JTextField jfsid,jfsname,jfstd,jfeml,jfdob,jfphn,jfcity,jfmname,jffaname,jfecnt,jfsesn;
	JTextArea jffad,jflad;
	JButton jbshow;

	public ViewStu() {
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
		jbshow=new JButton("Show");
		
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
		f.add(jbshow);
		
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
		jbshow.setBounds(150, 650, 160, 30);
		jfsname.setEditable(false);
		jfstd.setEditable(false);
		jfsesn.setEditable(false);
		jfeml.setEditable(false);
		jfdob.setEditable(false);
		jfphn.setEditable(false);
		jffaname.setEditable(false);
		jfmname.setEditable(false);
		jfecnt.setEditable(false);
		jflad.setEditable(false);
		jflad.setEditable(false);
		
		f.setSize(500,800);
		f.setLayout(null);
		f.setVisible(true);
		jbshow.addActionListener(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ViewStu vs=new ViewStu();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==jbshow) {
			try {
				Class.forName("java.sql.DriverManager");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/attendence", "root", "");
				Statement s=con.createStatement();
				ResultSet r=s.executeQuery("select * from student_detail where Student_Id='"+jfsid.getText()+"';");
				while(r.next())
				{
					jfsname.setText(r.getString(2));
					int b     = r.getInt(3);
					jfstd.setText(""+ b);
					int c     = r.getInt(4);
					jfsesn.setText(""+ c);
					jfeml.setText(r.getString(5));
					Date f    = r.getDate(6);
					jfdob.setText(""+ f);
					long g = r.getLong(7);
					jfphn.setText(""+ g);
					jffaname.setText(r.getString(8));
					jfmname.setText(r.getString(9));
					long h = r.getLong(10);
					jfecnt.setText(""+ h);
					jflad.setText(r.getString(11));
					jffad.setText(r.getString(12));
				}
				
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println(e2);
			}
		}
	}

}
