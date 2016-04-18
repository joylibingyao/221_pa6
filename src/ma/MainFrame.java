/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author bingyaoli
 */
public class MainFrame extends JFrame{
//    private DataBase db = new DataBase();
    private UserPanel userPan = new UserPanel();
    private StatusPanel statPan = new StatusPanel();
    private OptionPanel optionPan = new OptionPanel();
    public MainFrame(){
                BorderLayout mBorderLayout = new BorderLayout();
        setLayout(mBorderLayout);
        
        add(userPan, BorderLayout.NORTH);
        add(optionPan, BorderLayout.CENTER);
        add(statPan,BorderLayout.SOUTH);
        
    }
}
