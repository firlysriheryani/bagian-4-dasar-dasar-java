
import java.awt.*;
import javax.swing.*;

public class DrawShapes extends JPanel {

    Font font;
    Color redColor;
    Color blueColor;
    Color backgroundColor;

    public DrawShapes() {

        font = new Font("Arial", Font.ITALIC, 18);

        redColor = Color.BLACK;
        backgroundColor = Color.WHITE;
        blueColor = Color.GRAY;

        setBackground(backgroundColor);
    }

    @Override
    public void paintComponent(Graphics graph) {
        super.paintComponent(graph);

        graph.setFont(font);
        graph.drawString("Draw Shapes", 90, 20);

        graph.setColor(blueColor);
        graph.drawRect(120, 120, 120, 120);
        graph.fillRect(115, 115, 90, 90);

        graph.setColor(redColor);
        graph.fillArc(110, 110, 50, 50, 0, 360);

        graph.setColor(Color.WHITE);
        graph.drawRect(50, 50, 50, 50);
        graph.fillRect(50, 50, 60, 60);
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Draw Shapes");

        DrawShapes panel = new DrawShapes();

        frame.add(panel);
        frame.setSize(350, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
