import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TipCalculator {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Tip Calculator");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
            frame.setLocationRelativeTo(null);

            JLabel billLabel = new JLabel("Bill Amount: ₱");
            JTextField billField = new JTextField(15);

            JLabel tipLabel = new JLabel("Tip Percentage (%): ");
            JTextField tipField = new JTextField(15);

            JButton calculateBtn = new JButton("Calculate");

            JLabel resultLabel = new JLabel(" ", SwingConstants.CENTER);
            resultLabel.setPreferredSize(new Dimension(300, 80));

            frame.add(billLabel);
            frame.add(billField);
            frame.add(tipLabel);
            frame.add(tipField);
            frame.add(calculateBtn);
            frame.add(resultLabel);

            calculateBtn.addActionListener(e -> {
                try {
                    double bill = Double.parseDouble(billField.getText());
                    double tipPercent = Double.parseDouble(tipField.getText());

                    if (bill < 0 || tipPercent < 0) {
                        resultLabel.setText("Please enter positive numbers only!");
                        return;
                    }

                    double tipAmount = bill * (tipPercent / 100);
                    double total = bill + tipAmount;

                    resultLabel.setText(String.format("Tip: ₱%.2f    Total: ₱%.2f", tipAmount, total));

                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter valid numbers only!");
                }
            });

            frame.setVisible(true);
        });
    }
}