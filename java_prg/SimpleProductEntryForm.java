import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class SimpleProductEntryForm extends JFrame implements ActionListener {
 
    private JTextField productNameField;
    private JRadioButton shirtRadioButton, shoesRadioButton, sunglassesRadioButton;
    private JTextArea productDescriptionArea;
    private JButton submitButton;
 
    public SimpleProductEntryForm() {
        setTitle("Product Entry Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        JPanel panel = new JPanel(new GridLayout(5, 2));
 
        // Product Name
        addLabelAndTextField(panel, "Product Name:");
        productNameField = addTextField(panel);
 
        // Product Type (Radio Buttons)
        addLabel(panel, "Product Type:");
        shirtRadioButton = addRadioButton(panel, "T-Shirt");
        shoesRadioButton = addRadioButton(panel, "Shoes");
        sunglassesRadioButton = addRadioButton(panel, "Sunglasses");
 
        // Product Description
        addLabelAndTextField(panel, "Product Description:");
        productDescriptionArea = addTextArea(panel);
 
        // Submit Button
        submitButton = addButton(panel, "Submit");
        submitButton.addActionListener(this);
 
        add(panel);
    }
 
    private void addLabelAndTextField(JPanel panel, String labelText) {
        addLabel(panel, labelText);
        addTextField(panel);
    }
 
    private void addLabel(JPanel panel, String labelText) {
        panel.add(new JLabel(labelText));
    }
 
    private JTextField addTextField(JPanel panel) {
        JTextField textField = new JTextField();
        panel.add(textField);
        return textField;
    }
 
    private JRadioButton addRadioButton(JPanel panel, String text) {
        JRadioButton radioButton = new JRadioButton(text);
        panel.add(radioButton);
        return radioButton;
    }
 
    private JTextArea addTextArea(JPanel panel) {
        JTextArea textArea = new JTextArea();
        panel.add(new JScrollPane(textArea));
        return textArea;
    }
 
    private JButton addButton(JPanel panel, String buttonText) {
        JButton button = new JButton(buttonText);
        panel.add(button);
        return button;
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String productName = productNameField.getText();
            String productType = getSelectedProductType();
            String productDescription = productDescriptionArea.getText();
 
            // Process the entered information (you can modify this part according to your needs)
            System.out.println("Product Name: " + productName);
            System.out.println("Product Type: " + productType);
            System.out.println("Product Description: " + productDescription);
        }
    }
 
    private String getSelectedProductType() {
        if (shirtRadioButton.isSelected()) {
            return "T-Shirt";
        } else if (shoesRadioButton.isSelected()) {
            return "Shoes";
        } else if (sunglassesRadioButton.isSelected()) {
            return "Sunglasses";
        } else {
            return "Not Selected";
        }
    }
 
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SimpleProductEntryForm form = new SimpleProductEntryForm();
            form.setVisible(true);
        });
    }
}
