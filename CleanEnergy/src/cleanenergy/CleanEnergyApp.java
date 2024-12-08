/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cleanenergy;

import javax.swing.*;
import javax.swing.plaf.metal.*;

public class CleanEnergyApp {
    public static void main(String[] args) {
        try {
            // Set Metal Look and Feel globally
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            
            // Optional: Set the Ocean theme for Metal Look and Feel
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Launch the GUI
        SwingUtilities.invokeLater(() -> {
            CleanEnergyGUI myGUI = new CleanEnergyGUI();
            myGUI.setVisible(true);
        });
    }
}

