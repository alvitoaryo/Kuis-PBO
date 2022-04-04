/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Criteria;
import Jobaplication.job;
/**
 *
 * @author Aluito Aryo Prabowo
 */
public class DesignerCriteria extends input implements job{

    public DesignerCriteria(String nama, double nilai1, double nilai2, double nilai3) {
        super(nama, nilai1, nilai2, nilai3);
    }
    
    public void inputNilai1(double nilai1) {
        this.nilai1 = nilai1;
    }

    public void inputNilai2(double nilai2) {
        this.nilai2 = nilai2;
    }

    public void inputNilai3(double nilai3) {
        this.nilai3 = nilai3;
    }
     
 
    public double hitungNilaiTotal() {
       return (0.3 * super.nilai1) + (0.45 * super.nilai2) + (0.25 * super.nilai3);
    }

   
    public String keterangan() {
        if(this.hitungNilaiTotal() >= 85) 
            return "LULUS\nSelamat kepada " + this.nama + " telah DITERIMA sebagai Designer\n";
        else 
            return "GAGAL\nMohon maaf kepada  " + this.nama + " telah DITOLAK sebagai Designer\n";
    }
}