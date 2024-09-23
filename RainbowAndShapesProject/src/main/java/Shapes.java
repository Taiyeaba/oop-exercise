import java.awt.Graphics;
import javax.swing.JPanel;

public class Shapes extends JPanel {
    private int choice;

    public Shapes(int userChoice) {
        choice = userChoice;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < 10; i++) {
            switch (choice) {
                case 1:
                    g.drawRect(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
                    break;
                case 2:
                    g.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
                    break;
                case 3: // Top-right corner
                    g.drawRect(getWidth() - (60 + i * 10), 10 + i * 10, 50 + i * 10, 50 + i * 10);
                    break;
                case 4: // Bottom-left corner
                    g.drawRect(10 + i * 10, getHeight() - (60 + i * 10), 50 + i * 10, 50 + i * 10);
                    break;
                case 5: // Bottom-right corner
                    g.drawRect(getWidth() - (60 + i * 10), getHeight() - (60 + i * 10), 50 + i * 10, 50 + i * 10);
                    break;
                case 6: // Top-right corner oval
                    g.drawOval(getWidth() - (60 + i * 10), 10 + i * 10, 50 + i * 10, 50 + i * 10);
                    break;
                case 7: // Bottom-left corner oval
                    g.drawOval(10 + i * 10, getHeight() - (60 + i * 10), 50 + i * 10, 50 + i * 10);
                    break;
                case 8: // Bottom-right corner oval
                    g.drawOval(getWidth() - (60 + i * 10), getHeight() - (60 + i * 10), 50 + i * 10, 50 + i * 10);
                    break;
            }
        }
    }
}