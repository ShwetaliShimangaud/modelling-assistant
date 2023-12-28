package org.example;

import javax.swing.*;
import java.awt.*;
import com.umlet.control.Umlet;

public class UMLetIntegration {

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Java Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Create a JPanel to hold UMLet GUI
        JPanel umletPanel = new JPanel();
        umletPanel.setLayout(new BorderLayout());

        // Initialize Umlet
        Umlet umlet = new Umlet();

        // Add the UMLet component to the panel
        umletPanel.add(umlet);

        // Add the panel to the frame
        frame.getContentPane().add(umletPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
