package simobjects;

import java.awt.*;
import javax.swing.*;

public class Node extends JComponent {
    
    // Properties
    private final Color RED = Color.RED;
    private final int RADIUS = 5;
    private int x;
    private int y;

    // Constructors
    public Node( int x, int y) {
        this.x = x;
        this.y = y;

        repaint();
    }

    // Methods
    @Override
    public void paintComponent( Graphics g) {
        super.paintComponent(g);

        Graphics2D graphics2D = (Graphics2D) g;
        graphics2D.setRenderingHint( RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        graphics2D.setColor(RED);
        graphics2D.fillOval(x, y, 2 * RADIUS, 2 * RADIUS);
    }

    /**
     * Getter method for the x coordinate
     * @return the x coordinate
    */
    public int getX() {
        return x;
    }
    
    /**
     * Getter method for the y coordinate
     * @return the y coordinate
    */
    public int getY() {
        return y;
    }
}
