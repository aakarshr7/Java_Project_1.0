import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public  class AdminHome implements ActionListener{

	JFrame f;
	JButton ad,update,reg,view; 
	JLabel adHome;
	public AdminHome() {
		// TODO Auto-generated constructor stub
		f = new JFrame("Student Result System");
		ad = new JButton("Add User");
		reg = new JButton("Add Student Info");
		update = new JButton("Update Student Info");
		view = new JButton("View Student Info");
		ad.setBounds(45,40,200,25);
		reg.setBounds(45,90,200,25);
		view.setBounds(45,140,200,25);
		update.setBounds(45,190,200,25);
		f.add(ad);
		f.add(reg);
		f.add(update);
		f.add(view);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
		ad.addActionListener(this);
		reg.addActionListener(this);
		update.addActionListener(this);
		view.addActionListener(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AdminHome();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource()==reg) {
			f.dispose();
			new AdStu();
		}
		if (arg0.getSource()==view) {
			f.dispose();
			new ViewStu();
		}
	}

}
