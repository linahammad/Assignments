/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tspbyga;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Linah
 * 08/01/2013
 */
public class TSPbyGA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setTitle("Solve TSP problem by GENETIC ALGORITHIM");
        JOptionPane.showMessageDialog(null, "Education program to solve Traveling Salesman Problem(TSP)\nby Genetic Algorithim", "My program", JOptionPane.INFORMATION_MESSAGE);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
