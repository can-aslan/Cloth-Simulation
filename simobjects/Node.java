package simobjects;

import java.awt.*;
import javax.swing.*;

public class Node extends JComponent {
    
    // Properties
    private static final int RADIUS = 20;
    private static final int BORDER_SIZE = (RADIUS / 10);
    private int x;
    private int y;
    private double speed;
    private boolean canMove;

    // Constructors
    public Node( int x, int y) {
        canMove = true; // TODO Change according to ropes/strings later
        speed = 0;
        this.x = x;
        this.y = y;

        repaint();
    }

    // Methods
    @Override
    public void paintComponent( Graphics g) {
        super.paintComponent(g);

        // Move Node according to gravity
        if ( canMove /*&& speed < 1000 * SimulationSettings.GRAVITY*/) {
            speed = speed + SimulationSettings.GRAVITY;
        }
        y = y + (int) speed;

        Graphics2D graphics2D = (Graphics2D) g;
        graphics2D.setRenderingHint( RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Border
        graphics2D.setColor(Color.BLACK);
        graphics2D.fillOval((x - BORDER_SIZE), (y - BORDER_SIZE), (2 * (RADIUS + BORDER_SIZE)), (2 * (RADIUS + BORDER_SIZE)) );

        // Node
        graphics2D.setColor(Color.RED);
        graphics2D.fillOval(x, y, (2 * RADIUS), (2 * RADIUS));
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
