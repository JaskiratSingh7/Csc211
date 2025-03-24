import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleRegistrationForm extends JFrame implements ActionListener {
    private JTextField nameField, emailField;
    private JButton submitButton, clearButton;

    public SimpleRegistrationForm() {
        setTitle("User Registration");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2, 10, 10));

        add(new JLabel("Name:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Email:"));
        emailField = new JTextField();
        add(emailField);

        submitButton = new JButton("Submit");
        clearButton = new JButton("Clear");

        submitButton.addActionListener(this);
        clearButton.addActionListener(this);

        add(submitButton);
        add(clearButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String name = nameField.getText();
            String email = emailField.getText();

            if (name.isEmpty() || email.isEmpty()) {
                JOptionPane.showMessageDialog(this, "All fields must be filled!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            JOptionPane.showMessageDialog(this, "Registered:\nName: " + name + "\nEmail: " + email, "Success", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == clearButton) {
            nameField.setText("");
            emailField.setText("");
        }
    }

    public static void main(String[] args) {
        new SimpleRegistrationForm();
    }
}
