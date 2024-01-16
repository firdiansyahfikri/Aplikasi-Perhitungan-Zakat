/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author acer
 */
public class zakatMall extends zakat {
    private int Mall;
    
    public void setMall (int nilai) {
        zakatMall = nilai;
    }
    
    private int getMall() {
        return zakatMall;
    }
    
    public void calculate () {
        double hitung = 2.5 / 100;
        Mall = getMall();
        
        hitung = Mall * hitung;
        
        System.out.println("Jumlah zakat Mall yang harus dikeluarkan ialah : Rp" +hitung);
    }
    
}
