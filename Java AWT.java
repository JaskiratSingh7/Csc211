import java.awt.*;
import java.awt.event.*;

class EmployeeForm extends Frame implements ActionListener {
TextField nameField, idField, deptField;
Label resultLabel;

EmployeeForm()
{
    setLayout(new FlowLayout());
        
        add(new Label("Name:"));
        nameField = new TextField(20);
        add(nameField);

        add(new Label("Employee ID:"));
        idField = new TextField(10);
        add(idField);

        add(new Label("Department:"));
        deptField = new TextField(15);
        add(deptField);

        Button submitButton = new Button("Submit");
        submitButton.addActionListener(this);
        add(submitButton);

        resultLabel = new Label();
        add(resultLabel);

        setSize(300, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        resultLabel.setText("Entered: " + nameField.getText() + ", " + idField.getText() + ", " + deptField.getText());
    }

    public static void main(String[] args) {
        new EmployeeForm();
    }
}




