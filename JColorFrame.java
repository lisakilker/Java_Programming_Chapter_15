/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W4HW;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Lisa
 */
public class JColorFrame extends JFrame implements ActionListener {

    private int clicks = 0;

    private JButton colorClick = new JButton("Click Me!");
    private JPanel northPanel = new JPanel();
    private JPanel eastPanel = new JPanel();
    private JPanel southPanel = new JPanel();
    private JPanel westPanel = new JPanel();
    private JLabel northLabel = new JLabel();
    private JLabel eastLabel = new JLabel();
    private JLabel southLabel = new JLabel();
    private JLabel westLabel = new JLabel();

    public JColorFrame() {

        setSize(300, 300);
        setTitle("Colors");

        setLayout(new BorderLayout());

        add(colorClick, BorderLayout.CENTER);
        add(northPanel, BorderLayout.NORTH);
        add(eastPanel, BorderLayout.EAST);
        add(southPanel, BorderLayout.SOUTH);
        add(westPanel, BorderLayout.WEST);

        northPanel.add(northLabel);
        eastPanel.add(eastLabel);
        southPanel.add(southLabel);
        westPanel.add(westLabel);

        northPanel.setPreferredSize(new Dimension(100, 60));
        eastPanel.setPreferredSize(new Dimension(90, 100));
        southPanel.setPreferredSize(new Dimension(100, 60));
        westPanel.setPreferredSize(new Dimension(90, 100));

        colorClick.addActionListener(this);
    }

    public static void main(String[] args) {
        JColorFrame frame = new JColorFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent a) {
        Object source = a.getSource();

        if (source == colorClick) {
            switch (clicks % 8) {
                case 0:
                    northPanel.setBackground(Color.RED);
                    break;
                case 1:
                    eastPanel.setBackground(Color.ORANGE);
                    break;
                case 2:
                    southPanel.setBackground(Color.YELLOW);
                    break;
                case 3:
                    westPanel.setBackground(Color.GREEN);
                    break;
                case 4:
                    northPanel.setBackground(Color.BLUE);
                    break;
                case 5:
                    eastPanel.setBackground(Color.CYAN);
                    break;
                case 6:
                    southPanel.setBackground(Color.MAGENTA);
                    break;
                case 7:
                    westPanel.setBackground(Color.PINK);
                    break;
                default:
                    break;
            }
            clicks++;
        }
    }
}
