package JOptionPane;

import javax.swing.*;
public class OptionDialog extends JFrame{
    public OptionDialog(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        String[] osPreference = {"Windows", "Mac", "Linux", "Unix", "Solaris"};
        int response = JOptionPane.showOptionDialog(
                null,
                "What is your favourite OS?",
                    "Operation System",0,
                         JOptionPane.QUESTION_MESSAGE,
                    null,
                         osPreference,osPreference[2]);
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
        new OptionDialog();
    }
}
