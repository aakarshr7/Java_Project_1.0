import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public  class UserHome implements ActionListener{

	JFrame f;
	JButton update,reg,view; 
	JLabel adHome;
	public UserHome() {
		// TODO Auto-generated constructor stub
		f = new JFrame("Student Result System");
		reg = new JButton("Add Student Info");
		update = new JButton("Update Student Info");
		view = new JButton("View Student Info");
		reg.setBounds(45,50,200,25);
		view.setBounds(45,90,200,25);
		update.setBounds(45,130,200,25);
		f.add(reg);
		f.add(update);
		f.add(view);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new UserHome();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
