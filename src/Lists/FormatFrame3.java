package Lists;

import javax.swing.*;

public class FormatFrame3 extends JFrame{
    String[] subs = {"Burningbird", "Freedom Goodness", "Inessential", "Whole Lotta Nothing", "Workbench",
    "Manton.org", "Micro Thoughts", "Rasteweb","Self Made Minds"};
    JList<String> subList = new JList(subs);

    public FormatFrame3() {
        super("Subscriptions");
        setSize(150, 335);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JLabel label = new JLabel("RSS Subscriptions");
        panel.add(label);
        subList.setVisibleRowCount(6);
        JScrollPane scrollPane = new JScrollPane(subList);
        panel.add(scrollPane);

        add(panel);
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
        FormatFrame3.setLookAndFeel();
        FormatFrame3 frame = new FormatFrame3();
    }
}
