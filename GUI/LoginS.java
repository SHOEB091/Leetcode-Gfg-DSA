package GUI;

import javax.swing.*;

public class LoginS {

    private static void createAndShowUI() {
        JFrame frame = new JFrame("Login Screen");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);
        frame.setLocationRelativeTo(null); // center on screen

        JTextField tfName  = new JTextField(20);
        JTextField tfEmail = new JTextField(20);
        String[] roles = {"Admin", "User", "Guest"};
        JComboBox<String> cbRole = new JComboBox<>(roles);

        JButton btnLogin  = new JButton("Login");
        JButton btnCancel = new JButton("Cancel");

        // Vertical layout using Box (Swing-only)
        Box box = Box.createVerticalBox();
        box.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));
        box.add(labelWithField("Username:", tfName));
        box.add(Box.createVerticalStrut(8));
        box.add(labelWithField("Email:", tfEmail));
        box.add(Box.createVerticalStrut(8));
        box.add(labelWithField("Role:", cbRole));
        box.add(Box.createVerticalStrut(12));

        Box buttons = Box.createHorizontalBox();
        buttons.add(btnLogin);
        buttons.add(Box.createHorizontalStrut(8));
        buttons.add(btnCancel);
        box.add(buttons);

        // Actions
        btnLogin.addActionListener(e -> {
            String name  = tfName.getText().trim();
            String email = tfEmail.getText().trim();
            String role  = (String) cbRole.getSelectedItem();
            if (name.isEmpty() || email.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Please enter name and email.");
                return;
            }
            JOptionPane.showMessageDialog(frame,
                    "Login successful!\n" +
                    "Name: " + name + "\n" +
                    "Email: " + email + "\n" +
                    "Role: " + role,
                    "Success",
                    JOptionPane.INFORMATION_MESSAGE);
        });

        btnCancel.addActionListener(e -> {
            tfName.setText("");
            tfEmail.setText("");
            cbRole.setSelectedIndex(0);
        });

        frame.setContentPane(box);
        frame.setVisible(true);
    }

    // Helper to place a label and a field horizontally
    private static Box labelWithField(String label, JComponent field) {
        Box row = Box.createHorizontalBox();
        row.add(new JLabel(label));
        row.add(Box.createHorizontalStrut(8));
        row.add(field);
        return row;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(LoginS::createAndShowUI);
    }
}