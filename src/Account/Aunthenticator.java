package Account;
import javax.swing.*;

public class Aunthenticator extends javax.swing.JFrame{
    JTextField username   = new JTextField(15);
    JPasswordField password  = new JPasswordField(15);
    JTextArea comments = new JTextArea(4,15);
    JButton ok   = new JButton("OK");
    JButton cancel = new JButton("Cancel");

    public Aunthenticator() {
        super("Account Information");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,220);

        JPanel panel = new JPanel();
        JLabel usernameLabel = new JLabel("Username: ");
        JLabel userPasswordLabel = new JLabel("Password: ");
        JLabel commentsLabel = new JLabel("Comments: ");

        comments.setLineWrap(true);
        comments.setWrapStyleWord(true);
        panel.add(usernameLabel);
        panel.add(username);
        panel.add(userPasswordLabel);
        panel.add(password);
        panel.add(commentsLabel);
        panel.add(comments);
        panel.add(ok);
        panel.add(cancel);
        add(panel);
        setVisible(true);
    }
    private static void setLookAndFeel(){
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        Aunthenticator.setLookAndFeel();
        Aunthenticator auth = new Aunthenticator();
    }
}
