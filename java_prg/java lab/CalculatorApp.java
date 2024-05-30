import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorApp extends JFrame implements ActionListener {

    private JTextField textField;
    private JButton[] numberButtons;
    private JButton[] operationButtons;
    private JButton addButton, subButton, mulButton, divButton, eqButton, clrButton;
    private String num1, num2, result;
    private char operator;

    public CalculatorApp() {
        setTitle("Simple Calculator");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create text field
        textField = new JTextField();
        textField.setFont(new Font("Arial", Font.PLAIN, 24));
        add(textField, BorderLayout.NORTH);

        // Create number buttons
        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setFont(new Font("Arial", Font.PLAIN, 20));
            numberButtons[i].addActionListener(this);
        }

        // Create operation buttons
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        eqButton = new JButton("=");
        clrButton = new JButton("C");

        operationButtons = new JButton[]{addButton, subButton, mulButton, divButton, eqButton, clrButton};
        for (JButton button : operationButtons) {
            button.setFont(new Font("Arial", Font.PLAIN, 20));
            button.addActionListener(this);
        }

        // Create button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 10, 10));

        // Add number buttons to the panel
        for (int i = 1; i <= 9; i++) {
            buttonPanel.add(numberButtons[i]);
        }
        buttonPanel.add(addButton);
        buttonPanel.add(numberButtons[0]);
        buttonPanel.add(eqButton);
        buttonPanel.add(subButton);
        buttonPanel.add(mulButton);
        buttonPanel.add(divButton);
        buttonPanel.add(clrButton);

        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                textField.setText(textField.getText() + i);
            }
        }

        if (e.getSource() == addButton) {
            num1 = textField.getText();
            operator = '+';
            textField.setText("");
        }

        if (e.getSource() == subButton) {
            num1 = textField.getText();
            operator = '-';
            textField.setText("");
        }

        if (e.getSource() == mulButton) {
            num1 = textField.getText();
            operator = '*';
            textField.setText("");
        }

        if (e.getSource() == divButton) {
            num1 = textField.getText();
            operator = '/';
            textField.setText("");
        }

        if (e.getSource() == eqButton) {
            num2 = textField.getText();

            try {
                switch (operator) {
                    case '+':
                        result = String.valueOf(Integer.parseInt(num1) + Integer.parseInt(num2));
                        break;
                    case '-':
                        result = String.valueOf(Integer.parseInt(num1) - Integer.parseInt(num2));
                        break;
                    case '*':
                        result = String.valueOf(Integer.parseInt(num1) * Integer.parseInt(num2));
                        break;
                    case '/':
                        if (Integer.parseInt(num2) != 0) {
                            result = String.valueOf(Integer.parseInt(num1) / Integer.parseInt(num2));
                        } else {
                            textField.setText("Error");
                            return;
                        }
                        break;
                }
            } catch (NumberFormatException ex) {
                // Handle NumberFormatException when parsing integers
                result = String.valueOf(Double.parseDouble(num1) + Double.parseDouble(num2));
            }

            textField.setText(result);
            num1 = result;
            operator = '\0';
        }

        if (e.getSource() == clrButton) {
            textField.setText("");
            num1 = num2 = result = null;
            operator = '\0';
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CalculatorApp());
    }
}
