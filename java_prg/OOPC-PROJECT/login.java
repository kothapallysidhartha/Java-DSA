package LOGIN;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.sql.ResultSet;

public class login {

	private JFrame loginform;
	String uname,pwd;
	private JTextField txtUser;
	private JPasswordField txtPwd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.loginform.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		loginform = new JFrame();
		loginform.setTitle("University Information");
		loginform.setBounds(100, 100, 487, 467);
		loginform.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginform.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" Login Page");
		lblNewLabel.setBounds(147, 37, 165, 29);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		loginform.getContentPane().add(lblNewLabel);
		
		final JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(107, 215, 85, 21);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/univerityinformation", "root", "");
					Statement stmt = con.createStatement();
					String sql = "Select * from registrationpage where username='"+ txtUser.getText()+"' and Password='"+txtPwd.getText()+"'";
				    ResultSet rs = stmt.executeQuery(sql);
				    if(rs.next())
				    {
				    	
				    		JOptionPane.showMessageDialog(btnNewButton, "Login Succesfull!");
				    
				    	loginform.dispose();
				    	Homepage p = new Homepage();
					    p.setVisible(true);
				    }
				    else
				    {JOptionPane.showMessageDialog(btnNewButton, "invalid credentials");
				    	
				    }
				}
				
				catch(Exception ex){ex.printStackTrace();}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		loginform.getContentPane().add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(279, 215, 85, 21);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtUser.setText(null);
				txtPwd.setText(null);
			}
		});
		btnCancel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		loginform.getContentPane().add(btnCancel);
		
		JLabel lblNewLabel_1 = new JLabel("New User?");
		lblNewLabel_1.setBounds(134, 279, 98, 13);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		loginform.getContentPane().add(lblNewLabel_1);
		
		JButton btnSignUp = new JButton("Sign In");
		btnSignUp.setBounds(225, 276, 85, 21);
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginform.dispose();
				SignUppage a = new SignUppage();
			    a.setVisible(true);
				
			}
		});
		btnSignUp.setFont(new Font("Times New Roman", Font.BOLD, 16));
		loginform.getContentPane().add(btnSignUp);
		
		JLabel lblNewLabel_1_1 = new JLabel("User Name");
		lblNewLabel_1_1.setBounds(107, 91, 98, 13);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		loginform.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Password");
		lblNewLabel_1_2.setBounds(107, 139, 98, 13);
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		loginform.getContentPane().add(lblNewLabel_1_2);
		
		txtUser = new JTextField();
		txtUser.setBounds(244, 89, 96, 19);
		loginform.getContentPane().add(txtUser);
		txtUser.setColumns(10);
		
		txtPwd = new JPasswordField();
		txtPwd.setBounds(244, 137, 98, 19);
		loginform.getContentPane().add(txtPwd);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		loginform.setVisible(b);
		
	}
}