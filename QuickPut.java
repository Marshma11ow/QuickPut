import javax.swing.*;
import javax.swing.border.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QuickPut extends JFrame {

    private String userInput;

    public String getInput(String message) { return showUI(message); }

    private String showUI(String message) {

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JDialog dialog = new JDialog(this);

        JPanel panel = new JPanel();

        JLabel label = new JLabel(message);

        JTextField textField = new JTextField(16);

        JButton button = new JButton("Submit");

        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                userInput = textField.getText();
                dispose();
            }

        });

        panel.add(label);
        panel.add(textField);
        panel.add(button);
        panel.setBorder(new EmptyBorder(10,10,10,10));
        
        dialog.add(panel);
        dialog.pack();
        dialog.setModal(true);
        dialog.setVisible(true);

        return userInput;
    }
}
