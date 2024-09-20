package JOptionPane;

import javax.swing.*;

public class MessageDialog extends JFrame {
    public MessageDialog() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 150);
        JOptionPane.showMessageDialog(null,
                "The program has been unistalled.","Installation progress",
                JOptionPane.WARNING_MESSAGE);
    }


    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        MessageDialog.setLookAndFeel();
        new MessageDialog();
    }
}
