import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.event.*;

import simobjects.*;

public class SimulationPanel extends JPanel implements MouseInputListener, ActionListener {

    // Properties
    private final Color LIGHT_BLUE = new Color( 178, 215, 255);
    private ArrayList<Node> nodes;
    private int line;
    private Timer timer;

    // Constructors
    public SimulationPanel() {
        timer = new Timer( 5, this);
        
        line = 0;
        addMouseListener(this);

        setBackground( LIGHT_BLUE);
        setLayout( null);
        setBorder( BorderFactory.createEmptyBorder( 10, 10, 10, 10));

        nodes = new ArrayList<Node>();
        nodes.add( new Node( 100, 100));

        repaint();
    }
    
    // Methods
    @Override
    public void paintComponent( Graphics g) {
        super.paintComponent(g);

        for ( Node n : nodes ) {
            n.paintComponent(g); 
        }

        timer.start();
    }

    @Override
    public void mouseClicked( MouseEvent e) {
        repaint();
        System.out.println( line + ": Mouse clicked.");
        line++;
    }

    @Override
    public void mousePressed( MouseEvent e) {
        System.out.println( line + ": Mouse pressed.");
        line++;
    }

    @Override
    public void mouseReleased( MouseEvent e) {
        System.out.println( line + ": Mouse released.");
        line++;
    }

    @Override
    public void mouseEntered( MouseEvent e) {
        System.out.println( line + ": Mouse entered.");
        line++;
    }

    @Override
    public void mouseExited( MouseEvent e) {
        System.out.println( line + ": Mouse exited.");
        line++;
    }

    @Override
    public void mouseDragged( MouseEvent e) {
        System.out.println( line + ": Mouse dragged.");
        line++;
    }

    @Override
    public void mouseMoved( MouseEvent e) {
        System.out.println( line + ": Mouse moved.");
        line++;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
    
}
