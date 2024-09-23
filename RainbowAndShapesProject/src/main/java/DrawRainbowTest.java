import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DrawRainbowTest {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(
                "Enter 1 for downside rainbow\nEnter 2 for upside rainbow\nEnter 3 for left rainbow\nEnter 4 for right rainbow"
        );
        int choice = Integer.parseInt(input);

        DrawRainbow panel = new DrawRainbow(choice);
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(400, 250);
        application.setVisible(true);
    }
}
