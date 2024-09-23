import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TestShapes {
    public static void main(String[] args) {
        // Prompt user for input
        String input = JOptionPane.showInputDialog(
            "Enter a choice:\n" +
            "1: Rectangles\n" +
            "2: Ovals\n" +
            "3: Rectangles (Top-right corner)\n" +
            "4: Rectangles (Bottom-left corner)\n" +
            "5: Rectangles (Bottom-right corner)\n" +
            "6: Ovals (Top-right corner)\n" +
            "7: Ovals (Bottom-left corner)\n" +
            "8: Ovals (Bottom-right corner)"
        );

        int choice = Integer.parseInt(input);

        // Create the panel with the user's choice
        Shapes panel = new Shapes(choice);

        // Create a new frame to hold the panel
        JFrame application = new JFrame();

        // Set the frame to exit when it is closed
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add the panel to the frame
        application.add(panel);

        // Set the size of the frame
        application.setSize(600, 600);

        // Make the frame visible
        application.setVisible(true);
    }
}

