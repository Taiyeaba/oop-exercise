import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentForm extends JFrame implements ActionListener {
    private JTextField nameField;
    private JTextField ageField;
    private JTextField fatherNameField;
    private JTextField motherNameField;
    private JComboBox<String> genderBox;
    private JComboBox<String> courseBox;
    private JButton submitButton;

    public StudentForm() {
        // Set up the frame
        setTitle("Student Registration Form");
        setSize(350, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(8, 2, 10, 10));

        // Name Label and Text Field
        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        add(nameLabel);
        add(nameField);

        // Age Label and Text Field
        JLabel ageLabel = new JLabel("Age:");
        ageField = new JTextField();
        add(ageLabel);
        add(ageField);

        // Father's Name Label and Text Field
        JLabel fatherNameLabel = new JLabel("Father's Name:");
        fatherNameField = new JTextField();
        add(fatherNameLabel);
        add(fatherNameField);

        // Mother's Name Label and Text Field
        JLabel motherNameLabel = new JLabel("Mother's Name:");
        motherNameField = new JTextField();
        add(motherNameLabel);
        add(motherNameField);

        // Gender Label and Combo Box
        JLabel genderLabel = new JLabel("Gender:");
        genderBox = new JComboBox<>(new String[]{"Male", "Female", "Other"});
        add(genderLabel);
        add(genderBox);

        // Course Label and Combo Box
        JLabel courseLabel = new JLabel("Course:");
        courseBox = new JComboBox<>(new String[]{"Computer Science", "Mathematics", "Physics", "Chemistry", "Software Engineering"});
        add(courseLabel);
        add(courseBox);

        // Submit Button
        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        add(new JLabel()); // Placeholder for grid layout alignment
        add(submitButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String name = nameField.getText();
            String age = ageField.getText();
            String fatherName = fatherNameField.getText();
            String motherName = motherNameField.getText();
            String gender = (String) genderBox.getSelectedItem();
            String course = (String) courseBox.getSelectedItem();

            JOptionPane.showMessageDialog(this, "Student Information:\n"
                    + "Name: " + name + "\n"
                    + "Age: " + age + "\n"
                    + "Father's Name: " + fatherName + "\n"
                    + "Mother's Name: " + motherName + "\n"
                    + "Gender: " + gender + "\n"
                    + "Course: " + course);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(StudentForm::new);
    }
}
