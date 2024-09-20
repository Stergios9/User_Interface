package JComboBoxFormat;
import javax.swing.*;

public class FormatFrame2 extends JFrame {
    String[] formats = { "Atom", "RSS 0.92", "RSS 1.0", "RSS 2.0" };
    JComboBox<String> comboBox = new JComboBox<>(formats);

    public FormatFrame2() {
        super("Choose a Format");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(220, 150);
        JPanel pane = new JPanel();
        JLabel formatLabel = new JLabel("Choose a Format");
        pane.add(formatLabel);
        pane.add(comboBox);
        add(pane);
        setVisible(true);
    }
    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        FormatFrame2.setLookAndFeel();
        new FormatFrame2();
    }
}
