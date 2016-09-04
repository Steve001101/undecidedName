/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bin;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 *
 * @author Steven Mattson
 */
public class main {

        private static void GUI() {
        
    
    //create JFrame
    
    JFrame baka = new JFrame ("Hello this is a test");
    baka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    JLabel emptyLabel = new JLabel("");
    emptyLabel.setPreferredSize(new Dimension(175, 100));
    baka.getContentPane().add(emptyLabel, BorderLayout.CENTER);
    
    //display
    baka.pack();
    baka.setVisible(true);
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    //schedule a job
    //creating and showing GUI
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
        public void run(){
            GUI();
        }
    });
    }
}