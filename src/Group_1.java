import javax.swing.*;
import java.util.*;

public class Group_1 {

    private JTextField textField;
    private JComboBox comboBox;
    private JButton button;
    private JDialog dialog;
    private Set<String> items = new HashSet<>();
    private JPanel panel;

    Group_1() {
        textField = new JTextField(20);
        panel = new JPanel();
        button = new JButton("press me");
        comboBox = new JComboBox();
        button.addActionListener(e -> {
            if(items.contains(textField.getText())){
                dialog = new JDialog();
                dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                dialog.add(new JLabel("can't add"));
                dialog.setSize(100,100);
                dialog.setVisible(true);
            } else {
                items.add(textField.getText());
                    comboBox.addItem(textField.getText());
            }
        });
        panel.add(textField);
        panel.add(button);
        panel.add(comboBox);
    }

    public JPanel getPanel() {
        return panel;
    }
}
