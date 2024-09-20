import javax.swing.*;
import java.awt.*;

public class FeedInfo extends JFrame {
    private final JLabel nameLabel = new JLabel("Name: ",SwingConstants.RIGHT);
    private final JTextField name;
    private final JLabel urlLabel = new JLabel("URL: ",SwingConstants.RIGHT);
    private final JTextField url;
    private final JLabel typeLabel = new JLabel("Type: ",SwingConstants.RIGHT);
    private final JTextField type;

    public FeedInfo() {
        super("Feed Information");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 145);
        setLookAndFeel();

        String response1 = JOptionPane.showInputDialog(null, "Enter the site name: ");
        name = new JTextField(response1, 20);

        String response2 = JOptionPane.showInputDialog(null, "Enter your URL: ");
        url = new JTextField(response2, 20);

        String[] choices = {"Personal", "Commercial", "Unkhown"};
        int response3 = JOptionPane.showOptionDialog(null,"What type of site is it?",
                "Site type",0,JOptionPane.QUESTION_MESSAGE,null,choices,choices[0]);
        type = new JTextField(choices[response3], 20);
        setLayout(new GridLayout(3,2));
        add(nameLabel);
        add(name);
        add(urlLabel);
        add(url);
        add(typeLabel);
        add(type);
        setVisible(true);
        setVisible(true);
    }
    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args){
        FeedInfo f = new FeedInfo();

    }
}
