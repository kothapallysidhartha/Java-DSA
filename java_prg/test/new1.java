import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class new1 {
    private double balance = 0.0;

    public BankManagementSystemGUI() {
        JFrame frame = new JFrame("Bank Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        frame.add(panel);

        JLabel balanceLabel = new JLabel("Balance: $0.00");
        panel.add(balanceLabel);

        JButton depositButton = new JButton("Deposit");
        panel.add(depositButton);

        JButton withdrawButton = new JButton("Withdraw");
        panel.add(withdrawButton);

        depositButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String depositAmountStr = JOptionPane.showInputDialog("Enter deposit amount:");
                if (depositAmountStr != null && !depositAmountStr.isEmpty()) {
                    double depositAmount = Double.parseDouble(depositAmountStr);
                    balance += depositAmount;
                    updateBalanceLabel(balanceLabel);
                }
            }
        });

        withdrawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String withdrawAmountStr = JOptionPane.showInputDialog("Enter withdrawal amount:");
                if (withdrawAmountStr != null && !withdrawAmountStr.isEmpty()) {
                    double withdrawAmount = Double.parseDouble(withdrawAmountStr);
                    if (withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        updateBalanceLabel(balanceLabel);
                    } else {
                        JOptionPane.showMessageDialog(frame, "Insufficient balance");
                    }
                }
            }
        });

        frame.setVisible(true);
    }

    private void updateBalanceLabel(JLabel label) {
        label.setText("Balance: $" + String.format("%.2f", balance));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BankManagementSystemGUI();
            }
        });
    }
}
