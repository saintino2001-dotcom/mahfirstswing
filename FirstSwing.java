import javax.swing.*;

public class FirstSwing {
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("My First Swing Program");
            JLabel label = new JLabel("Welcome to Radzkifar Swing Program!");
            
            label.setHorizontalAlignment(JLabel.CENTER);
            
            frame.add(label);
            frame.setSize(500, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}


