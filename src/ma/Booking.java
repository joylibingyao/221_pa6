/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma;

public class Booking {
    private Magician mag;
    private Holiday holi;
    private String cus;

    public Booking(Magician mag, Holiday holi, String cus) {
        this.mag = mag;
        this.holi = holi;
        this.cus = cus;
    }

    public Magician getMag() {
        return mag;
    }

    public void setMag(Magician mag) {
        this.mag = mag;
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
