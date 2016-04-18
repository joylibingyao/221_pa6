/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

/**
 *
 * @author bingyaoli
 */
public class OptionPanel extends JPanel{
    private JButton holiBut= new JButton("Holiday"); 
    private JButton magiBut= new JButton("Magician"); 
    private JButton waitListBut= new JButton("Waiting List"); 
    public OptionPanel(){
        super(new GridLayout(1, 1));
        JTabbedPane tabbedPane = new JTabbedPane();
        
        JComponent panel1 = makePanel("Panel #1");
        tabbedPane.addTab("Holiday", panel1);
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
        
        JComponent panel2 = makePanel("Panel #2");
        tabbedPane.addTab("Magician", panel2);
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_2);
        
        JComponent panel3 = makePanel("Panel #3");
        tabbedPane.addTab("Waiting List", panel3);
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_3);
        
//         FlowLayout mFlowLayout = new FlowLayout();
//        setLayout(mFlowLayout);
//        mFlowLayout.setAlignment(FlowLayout.LEFT);

        add(tabbedPane);
        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
    }
protected JComponent makePanel(String title) {
        JPanel panel = new JPanel(false);
        JLabel filler = new JLabel(title);
        JLabel typeHere = new JLabel("Select "+title);
        
        
        
        
        filler.setHorizontalAlignment(JLabel.CENTER);
//        panel.setLayout(new GridLayout(1, 1));
        panel.add(typeHere);
//        panel.add(searchInput);
        
        return panel;
    }
}
