import javax.swing.*;

public class Main extends JFrame {
    private JPanel panel;

    public Main() {
        super("LAB 1");
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel label_1 = new JLabel("group 1");
        JLabel label_2 = new JLabel("group 2");
        JLabel label_3 = new JLabel("group 3");
        JLabel label_4 = new JLabel("group 4");
        JLabel label_5 = new JLabel("group 5");

        Group_1 group_1 = new Group_1();
        panel.add(label_1);
        panel.add(group_1.getPanel());

        Group_2 group_2 = new Group_2();
        panel.add(label_2);
        panel.add(group_2.getPanel());

        Group_3 group_3 = new Group_3();
        panel.add(label_3);
        panel.add(group_3.getPanel());

        Group_4 group_4 = new Group_4();
        panel.add(label_4);
        panel.add(group_4.getPanel());

        Group_5 group_5 = new Group_5();
        panel.add(label_5);
        panel.add(group_5.getPanel());


        add(panel);
        setSize(500,500);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Main();
    }
}
