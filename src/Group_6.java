import javax.swing.*;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Group_6 {
    JPanel panel;
    private JTextField textField;
    private JButton button_1;
    private JButton button_2;
    private JButton button_3;
    private List<JRadioButton> list;
    private Timer timer;

    public JPanel getPanel() {
        return panel;
    }

    public Group_6() {
        panel = new JPanel();
        textField = new JTextField(20);
        button_1 = new JButton("1");
        button_2 = new JButton("2");
        button_3 = new JButton("3");


        timer = new Timer(1000, e1 -> {
            System.out.println("timer run"); if (list.get(list.size() - 1).isSelected()) {
                list.get(list.size() - 1).setSelected(false);
                list.get(0).setSelected(true);
                panel.updateUI();
                return;
            }
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i).isSelected()) {
                    System.out.println("turn off");
                    list.get(i).setSelected(false);
                    list.get(i + 1).setSelected(true);
                    panel.updateUI();
                    break;
                }

            }
        });
        timer.setRepeats(true);

        button_1.addActionListener(e -> {
            list = new ArrayList<>();
            panel.updateUI();
            int count = Integer.parseInt(textField.getText());
            for (int i = 0; i < count; i++) {
                list.add(new JRadioButton("radio_" + i, false));
                panel.add(list.get(i));
            }

            panel.updateUI();
        });
        button_2.addActionListener(e -> {
            list.get(0).setSelected(true);
            for (int i = 1; i < list.size() - 1; i++) {
                if (list.get(i).isSelected()) {
                    list.get(i).setSelected(false);
                }
            }
            timer.start();
        });
        button_3.addActionListener(e -> {
            timer.stop();
        });

        panel.add(textField);
        panel.add(button_1);
        panel.add(button_2);
        panel.add(button_3);



    }
}
