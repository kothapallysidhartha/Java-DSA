package LOGIN;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTextField;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
public class college {
private JFrame univerityinformation;

private JTextField tfsid;
private JTextField textField;
private JTextField textField_1;
private JTable tbldata;
private JScrollPane scrollPane;
private JLabel lblNewLabel_3;
private JButton btnNewButton_1;
/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
college window = new college();
window.univerityinformation.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}

/**
* Create the application.
*/
public college() {
initialize();
univerityinformation.setVisible(true);
}
/**
* Initialize the contents of the frame.
*/
private void initialize() {
univerityinformation = new JFrame();
univerityinformation.setTitle("University Information");
univerityinformation.setBounds(500, 400, 999, 737);
univerityinformation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
univerityinformation.getContentPane().setLayout(null);
JLabel lblNewLabel = new JLabel("Please enter the college name");
lblNewLabel.setBounds(169, 10, 516, 50);
lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
univerityinformation.getContentPane().add(lblNewLabel);

JLabel lblNewLabel_2 = new JLabel("College Name:");
lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_2.setBounds(32, 71, 144, 39);
univerityinformation.getContentPane().add(lblNewLabel_2);
tfsid = new JTextField();
tfsid.setBounds(179, 76, 448, 27);
univerityinformation.getContentPane().add(tfsid);
tfsid.setColumns(10);
JButton btnNewButton = new JButton("Enter");
btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
btnNewButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
try {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = 
DriverManager.getConnection("jdbc:mysql://localhost:3306/univerityinformation", "root", "");
Statement stmt = con.createStatement();
String sid=tfsid.getText();
String qry = "select * from college where CollegeName ='"+sid+"'";
ResultSet rs = stmt.executeQuery(qry);

ResultSetMetaData rsmd = (ResultSetMetaData) 
rs.getMetaData();
DefaultTableModel model=(DefaultTableModel)tbldata.getModel();
int cols=rsmd.getColumnCount();
String[] colname=new String[cols];
for(int i=0;i<cols;i++)
colname[i]=rsmd.getColumnName(i+1);
model.setColumnIdentifiers(colname);
 if((rs.next())) {
 String CollegeName = rs.getString("CollegeName");
 String Location = rs.getString("Location");
 String Courses = rs.getString("Courses");
 String Placements = rs.getString("Placements");
 //String FeeDetails = rs.getString("FeeDetails");
 String Events = rs.getString("Events");
 String SRix = rs.getString("SRix");
 String Phone_no = rs.getString("Phone_no");
 String[] row= {CollegeName,Location,Courses,Placements,Events,SRix,Phone_no};
 model.addRow(row);
 stmt.close();
 con.close();
}

 else {
	 JOptionPane.showMessageDialog(univerityinformation, "sorry we not found this college...");
 }
}
catch(Exception ex) {ex.printStackTrace(); }
}
});

btnNewButton.setBounds(671, 79, 85, 21);
univerityinformation.getContentPane().add(btnNewButton);
scrollPane = new JScrollPane();
scrollPane.setBounds(10, 130, 975, 278);
univerityinformation.getContentPane().add(scrollPane);
tbldata = new JTable();
scrollPane.setViewportView(tbldata);
tbldata.setModel(new DefaultTableModel(
new Object[][] {
},
new String[] {
}
));
lblNewLabel_3 = new JLabel("Thank you");
lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
lblNewLabel_3.setBounds(326, 600, 211, 27);
univerityinformation.getContentPane().add(lblNewLabel_3);
btnNewButton_1 = new JButton("OK");
btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
btnNewButton_1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
univerityinformation.dispose();
CollegePage lp=new CollegePage();
lp.setVisible(true);
}
});
btnNewButton_1.setBounds(396, 638, 107, 27);
univerityinformation.getContentPane().add(btnNewButton_1);
}

public void setVisible(boolean b) {
	// TODO Auto-generated method stub
	
	univerityinformation.setVisible(true);
}
}

