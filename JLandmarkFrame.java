/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W4HW;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Lisa
 */
public class JLandmarkFrame extends JFrame {

    private JButton north = new JButton("Mount Rushmore");
    private JButton south = new JButton("The Alamo");
    private JButton east = new JButton("Statue of Liberty");
    private JButton west = new JButton("Golden Gate Bridge");
    private JButton center = new JButton("Chimney Rock");

    public JLandmarkFrame() {

        setSize(400, 150);
        setTitle("Landmarks");

        setLayout(new BorderLayout());
        add(north, BorderLayout.NORTH);
        add(south, BorderLayout.SOUTH);
        add(east, BorderLayout.EAST);
        add(west, BorderLayout.WEST);
        add(center, BorderLayout.CENTER);
    }
    
    public static void main(String[] args) {
        JLandmarkFrame frame = new JLandmarkFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
