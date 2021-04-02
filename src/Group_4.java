import javax.swing.*;

public class Group_4 {

    private JPanel panel;
    private JTextField textField;
    private JButton button;
    private JCheckBox check_1;
    private JCheckBox check_2;
    private JCheckBox check_3;


    public Group_4() {
        panel = new JPanel();
        textField = new JTextField(20);
        check_1 = new JCheckBox("check 1");
        check_2 = new JCheckBox("check 2");
        check_3 = new JCheckBox("check 3");
        button = new JButton("click");

        button.addActionListener(e -> {
            switch (textField.getText()) {
                case "check 1": {
                    if(check_1.isSelected()) {
                        check_1.setSelected(false);
                    } else {
                        check_1.setSelected(true);
                    }

                    break;
                }
                case "check 2": {
                    if(check_2.isSelected()) {
                        check_2.setSelected(false);
                    } else {
                        check_2.setSelected(true);
                    }                    break;
                }
                case "check 3": {
                    if(check_3.isSelected()) {
                        check_3.setSelected(false);
                    } else {
                        check_3.setSelected(true);
                    }                    break;
                }
            }
        });
        panel.add(textField);
        panel.add(check_1);
        panel.add(check_2);
        panel.add(check_3);
        panel.add(button);


    }

    public JPanel getPanel() {
        return panel;
    }
}
