package JOptionPane;

import javax.swing.*;

public class InputDialog extends JFrame{

    public InputDialog(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(220, 150);
        String response = JOptionPane.showInputDialog(null, "Enter your Email");
    }
    public InputDialog(String title, int message){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(220, 150);
        String response = JOptionPane.showInputDialog(null, "Enter your Email",title,message);
    }

    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args){
        setLookAndFeel();
        InputDialog dialog = new InputDialog();
        InputDialog dialog2 = new InputDialog("Email",1);
    }

}
