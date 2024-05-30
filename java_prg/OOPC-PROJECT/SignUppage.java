package LOGIN;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class SignUppage {

	private JFrame frmuniversityinformation;
	private JTextField fname;
	private JTextField lname;
	private JTextField uname;
	private JTextField pwd;
	private JTextField cpwd;
	private JTextField gnd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUppage window = new SignUppage();
					window.frmuniversityinformation.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SignUppage() {
		initialize();
		frmuniversityinformation.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmuniversityinformation = new JFrame();
		frmuniversityinformation.setTitle(" University  information");
		frmuniversityinformation.setBounds(100, 100, 449, 399);
		frmuniversityinformation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmuniversityinformation.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration Page");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 10, 416, 21);
		frmuniversityinformation.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(62, 53, 107, 13);
		frmuniversityinformation.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Last Name:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(72, 77, 107, 13);
		frmuniversityinformation.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Username:");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setBounds(62, 115, 107, 13);
		frmuniversityinformation.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Password");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setBounds(62, 149, 107, 21);
		frmuniversityinformation.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Confirm Password");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setBounds(72, 181, 107, 22);
		frmuniversityinformation.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Gender:");
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5.setBounds(72, 222, 107, 13);
		frmuniversityinformation.getContentPane().add(lblNewLabel_1_5);
		
		fname = new JTextField();
		fname.setBounds(208, 42, 131, 24);
		frmuniversityinformation.getContentPane().add(fname);
		fname.setColumns(10);
		
		lname = new JTextField();
		lname.setBounds(208, 73, 131, 21);
		frmuniversityinformation.getContentPane().add(lname);
		lname.setColumns(10);
		
		uname = new JTextField();
		uname.setColumns(10);
		uname.setBounds(208, 111, 131, 21);
		frmuniversityinformation.getContentPane().add(uname);
		
		pwd = new JTextField();
		pwd.setColumns(10);
		pwd.setBounds(208, 149, 131, 21);
		frmuniversityinformation.getContentPane().add(pwd);
		
		cpwd = new JTextField();
		cpwd.setColumns(10);
		cpwd.setBounds(208, 182, 131, 20);
		frmuniversityinformation.getContentPane().add(cpwd);
		
		gnd = new JTextField();
		gnd.setColumns(10);
		gnd.setBounds(208, 218, 131, 21);
		frmuniversityinformation.getContentPane().add(gnd);
		
		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/univerityinformation", "root", "");
					Statement stmt = con.createStatement();
					String fName = fname.getText();
					String lName = lname.getText();
					String username = uname.getText();
					String Password = pwd.getText();
					String gender =gnd.getText();
					String sql = "insert into registrationpage values('"+fName+"', '"+lName+"', '"+username+"', '"+Password+"' , '"+gender+"')";
					stmt.executeUpdate(sql);
					JOptionPane.showMessageDialog(frmuniversityinformation, "Registration Completed Successfully");
					frmuniversityinformation.dispose();
					login lp = new login();
					lp.setVisible(true);
				}
				catch(Exception exc) {exc.printStackTrace();}
			}
		});
		btnNewButton.setBounds(62, 293, 101, 21);
		frmuniversityinformation.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fname.setText(null);
				lname.setText(null);
				uname.setText(null);
				pwd.setText(null);
				gnd.setText(null);
				frmuniversityinformation.dispose();
				login lp = new login();
				lp.setVisible(true);
				
			}
		});
		btnNewButton_1.setBounds(241, 293, 85, 21);
		frmuniversityinformation.getContentPane().add(btnNewButton_1);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frmuniversityinformation.setVisible(b);
		
	}
}