package JOptionPane;

import javax.swing.*;

public class ConfirmDialog extends JFrame{

    public ConfirmDialog(){
        super("Confirm Dialog");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(220, 150);
        int response = JOptionPane.showConfirmDialog(null,"Error reading file. Want to try again?",
                "File Input Error",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.ERROR_MESSAGE);


    }

    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        ConfirmDialog.setLookAndFeel();
        ConfirmDialog frame = new ConfirmDialog();
    }
}
