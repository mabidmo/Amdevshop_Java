/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_apk;

import com.formdev.flatlaf.intellijthemes.FlatGradiantoMidnightBlueIJTheme;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author MabidPC
 */
public class Main {
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        try {
            FlatGradiantoMidnightBlueIJTheme.setup();
        } catch (Exception e){
            e.printStackTrace();
        }
        
        new Login().setVisible(true);
        
    }
}
