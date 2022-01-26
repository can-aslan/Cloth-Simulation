import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SimulationPanel extends JPanel implements MouseInputListener {

    // Properties
    final Color LIGHT_BLUE = new Color( 178, 215, 255);

    // Constructors
    public SimulationPanel() {
        setBackground( LIGHT_BLUE);
        setLayout( null);
        setBorder( BorderFactory.createEmptyBorder( 10, 10, 10, 10));

        repaint();
    }
    
    // Methods
    @Override
    public void mouseClicked( MouseEvent e) {}

    @Override
    public void mousePressed( MouseEvent e) {}

    @Override
    public void mouseReleased( MouseEvent e) {}

    @Override
    public void mouseEntered( MouseEvent e) {}

    @Override
    public void mouseExited( MouseEvent e) {}

    @Override
    public void mouseDragged( MouseEvent e) {}

    @Override
    public void mouseMoved( MouseEvent e) {}
    
}
