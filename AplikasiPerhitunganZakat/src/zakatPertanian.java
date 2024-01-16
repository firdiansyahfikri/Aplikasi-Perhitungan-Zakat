/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author acer
 */
public class zakatPertanian extends zakat{
    private int Pertanian;
    
    public void setPertanian (int nilai) {
        zakatPertanian = nilai;
    }
    
    private int getPertanian() {
        return zakatPertanian;
    }
    
    public void calculate () {
        double hitung = 5;
        Pertanian = getPertanian();
        
        hitung = Pertanian * hitung;
        hitung = hitung /100;
        
        System.out.println("Jumlah zakat Pertanian yang harus dikeluarkan adalah : "+hitung+"kg");
    }
}
