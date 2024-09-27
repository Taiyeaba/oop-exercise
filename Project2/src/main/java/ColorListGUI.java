import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ColorListGUI {
    private ArrayList<String> items;
    private DefaultListModel<String> listModel;

    public ColorListGUI() {
        items = new ArrayList<>();
        items.add("red");
        items.add("yellow");
        items.add("green");
        items.add("blue");

        createAndShowGUI();
    }

    private void createAndShowGUI() {
        JFrame frame = new JFrame("Color List Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        listModel = new DefaultListModel<>();
        updateListModel();
        JList<String> colorList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(colorList);
        frame.add(scrollPane, BorderLayout.CENTER);

        JPanel panel = new JPanel();
        JButton addButton = new JButton("Add Color");
        JButton removeButton = new JButton("Remove Color");
        JButton displayButton = new JButton("Display List");
        JButton exitButton = new JButton("Exit");

        panel.add(addButton);
        panel.add(removeButton);
        panel.add(displayButton);
        panel.add(exitButton);
        frame.add(panel, BorderLayout.SOUTH);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String colorToAdd = JOptionPane.showInputDialog(frame, "Enter color to add:");
                if (colorToAdd != null && !colorToAdd.trim().isEmpty()) {
                    String trimmedColor = colorToAdd.trim().toLowerCase();
                    if (!items.contains(trimmedColor)) {
                        items.add(trimmedColor);
                        updateListModel();
                        JOptionPane.showMessageDialog(frame, "Added: " + trimmedColor + "\nUpdated Color List:\n" + getUpdatedColorList());
                    } else {
                        JOptionPane.showMessageDialog(frame, trimmedColor + " already exists in the list.");
                    }
                }
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String colorToRemove = JOptionPane.showInputDialog(frame, "Enter color to remove:");
                if (colorToRemove != null) {
                    String trimmedColor = colorToRemove.trim().toLowerCase();
                    if (items.remove(trimmedColor)) {
                        updateListModel();
                        JOptionPane.showMessageDialog(frame, "Removed: " + trimmedColor + "\nUpdated Color List:\n" + getUpdatedColorList());
                    } else {
                        JOptionPane.showMessageDialog(frame, trimmedColor + " not found in the list.");
                    }
                }
            }
        });

        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (items.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "The color list is currently empty.");
                } else {
                    JOptionPane.showMessageDialog(frame, "Current list of colors:\n" + getUpdatedColorList());
                }
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int confirm = JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?", "Exit", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });

        // Show all menu items on startup
        StringBuilder menuItems = new StringBuilder("Available Actions:\n");
        menuItems.append("1. Add Color\n");
        menuItems.append("2. Remove Color\n");
        menuItems.append("3. Display List\n");
        menuItems.append("4. Exit\n");
        JOptionPane.showMessageDialog(frame, menuItems.toString());

        frame.setVisible(true);
    }

    private void updateListModel() {
        listModel.clear();
        for (String color : items) {
            listModel.addElement(color);
        }
    }

    private String getUpdatedColorList() {
        if (items.isEmpty()) {
            return "No colors in the list.";
        }
        StringBuilder colorListStr = new StringBuilder();
        for (String color : items) {
            colorListStr.append(color).append("\n");
        }
        return colorListStr.toString();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ColorListGUI::new);
    }
}
