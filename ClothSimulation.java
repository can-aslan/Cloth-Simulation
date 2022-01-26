import java.awt.*;
import javax.swing.*;

import simobjects.SimulationSettings;

public class ClothSimulation
{
    static final String PROG_NAME = "Cloth Simulation";
    static final String VERSION = "0.1";
    static JFrame frame = new JFrame();
    static SimulationPanel simPanel = new SimulationPanel();
    public static void main(String[] args)
    {
        // Program Code
        simPanel.setBounds( 0, 0, SimulationSettings.WIDTH, SimulationSettings.HEIGHT);
        frame.add( simPanel);
        
        frame.setTitle( PROG_NAME + " " + VERSION);
        frame.setPreferredSize( new Dimension( SimulationSettings.WIDTH, SimulationSettings.HEIGHT));
        frame.setResizable( false);
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        
        frame.pack();
        frame.setVisible(true);
    }
}