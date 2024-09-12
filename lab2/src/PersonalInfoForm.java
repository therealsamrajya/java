import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PersonalInfoForm {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Personal Info");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        // Set GridBagLayout for the frame's content pane
        frame.setLayout(new GridBagLayout());

        // GridBagConstraints for "Enter your Personal Information" label on the left
        GridBagConstraints gbc1 = new GridBagConstraints();
        gbc1.gridx = 0;
        gbc1.gridy = 0;
        gbc1.anchor = GridBagConstraints.WEST;
        gbc1.insets = new Insets(10, 10, 5, 10);

        // JLabel for "Enter your Personal Information" title
        JLabel personalInfoLabel = new JLabel("Enter your Personal Information");
        frame.add(personalInfoLabel, gbc1);

        // GridBagConstraints for "First Name" label
        GridBagConstraints gbc2 = new GridBagConstraints();
        gbc2.gridx = 0;
        gbc2.gridy = 1;
        gbc2.anchor = GridBagConstraints.WEST;
        gbc2.insets = new Insets(5, 10, 5, 5);

        // JLabel for "First Name"
        JLabel firstNameLabel = new JLabel("First Name:");
        frame.add(firstNameLabel, gbc2);

        // GridBagConstraints for the "First Name" text field
        GridBagConstraints gbc3 = new GridBagConstraints();
        gbc3.gridx = 1;
        gbc3.gridy = 1;
        gbc3.fill = GridBagConstraints.HORIZONTAL;
        gbc3.weightx = 0.8;
        gbc3.insets = new Insets(5, 5, 5, 10);

        // JTextField for first name input
        JTextField firstNameField = new JTextField(15);
        frame.add(firstNameField, gbc3);


        GridBagConstraints gbc4 = new GridBagConstraints();
        gbc4.gridx = 0;
        gbc4.gridy = 2;
        gbc4.anchor = GridBagConstraints.WEST;
        gbc4.insets = new Insets(5, 10, 5, 5);


        JLabel lastNameLabel = new JLabel("Last Name:");
        frame.add(lastNameLabel, gbc4);


        GridBagConstraints gbc5 = new GridBagConstraints();
        gbc5.gridx = 1;
        gbc5.gridy = 2;
        gbc5.fill = GridBagConstraints.HORIZONTAL;
        gbc5.weightx = 1.0;
        gbc5.insets = new Insets(5, 5, 10, 10);


        JTextField lastNameField = new JTextField(15);
        frame.add(lastNameField, gbc5);

        // GridBagConstraints for "Gender" label
        GridBagConstraints gbc8 = new GridBagConstraints();
        gbc8.gridx = 0;
        gbc8.gridy = 3;
        gbc8.anchor = GridBagConstraints.WEST;
        gbc8.insets = new Insets(10, 10, 5, 5);

        // JLabel for "Gender"
        JLabel genderLabel = new JLabel("Gender:");
        frame.add(genderLabel, gbc8);

        // GridBagConstraints for gender selection
        GridBagConstraints gbc6 = new GridBagConstraints();
        gbc6.gridx = 1;
        gbc6.gridy = 3;
        gbc6.fill = GridBagConstraints.HORIZONTAL;
        gbc6.weightx = 1.0;
        gbc6.insets = new Insets(10, 5, 10, 10);

        // JPanel for gender selection radio buttons
        JPanel genderPanel = new JPanel();
        genderPanel.setLayout(new GridBagLayout()); // Use GridBagLayout for the panel
        GridBagConstraints gbc7 = new GridBagConstraints();
        gbc7.anchor = GridBagConstraints.WEST;
        gbc7.insets = new Insets(5, 5, 5, 5);

        JRadioButton maleRadioButton = new JRadioButton("Male");
        JRadioButton femaleRadioButton = new JRadioButton("Female");
        JRadioButton otherRadioButton = new JRadioButton("Other");

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);
        genderGroup.add(otherRadioButton);

        genderPanel.add(maleRadioButton, gbc7);
        genderPanel.add(femaleRadioButton, gbc7);
        genderPanel.add(otherRadioButton, gbc7);

        frame.add(genderPanel, gbc6);

        // GridBagConstraints for "Birthdate" label
        GridBagConstraints gbc9 = new GridBagConstraints();
        gbc9.gridx = 0;
        gbc9.gridy = 4;
        gbc9.anchor = GridBagConstraints.WEST;
        gbc9.insets = new Insets(10, 10, 5, 5);

        // JLabel for "Birthdate"
        JLabel birthdateLabel = new JLabel("Birthdate:");
        frame.add(birthdateLabel, gbc9);

        // JPanel for birthdate components
        JPanel birthdatePanel = new JPanel();
        birthdatePanel.setLayout(new GridBagLayout());

        // GridBagConstraints for weekday dropdown
        GridBagConstraints gbc10 = new GridBagConstraints();
        gbc10.gridx = 0;
        gbc10.gridy = 0;
        gbc10.anchor = GridBagConstraints.WEST;
        gbc10.insets = new Insets(5, 5, 5, 5);

        // JComboBox for weekday selection
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        JComboBox<String> weekdayComboBox = new JComboBox<>(weekdays);
        birthdatePanel.add(weekdayComboBox, gbc10);

        // GridBagConstraints for month dropdown
        GridBagConstraints gbc11 = new GridBagConstraints();
        gbc11.gridx = 1;
        gbc11.gridy = 0;
        gbc11.anchor = GridBagConstraints.WEST;
        gbc11.insets = new Insets(5, 5, 5, 5);

        // JComboBox for month selection
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        JComboBox<String> monthComboBox = new JComboBox<>(months);
        birthdatePanel.add(monthComboBox, gbc11);

        // GridBagConstraints for day dropdown
        GridBagConstraints gbc12 = new GridBagConstraints();
        gbc12.gridx = 2;
        gbc12.gridy = 0;
        gbc12.anchor = GridBagConstraints.WEST;
        gbc12.insets = new Insets(5, 5, 5, 5);

        // JComboBox for day selection
        String[] days = new String[31];
        for (int i = 0; i < 31; i++) {
            days[i] = String.valueOf(i + 1);
        }
        JComboBox<String> dayComboBox = new JComboBox<>(days);
        birthdatePanel.add(dayComboBox, gbc12);

        // GridBagConstraints for year text field
        GridBagConstraints gbc13 = new GridBagConstraints();
        gbc13.gridx = 3;
        gbc13.gridy = 0;
        gbc13.fill = GridBagConstraints.HORIZONTAL;
        gbc13.weightx = 1.0;
        gbc13.insets = new Insets(5, 5, 5, 5);

        // JTextField for year input
        JTextField yearTextField = new JTextField(10);
        birthdatePanel.add(yearTextField, gbc13);

        // Add birthdatePanel to the frame
        GridBagConstraints gbc14 = new GridBagConstraints();
        gbc14.gridx = 1;
        gbc14.gridy = 4;
        gbc14.fill = GridBagConstraints.HORIZONTAL;
        gbc14.weightx = 1.0;
        gbc14.insets = new Insets(10, 5, 10, 10);
        frame.add(birthdatePanel, gbc14);

        // GridBagConstraints for "Timezone" label
        GridBagConstraints gbc15 = new GridBagConstraints();
        gbc15.gridx = 0;
        gbc15.gridy = 5;
        gbc15.anchor = GridBagConstraints.WEST;
        gbc15.insets = new Insets(10, 10, 5, 5);

        // JLabel for "Timezone"
        JLabel timezoneLabel = new JLabel("Timezone:");
        frame.add(timezoneLabel, gbc15);

        // GridBagConstraints for timezone dropdown
        GridBagConstraints gbc16 = new GridBagConstraints();
        gbc16.gridx = 1;
        gbc16.gridy = 5;
        gbc16.fill = GridBagConstraints.HORIZONTAL;
        gbc16.weightx = 1.0;
        gbc16.insets = new Insets(10, 5, 10, 10);

        // JComboBox for timezone selection
        String[] timezones = {"UTC", "GMT", "PST", "EST", "CET", "IST", "JST"};
        JComboBox<String> timezoneComboBox = new JComboBox<>(timezones);
        frame.add(timezoneComboBox, gbc16);

        // Save button
        GridBagConstraints gbc17 = new GridBagConstraints();
        gbc17.gridx = 0;
        gbc17.gridy = 6;
        gbc17.gridwidth = 2;
        gbc17.anchor = GridBagConstraints.CENTER;
        gbc17.insets = new Insets(20, 10, 10, 10);

        JButton saveButton = new JButton("Save");
        frame.add(saveButton, gbc17);

        // Add an ActionListener to the Save button
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Personal information saved!");
            }
        });

        // Set the frame's visibility
        frame.setVisible(true);
    }
}
