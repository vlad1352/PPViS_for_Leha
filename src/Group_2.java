import javax.swing.*;

public class Group_2 {

    private JTextField textField;
    private JButton button_1;
    private JButton button_2;
    private JPanel panel;

    public Group_2() {
        panel = new JPanel();
        textField = new JTextField(20);
        button_1 = new JButton("button 1");
        button_2 = new JButton("button 2");

        button_1.addActionListener(e -> {
            button_2.setText(textField.getText());
        });
        button_2.addActionListener(e -> {
            String str = button_1.getText();
            button_1.setText(button_2.getText());
            button_2.setText(str);
        });

        panel.add(textField);
        panel.add(button_1);
        panel.add(button_2);
    }

    public JPanel getPanel() {
        return panel;
    }
}
