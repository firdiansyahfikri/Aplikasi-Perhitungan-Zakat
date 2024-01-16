/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author acer
 */
public class zakatPenghasilan extends zakat {
    private int Penghasilan;
    
    public void setPenghasilan(int nilai) {
        zakatPenghasilan = nilai;
    }
    
    private int getPenghasilan() {
        return zakatPenghasilan;
    }
    
    public void calculate() {
        double hitung = 2.5 / 100;
        Penghasilan = getPenghasilan();
        
        hitung = Penghasilan * hitung;
        
        System.out.println("Jumlah zakat Penghasilan yang harus dikeluarkan adalah senilai : Rp"+hitung);
    }
}
