package LOGIN;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JTextField;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class Homepage {

	private JFrame frame;
	private JLabel fname;
	private String name;
	private JLabel username;
	private String j17;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Homepage window = new Homepage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Homepage() {
		initialize();
	}
	public Homepage(String name) {
		this.name = j17;
		
		initialize();
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 433);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btninter = new JButton("International");
		btninter.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Sorry we are working on this......we will definitely provide the information about the international colleges.Thankyou! please visit us again.");
				//txtPwd.setText(null);
			}
		});
		btninter.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btninter.setBounds(225, 285, 147, 38);
		frame.getContentPane().add(btninter);
		
		JButton btnNational = new JButton("National");
		btnNational.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					frame.dispose();
					CollegePage c=new CollegePage();
					c.setVisible(true);
				}
				catch(Exception ex){ex.printStackTrace();}
			}
			});
		btnNational.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnNational.setBounds(34, 281, 111, 46);
		frame.getContentPane().add(btnNational);
		
		JLabel lblNewLabel = new JLabel("please select the button down there!");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(34, 183, 371, 64);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(34, 33, 322, 38);
		frame.getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.setText("Hello Mr./Ms."+" "+"How can we help you!");
	}
	
		
		
	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(b);
		
	}
}
