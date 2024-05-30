package LOGIN;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import com.mysql.cj.xdevapi.Statement;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JDesktopPane;

public class CollegePage {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CollegePage window = new CollegePage();
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
	public CollegePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 501, 366);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(161, 72, 251, 31);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel(" STATE_NAME:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel.setBounds(10, 69, 127, 42);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("ENTER");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton.addActionListener(new ActionListener() {
//			private String state1;

			public void actionPerformed(ActionEvent e) {
			try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/univerityinformation", "root", "");
			java.sql.Statement stmt =  con.createStatement();
			String sql = "Select * from stateinformation where State='"+ textField.getText()+"'";
		    ResultSet rs = ((java.sql.Statement) stmt).executeQuery(sql);
		    if(rs.next())
		    {
		    	frame.dispose();
		    	college p = new college();
			    p.setVisible(true);
		    }
		    else
		    {
		    	JOptionPane.showMessageDialog(frame, "sorry we not found this state ..........we will definitely work on this..Thankyou!");
		    	frame.dispose();
		    	Homepage p=new Homepage();
		    	p.setVisible(true);
		    	
		    }
			}
			
			catch(Exception exc) {exc.printStackTrace();}
			}
			});
		btnNewButton.setBounds(28, 175, 127, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CANCEL");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				//txtPwd.setText(null);
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton_1.setBounds(241, 177, 149, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Please enter the state name");
		lblNewLabel_1.setBounds(95, 11, 371, 31);
		frame.getContentPane().add(lblNewLabel_1);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(b);
		
	}
}
