import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class AdmissionForm {

    public static void main(String[] args) {
        JFrame frame = new JFrame("University Admission Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800); // Adjusted size for proper alignment
        frame.setLayout(new BorderLayout());

        // Panel for form fields
        JPanel formPanel = new JPanel(new GridLayout(21, 2, 5, 5)); // 2 columns: labels and fields (updated for fewer fields)

        // JTable and Submit Button
        String[] columnNames = {
            "Student ID", "Name", "Father's Name", "Mother's Name", "DOB",
            "Gender", "Blood Group", "Address", "Email", "Phone",
            "SSC Year", "SSC Grade", "SSC Board", "SSC Group",
            "HSC Year", "HSC Grade", "HSC Board", "HSC Group",
            "Course Preferences"
        };
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        JTable table = new JTable(tableModel);
        JScrollPane tableScrollPane = new JScrollPane(table);

        // Form fields
        JLabel studentIdLabel = new JLabel("Student ID:");
        JTextField studentIdField = new JTextField();

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();

        JLabel fatherNameLabel = new JLabel("Father's Name:");
        JTextField fatherNameField = new JTextField();

        JLabel motherNameLabel = new JLabel("Mother's Name:");
        JTextField motherNameField = new JTextField();

        JLabel dobLabel = new JLabel("Date of Birth:");
        JSpinner dobSpinner = new JSpinner(new SpinnerDateModel());
        JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(dobSpinner, "dd/MM/yyyy");
        dobSpinner.setEditor(dateEditor);
        dobSpinner.setValue(Calendar.getInstance().getTime());

        JLabel genderLabel = new JLabel("Gender:");
        JRadioButton maleRadio = new JRadioButton("Male");
        JRadioButton femaleRadio = new JRadioButton("Female");
        JRadioButton otherRadio = new JRadioButton("Other");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);
        genderGroup.add(otherRadio);
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPanel.add(maleRadio);
        genderPanel.add(femaleRadio);
        genderPanel.add(otherRadio);

        JLabel bloodGroupLabel = new JLabel("Blood Group:");
        String[] bloodGroups = {"A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-"};
        JComboBox<String> bloodGroupBox = new JComboBox<>(bloodGroups);

        JLabel addressLabel = new JLabel("Address:");
        JTextArea addressField = new JTextArea(3, 20);
        JScrollPane addressScroll = new JScrollPane(addressField);

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField();

        JLabel phoneLabel = new JLabel("Phone:");
        JTextField phoneField = new JTextField();

        JLabel sscYearLabel = new JLabel("SSC Passing Year:");
        JComboBox<String> sscYearBox = new JComboBox<>();
        sscYearBox.addItem("Select a year");
        for (int i = 2022; i >= 2018; i--) {
            sscYearBox.addItem(String.valueOf(i));
        }

        JLabel sscGradeLabel = new JLabel("SSC Grade:");
        JTextField sscGradeField = new JTextField();

        JLabel sscBoardLabel = new JLabel("SSC Board:");
        JTextField sscBoardField = new JTextField();

        JLabel sscGroupLabel = new JLabel("SSC Group:");
        JTextField sscGroupField = new JTextField();

        JLabel hscYearLabel = new JLabel("HSC Passing Year:");
        JComboBox<String> hscYearBox = new JComboBox<>();
        hscYearBox.addItem("Select a year");
        for (int i = 2024; i >= 2020; i--) {
            hscYearBox.addItem(String.valueOf(i));
        }

        JLabel hscGradeLabel = new JLabel("HSC Grade:");
        JTextField hscGradeField = new JTextField();

        JLabel hscBoardLabel = new JLabel("HSC Board:");
        JTextField hscBoardField = new JTextField();

        JLabel hscGroupLabel = new JLabel("HSC Group:");
        JTextField hscGroupField = new JTextField();

        JLabel coursePreferenceLabel = new JLabel("Course Preference:");
        JCheckBox cseCheckBox = new JCheckBox("CSE");
        JCheckBox sweCheckBox = new JCheckBox("SWE");
        JCheckBox eeeCheckBox = new JCheckBox("EEE");
        JCheckBox bbaCheckBox = new JCheckBox("BBA");
        JCheckBox englishCheckBox = new JCheckBox("English");
        JPanel coursePreferencesPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        coursePreferencesPanel.add(cseCheckBox);
        coursePreferencesPanel.add(sweCheckBox);
        coursePreferencesPanel.add(eeeCheckBox);
        coursePreferencesPanel.add(bbaCheckBox);
        coursePreferencesPanel.add(englishCheckBox);

        JButton submitButton = new JButton("Submit");

        // Add fields to the form panel
        formPanel.add(studentIdLabel); formPanel.add(studentIdField);
        formPanel.add(nameLabel); formPanel.add(nameField);
        formPanel.add(fatherNameLabel); formPanel.add(fatherNameField);
        formPanel.add(motherNameLabel); formPanel.add(motherNameField);
        formPanel.add(dobLabel); formPanel.add(dobSpinner);
        formPanel.add(genderLabel); formPanel.add(genderPanel);
        formPanel.add(bloodGroupLabel); formPanel.add(bloodGroupBox);
        formPanel.add(addressLabel); formPanel.add(addressScroll);
        formPanel.add(emailLabel); formPanel.add(emailField);
        formPanel.add(phoneLabel); formPanel.add(phoneField);
        formPanel.add(sscYearLabel); formPanel.add(sscYearBox);
        formPanel.add(sscGradeLabel); formPanel.add(sscGradeField);
        formPanel.add(sscBoardLabel); formPanel.add(sscBoardField);
        formPanel.add(sscGroupLabel); formPanel.add(sscGroupField);
        formPanel.add(hscYearLabel); formPanel.add(hscYearBox);
        formPanel.add(hscGradeLabel); formPanel.add(hscGradeField);
        formPanel.add(hscBoardLabel); formPanel.add(hscBoardField);
        formPanel.add(hscGroupLabel); formPanel.add(hscGroupField);
        formPanel.add(coursePreferenceLabel); formPanel.add(coursePreferencesPanel);
        formPanel.add(new JLabel()); formPanel.add(submitButton);

        // ActionListener for Submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add data to JTable
                tableModel.addRow(new Object[]{
                    studentIdField.getText(), nameField.getText(), fatherNameField.getText(), motherNameField.getText(),
                    dobSpinner.getValue().toString(),
                    maleRadio.isSelected() ? "Male" : femaleRadio.isSelected() ? "Female" : "Other",
                    bloodGroupBox.getSelectedItem(), addressField.getText(), emailField.getText(), phoneField.getText(),
                    sscYearBox.getSelectedItem(), sscGradeField.getText(), sscBoardField.getText(), sscGroupField.getText(),
                    hscYearBox.getSelectedItem(), hscGradeField.getText(), hscBoardField.getText(), hscGroupField.getText(),
                    cseCheckBox.isSelected() ? "CSE" : sweCheckBox.isSelected() ? "SWE" : eeeCheckBox.isSelected() ? "EEE" :
                            bbaCheckBox.isSelected() ? "BBA" : englishCheckBox.isSelected() ? "English" : "None"
                });

                // Clear fields after submission
                studentIdField.setText(""); nameField.setText(""); fatherNameField.setText(""); motherNameField.setText("");
                dobSpinner.setValue(Calendar.getInstance().getTime()); genderGroup.clearSelection(); bloodGroupBox.setSelectedIndex(0);
                addressField.setText(""); emailField.setText(""); phoneField.setText("");
                sscYearBox.setSelectedIndex(0); sscGradeField.setText(""); sscBoardField.setText(""); sscGroupField.setText("");
                hscYearBox.setSelectedIndex(0); hscGradeField.setText(""); hscBoardField.setText(""); hscGroupField.setText("");
                cseCheckBox.setSelected(false); sweCheckBox.setSelected(false); eeeCheckBox.setSelected(false);
                bbaCheckBox.setSelected(false); englishCheckBox.setSelected(false);
            }
        });

        // Add components to the frame
        frame.add(new JScrollPane(formPanel), BorderLayout.CENTER);
        frame.add(tableScrollPane, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}