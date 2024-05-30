import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingExample5 extends JFrame implements ActionListener {

    private JTextField bookNameTextField;
    private JTextField bookPriceTextField;
    private JButton submitButton;

    public SwingExample5() {
        super("Java Swing Example-5");
        setLayout(new GridLayout(3, 2));

        JLabel nameLabel = new JLabel("Book Name:");
        add(nameLabel);

        bookNameTextField = new JTextField();
        add(bookNameTextField);

        JLabel priceLabel = new JLabel("Book Price:");
        add(priceLabel);

        bookPriceTextField = new JTextField();
        add(bookPriceTextField);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        add(submitButton);

        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            // Validate the form data
            String bookName = bookNameTextField.getText();
            String bookPriceStr = bookPriceTextField.getText();

            if (isValidData(bookName, bookPriceStr)) {
                // Display message box with input values
                String message = "Book Name: " + bookName + "\nBook Price: $" + bookPriceStr;
                JOptionPane.showMessageDialog(this, message, "Form Submission", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Display error message if data is not valid
                JOptionPane.showMessageDialog(this, "Invalid data! Please enter valid values.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private boolean isValidData(String bookName, String bookPriceStr) {
        // Check if book name is not empty and book price is a valid number
        return !bookName.isEmpty() && isNumeric(bookPriceStr);
    }

    private boolean isNumeric(String str) {
        try {
            double d = Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        new SwingExample5();
    }
}
