import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawRainbow extends JPanel {

    private final static Color VIOLET = new Color(128, 0, 128);
    private final static Color INDIGO = new Color(75, 0, 130);

    private Color[] colors = {Color.WHITE, Color.WHITE, VIOLET, INDIGO, Color.BLUE,
        Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED};

    private int orientation;

    public DrawRainbow(int orientation) {
        this.orientation = orientation;
        setBackground(Color.WHITE);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int radius = 20;

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        switch (orientation) {
            case 1: // Downside rainbow
                centerY = getHeight() - 10;
                for (int counter = colors.length; counter > 0; counter--) {
                    g.setColor(colors[counter - 1]);
                    g.fillArc(centerX - counter * radius,
                            centerY - counter * radius,
                            counter * radius * 2, counter * radius * 2, 0, 180);
                }
                break;
            case 2: // Upside rainbow
                for (int counter = colors.length; counter > 0; counter--) {
                    g.setColor(colors[counter - 1]);
                    g.fillArc(centerX - counter * radius,
                            centerY - counter * radius,
                            counter * radius * 2, counter * radius * 2, 180, 180);
                }
                break;
            case 3: // Left rainbow
                for (int counter = colors.length; counter > 0; counter--) {
                    g.setColor(colors[counter - 1]);
                    g.fillArc(centerX - counter * radius,
                            centerY - counter * radius,
                            counter * radius * 2, counter * radius * 2, 90, 180);
                }
                break;
            case 4: // Right rainbow
                for (int counter = colors.length; counter > 0; counter--) {
                    g.setColor(colors[counter - 1]);
                    g.fillArc(centerX - counter * radius,
                            centerY - counter * radius,
                            counter * radius * 2, counter * radius * 2, -90, 180);
                }
                break;
        }
    }
}