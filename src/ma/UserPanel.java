/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author bingyaoli
 */
public class UserPanel extends JPanel implements ActionListener{
    private JLabel nameLab = new JLabel("Name: ");
    private JTextField cusNameTFie = new JTextField(30);
    private ArrayList<Magician> magicianArr = new ArrayList<Magician>();
    private JComboBox magicianCom;
    private ArrayList<Holiday> holidayArr = new ArrayList<Holiday>();
    private JComboBox holidayCom;
    private JButton bookButton = new JButton("Book Now");
    
    public UserPanel(){
        
        magicianArr.add(new Magician("one"));
        magicianArr.add(new Magician("two"));
        magicianArr.add(new Magician("three"));
        magicianArr.add(new Magician("four"));
        ArrayList<String> tempArr = new ArrayList<String>();
        for (Magician mag :magicianArr){
            tempArr.add(mag.getName());
        }
        String[] newArr = tempArr.toArray(new String[0]);
        this.magicianCom =new JComboBox(newArr);
        
        holidayArr.add(new Holiday("New Year"));
        holidayArr.add(new Holiday("Thanksgiving"));
        holidayArr.add(new Holiday("Labor DAy"));
        holidayArr.add(new Holiday("Friday"));
        ArrayList<String> tempArray = new ArrayList<String>();
        for (Holiday holi :holidayArr){
            tempArray.add(holi.getName());
        }
        String[] newArray = tempArray.toArray(new String[0]);
        this.holidayCom =new JComboBox(newArray);
        
        FlowLayout mFlowLayout = new FlowLayout();
        setLayout(mFlowLayout);
        mFlowLayout.setAlignment(FlowLayout.CENTER);
        add(nameLab);
        add(cusNameTFie);
        add(magicianCom);
        add(holidayCom);
        add(bookButton);
        
        bookButton.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.print(cusNameTFie.getText()+magicianCom.getSelectedItem());
//        send to db
        DataBase db = new DataBase();
        try {
            db.insertMagician(cusNameTFie.getText());
        } catch (SQLException ex) {
            Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
