import javax.swing.*;

public class Group_5 {

    private JPanel panel;
    private JTextField textField;
    private JButton button_1;
    private JButton button_2;
    private JButton button_3;
    private JTable table;


    public Group_5() {
        panel = new JPanel();
        table = new JTable(5,2);
        textField = new JTextField(20);
        button_1 = new JButton("1");
        button_2 = new JButton("2");
        button_3 = new JButton("3");

        button_1.addActionListener(e -> {
            int row = table.getSelectedRow();
            table.setValueAt( textField.getText(), row, 0);
        });
        button_2.addActionListener(e -> {
            int row = table.getSelectedRow();
            table.setValueAt(table.getValueAt(row,0), row, 1);
        });

        button_3.addActionListener(e -> {
            int row = table.getSelectedRow();
            String str = (String) table.getValueAt(row,1);
            table.setValueAt(str, row, 0);
        });
        panel.add(textField);
        panel.add(button_1);
        panel.add(button_2);
        panel.add(button_3);
        panel.add(table);
    }

    public JPanel getPanel() {
        return panel;
    }
}
