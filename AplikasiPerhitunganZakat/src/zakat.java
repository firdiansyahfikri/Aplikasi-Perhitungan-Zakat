/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
/**
 *
 * @author acer
 */
public class zakat {
    public int zakatMall;
    public int zakatPertanian;
    public int zakatPenghasilan;
    
    public void calculate() {
        
    }
    
    public static void main(String[] args) {
        String inputHarta = JOptionPane.showInputDialog("Masukan nilai harta benda anda yang tersimpan : ");
        int mall = Integer.parseInt(inputHarta);
        
        String inputPenghasilan = JOptionPane.showInputDialog("Masukan nilai total penghasilan anda  : ");
        int penghasilan = Integer.parseInt(inputPenghasilan);
        
        String inputPertanian = JOptionPane.showInputDialog("Masukan nilai total penghasilan anda  : ");
        int pertanian = Integer.parseInt(inputPertanian);
        
        
        zakatMall Mall = new zakatMall();
        Mall.setMall(mall);
        Mall.calculate();
        
        zakatPenghasilan Penghasilan = new zakatPenghasilan();
        Penghasilan.setPenghasilan(penghasilan);
        Penghasilan.calculate();
        
        zakatPertanian Pertanian = new zakatPertanian();
        Pertanian.setPertanian(pertanian);
        Pertanian.calculate();
        
        
        
    }
}
