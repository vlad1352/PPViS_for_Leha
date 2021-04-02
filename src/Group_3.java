import javax.swing.*;

public class Group_3 {

    private JTextField textField;
    private JButton button;
    private JRadioButton radio_1;
    private JRadioButton radio_2;
    private JRadioButton radio_3;
    private JPanel panel;
    private JDialog dialog;
    private  int a = 0;

    public Group_3() {
        panel = new JPanel();
        textField = new JTextField(20);
        button = new JButton("press me");
        radio_1 = new JRadioButton("radio 1");
        radio_2 = new JRadioButton("radio 2");
        radio_3 = new JRadioButton("radio 3");
        button.addActionListener(e -> {
            if(a < 1){
                switch (textField.getText()) {
                    case "radio 1": {
                        radio_1.setSelected(true);
                        radio_2.setSelected(false);
                        radio_3.setSelected(false);

                        break;
                    }
                    case "radio 2": {
                        radio_2.setSelected(true);
                        radio_1.setSelected(false);
                        radio_3.setSelected(false);

                        break;
                    }
                    case "radio 3": {
                        radio_3.setSelected(true);
                        radio_2.setSelected(false);
                        radio_1.setSelected(false);

                        break;
                    }
                    default: {
                        dialog = new JDialog();
                        dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                        dialog.add(new JLabel("radio button not exists"));
                        dialog.setSize(150, 150);
                        dialog.setVisible(true);
                    }
                }
            } else {
                switch (textField.getText()) {
                    case "radio 1": {
                        radio_1.setSelected(true);
                        break;
                    }
                    case "radio 2": {
                        radio_2.setSelected(true);
                        break;
                    }
                    case "radio 3": {
                        radio_3.setSelected(true);
                        break;
                    }
                    default: {
                        dialog = new JDialog();
                        dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                        dialog.add(new JLabel("radio button not exists"));
                        dialog.setSize(150, 150);
                        dialog.setVisible(true);
                    }
                }
            }
            a++;
        });


        panel.add(textField);
        panel.add(radio_1);
        panel.add(radio_2);
        panel.add(radio_3);
        panel.add(button);

    }

    public JPanel getPanel() {
        return panel;
    }
}
