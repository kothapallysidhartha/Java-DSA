import java.awt.event.ActionEvent;
import javax.swing.*;

class Login{

     public static void main(String[] args) {
       //Declare frame object
       JFrame frame = new JFrame();
       //Set the title
       frame.setTitle("Java Swing Example-15");
       //Set the window size
       frame.setSize(500, 500);
       //Create a label object, set the position, and add to the frame/
       JLabel lbl1 = new JLabel("Username:", JLabel.LEFT);
       lbl1.setBounds(50,20,100,20);
       frame.add(lbl1);
       //Create text object, set the position, and add to the frame/
       JTextField username = new JTextField();
       username.setBounds(150,20,150,20);
       frame.add(username);
       //Create label object, set the position and add to the frame
       JLabel lbl2 =  new JLabel("Password:", JLabel.LEFT);
       lbl2.setBounds(50,60,100,20);
       frame.add(lbl2);
       //Create password text object, set the position and add to the frame/
       JPasswordField password = new JPasswordField();
       password.setBounds(150,60,150,20);
       frame.add(password);
       /*Create a button, set the position, and add to the frame */
       JButton btn1 = new JButton("Login");
       btn1.setBounds(120, 100, 90, 30);
       frame.add(btn1);
       //Create a button, set the position, and, add to the frame/
       JButton btn2 = new JButton("Cancel");
       btn2.setBounds(215, 100, 100, 30);
       frame.add(btn2);
       //Set window position
       frame.setLocationRelativeTo(null);
       //Disable the default layout of the frame
       frame.setLayout(null);
       //Make the window visible
       frame.setVisible(true);
       //Handle the login information
       btn1.addActionListener((ActionEvent e) -> {
           String un = username.getText();
           String ps = new String(password.getPassword());

           if(un.equals("admin") && ps.equals("secret"))
                JOptionPane.showMessageDialog(null, "Authenticated.");
           else
                JOptionPane.showMessageDialog(null, "Not Authenticated.");
      });
      //Terminate from the program
      btn2.addActionListener((ActionEvent e) -> {
           System.exit(0);
      });
	  frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

   }
}