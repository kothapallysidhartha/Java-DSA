import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingExample3 extends JFrame implements ActionListener {

    private JLabel itemNameLabel; // Changed from productNameLabel
    private JTextField itemNameTextField; // Changed from productNameTextField
    private JLabel itemTypeLabel; // Changed from productTypeLabel
    private JRadioButton localRadioButton;
    private JRadioButton foreignRadioButton;
    private JTextArea descriptionTextArea;
    private JButton submitButton;

    private boolean productNameEntered = false;

    public SwingExample3() {
        super("Swing Example-3");
        setLayout(new FlowLayout());

        itemNameLabel = new JLabel("Item Name:"); // Changed from Product Name
        add(itemNameLabel);
		

        itemNameTextField = new JTextField(10); // Changed from productNameTextField
        add(itemNameTextField);

        itemTypeLabel = new JLabel("Item Type:"); // Changed from Product Type
        add(itemTypeLabel);
		//setBounds(50,30,1800,50);

        localRadioButton = new JRadioButton("Local");
        add(localRadioButton);

        foreignRadioButton = new JRadioButton("Foreign");
        add(foreignRadioButton);

        ButtonGroup itemTypeGroup = new ButtonGroup();
        itemTypeGroup.add(localRadioButton);
        itemTypeGroup.add(foreignRadioButton);

        descriptionTextArea = new JTextArea(6, 10);
        add(descriptionTextArea);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        add(submitButton);

        setSize(300, 200);
        setVisible(true);
    }

public void actionPerformed(ActionEvent e) {
    if (e.getSource() == submitButton) {
        String itemName = itemNameTextField.getText();
        String itemType = "";
        if (localRadioButton.isSelected()) {
            itemType = "Local";
        } else if (foreignRadioButton.isSelected()) {
            itemType = "Foreign";
        }
        String description = descriptionTextArea.getText();

        // Display information with labels on separate lines
        System.out.println("Item Name:\n" + itemName);
        System.out.println("Item Type:\n" + itemType);
        System.out.println("Description:\n" + description);
    }
}




    public static void main(String[] args) {
        new SwingExample3();
    }
}
