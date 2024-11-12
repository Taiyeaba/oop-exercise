import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

public class AdmissionForm extends JFrame implements ActionListener {
    private JTextField studentIdField, nameField, ageField, dobField, fatherNameField,
            motherNameField, fatherOccupationField, motherOccupationField,
            presentAddressField, permanentAddressField, contactField,
            qualificationField, emailField;
    private ButtonGroup genderGroup, courseGroup, nationalityGroup, bloodGroup;
    private JButton submitButton;

    public AdmissionForm() {
        setTitle("Student Admission Form");
        setSize(600, 750);  // Increased size for larger panel space
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);  // Increased insets for spacing
        gbc.fill = GridBagConstraints.HORIZONTAL;

        int y = 0;
        addComponent(formPanel, gbc, new JLabel("Student ID:"), 0, y);
        studentIdField = new JTextField(20);  // Increased field width
        addComponent(formPanel, gbc, studentIdField, 1, y++);

        addComponent(formPanel, gbc, new JLabel("Name:"), 0, y);
        nameField = new JTextField(20);
        addComponent(formPanel, gbc, nameField, 1, y++);

        addComponent(formPanel, gbc, new JLabel("Age:"), 0, y);
        ageField = new JTextField(20);
        addComponent(formPanel, gbc, ageField, 1, y++);

        addComponent(formPanel, gbc, new JLabel("Date of Birth:"), 0, y);
        dobField = new JTextField(20);
        addComponent(formPanel, gbc, dobField, 1, y++);

        addComponent(formPanel, gbc, new JLabel("Father's Name:"), 0, y);
        fatherNameField = new JTextField(20);
        addComponent(formPanel, gbc, fatherNameField, 1, y++);

        addComponent(formPanel, gbc, new JLabel("Mother's Name:"), 0, y);
        motherNameField = new JTextField(20);
        addComponent(formPanel, gbc, motherNameField, 1, y++);

        // Gender Radio Buttons
        addComponent(formPanel, gbc, new JLabel("Gender:"), 0, y);
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5)); // Increased padding
        JRadioButton maleButton = new JRadioButton("Male");
        JRadioButton femaleButton = new JRadioButton("Female");
        JRadioButton otherButton = new JRadioButton("Other");
        genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        genderGroup.add(otherButton);
        genderPanel.add(maleButton);
        genderPanel.add(femaleButton);
        genderPanel.add(otherButton);
        addComponent(formPanel, gbc, genderPanel, 1, y++);

        // Course Radio Buttons
        addComponent(formPanel, gbc, new JLabel("Course:"), 0, y);
        JPanel coursePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
        JRadioButton csButton = new JRadioButton("Computer Science");
        JRadioButton mathButton = new JRadioButton("Mathematics");
        JRadioButton physicsButton = new JRadioButton("SWE");
        JRadioButton chemistryButton = new JRadioButton("Chemistry");
        courseGroup = new ButtonGroup();
        courseGroup.add(csButton);
        courseGroup.add(mathButton);
        courseGroup.add(physicsButton);
        courseGroup.add(chemistryButton);
        coursePanel.add(csButton);
        coursePanel.add(mathButton);
        coursePanel.add(physicsButton);
        coursePanel.add(chemistryButton);
        addComponent(formPanel, gbc, coursePanel, 1, y++);

        addComponent(formPanel, gbc, new JLabel("Contact Number:"), 0, y);
        contactField = new JTextField(20);
        addComponent(formPanel, gbc, contactField, 1, y++);

        addComponent(formPanel, gbc, new JLabel("Email:"), 0, y);
        emailField = new JTextField(20);
        addComponent(formPanel, gbc, emailField, 1, y++);

        addComponent(formPanel, gbc, new JLabel("Present Address:"), 0, y);
        presentAddressField = new JTextField(20);
        addComponent(formPanel, gbc, presentAddressField, 1, y++);

        addComponent(formPanel, gbc, new JLabel("Permanent Address:"), 0, y);
        permanentAddressField = new JTextField(20);
        addComponent(formPanel, gbc, permanentAddressField, 1, y++);

        addComponent(formPanel, gbc, new JLabel("Previous Qualification:"), 0, y);
        qualificationField = new JTextField(20);
        addComponent(formPanel, gbc, qualificationField, 1, y++);

        // Nationality Radio Buttons
        addComponent(formPanel, gbc, new JLabel("Nationality:"), 0, y);
        JPanel nationalityPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
        JRadioButton indianButton = new JRadioButton("Indian");
        JRadioButton americanButton = new JRadioButton("Bangladesh");
        JRadioButton britishButton = new JRadioButton("British");
        nationalityGroup = new ButtonGroup();
        nationalityGroup.add(indianButton);
        nationalityGroup.add(americanButton);
        nationalityGroup.add(britishButton);
        nationalityPanel.add(indianButton);
        nationalityPanel.add(americanButton);
        nationalityPanel.add(britishButton);
        addComponent(formPanel, gbc, nationalityPanel, 1, y++);

        // Blood Group Radio Buttons with additional options
        addComponent(formPanel, gbc, new JLabel("Blood Group:"), 0, y);
        JPanel bloodGroupPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
        JRadioButton aPlusButton = new JRadioButton("A+");
        JRadioButton aMinusButton = new JRadioButton("A-");
        JRadioButton bPlusButton = new JRadioButton("B+");
        JRadioButton bMinusButton = new JRadioButton("B-");
        JRadioButton abPlusButton = new JRadioButton("AB+");
        JRadioButton abMinusButton = new JRadioButton("AB-");
        JRadioButton oPlusButton = new JRadioButton("O+");
        JRadioButton oMinusButton = new JRadioButton("O-");
        bloodGroup = new ButtonGroup();
        bloodGroup.add(aPlusButton);
        bloodGroup.add(aMinusButton);
        bloodGroup.add(bPlusButton);
        bloodGroup.add(bMinusButton);
        bloodGroup.add(abPlusButton);
        bloodGroup.add(abMinusButton);
        bloodGroup.add(oPlusButton);
        bloodGroup.add(oMinusButton);
        bloodGroupPanel.add(aPlusButton);
        bloodGroupPanel.add(aMinusButton);
        bloodGroupPanel.add(bPlusButton);
        bloodGroupPanel.add(bMinusButton);
        bloodGroupPanel.add(abPlusButton);
        bloodGroupPanel.add(abMinusButton);
        bloodGroupPanel.add(oPlusButton);
        bloodGroupPanel.add(oMinusButton);
        addComponent(formPanel, gbc, bloodGroupPanel, 1, y++);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        gbc.gridwidth = 2;
        gbc.gridx = 0;
        gbc.gridy = y;
        formPanel.add(submitButton, gbc);

        add(formPanel);
        setVisible(true);
    }

    private void addComponent(JPanel panel, GridBagConstraints gbc, Component component, int x, int y) {
        gbc.gridx = x;
        gbc.gridy = y;
        panel.add(component, gbc);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            StringBuilder message = new StringBuilder("Form Submitted:\n\n");
            message.append("Student ID: ").append(studentIdField.getText()).append("\n");
            message.append("Name: ").append(nameField.getText()).append("\n");
            message.append("Age: ").append(ageField.getText()).append("\n");
            message.append("Date of Birth: ").append(dobField.getText()).append("\n");
            message.append("Father's Name: ").append(fatherNameField.getText()).append("\n");
            message.append("Mother's Name: ").append(motherNameField.getText()).append("\n");

            String gender = getSelectedButtonText(genderGroup);
            message.append("Gender: ").append(gender).append("\n");

            String course = getSelectedButtonText(courseGroup);
            message.append("Course: ").append(course).append("\n");

            message.append("Contact Number: ").append(contactField.getText()).append("\n");
            message.append("Email: ").append(emailField.getText()).append("\n");
            message.append("Present Address: ").append(presentAddressField.getText()).append("\n");
            message.append("Permanent Address: ").append(permanentAddressField.getText()).append("\n");
            message.append("Previous Qualification: ").append(qualificationField.getText()).append("\n");

            String nationality = getSelectedButtonText(nationalityGroup);
            message.append("Nationality: ").append(nationality).append("\n");

            String bloodType = getSelectedButtonText(bloodGroup);
            message.append("Blood Group: ").append(bloodType).append("\n");

            JOptionPane.showMessageDialog(this, message.toString());
        }
    }

    private String getSelectedButtonText(ButtonGroup group) {
        for (Enumeration<AbstractButton> buttons = group.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                return button.getText();
            }
        }
        return "Not specified"; // Default return if none selected
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(AdmissionForm::new);
    }
}
