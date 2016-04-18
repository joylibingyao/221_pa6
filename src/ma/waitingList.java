/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma;

/**
 *
 * @author bingyaoli
 */
public class waitingList {
    private Holiday holi;
    private String cus;

    public waitingList(Holiday holi, String cus) {
        this.holi = holi;
        this.cus = cus;
    }

    public Holiday getHoli() {
        return holi;
    }

    public void setHoli(Holiday holi) {
        this.holi = holi;
    }

    public String getCus() {
        return cus;
    }

    public void setCus(String cus) {
        this.cus = cus;
    }
    
    
}
