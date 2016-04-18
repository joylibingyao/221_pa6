/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma;

import javax.swing.JFrame;

/**
 *
 * @author bingyaoli
 */
public class MA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainFrame mMainFrame = new MainFrame();
        mMainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
        mMainFrame.pack();
        mMainFrame.setVisible(true);
    }
    
}
