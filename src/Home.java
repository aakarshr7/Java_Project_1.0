import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Home implements ActionListener {

	JFrame f;
	JTextField Idbox,passbox;
	JLabel Id,Pass;
	
	JButton admin,tcher;
	
	
	public Home() {
		// TODO Auto-generated constructor stub
		
		f =  new JFrame("Student Result System");
		Idbox = new JTextField();
		passbox= new JTextField();
		Id = new JLabel("Username");
		Pass = new JLabel("Password");
		admin = new JButton("Login as Administrator");
		tcher = new JButton("Login as User");
		Idbox.setBounds(110, 50, 150, 25);
		passbox.setBounds(110,80,150,25);
		Id.setBounds(25,55,100,15);
		Pass.setBounds(25,85,100,15);
		admin.setBounds(40, 120, 200, 20);
		admin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new AdminHome();
			}
		});
		tcher.setBounds(40,150,200,20);
		tcher.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new UserHome();
			}
		});
		f.add(Id);
		f.add(Idbox);
		f.add(Pass);
		f.add(passbox);
		f.add(admin);
		f.add(tcher);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Home();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
