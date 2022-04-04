/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;
import Criteria.input;
import Criteria.DesignerCriteria;
import Criteria.ManagerCriteria;
import Criteria.ProgramingCriteria;
import java.util.Scanner;
/**
 *
 * @author Aluito Aryo Prabowo
 */
public class Main {
     public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
        System.out.println("Pelamaran Lowongan Pekerjaan");
        System.out.println(" 1. Programmer");
        System.out.println(" 2. Designer");
        System.out.println(" 3. Manager");
        System.out.print(" Pilih Jenis Pekerjaan : ");
        int pilih = input.nextInt();
        
        
        System.out.println("=== FORMULIR PELAMAR ===");
        Scanner data= new Scanner(System.in);
        System.out.print(" Input Nama : ");
        String nama = data.next();
        
        System.out.println("---Penilaian---");
        System.out.println("Keterangan: Nilai yang valid berada do antara 0-100");
        
        if (pilih == 1){
            //programingcriteriarammer
            System.out.print("Input Nilai Programming Knowledge : ");
            double nilai1= data.nextDouble();
            System.out.print("Input Nilai Clean Coding : ");
            double nilai2 = data.nextDouble();
            System.out.print("Input Nilai Debugging : ");
            double nilai3 = data.nextDouble();
            ProgramingCriteria programingcriteria = new ProgramingCriteria(nama,nilai1,nilai2,nilai3);
            do{
                System.out.println("=== MENU ===");
                System.out.println(" 1. Tampilkan Hasil");
                System.out.println(" 2. Ubah Nilai Pelamar");
                System.out.println(" 3. Exit");
                System.out.print(" Pilih : ");
                int pilihMenu = input.nextInt();
                if (pilihMenu == 1){
                    System.out.println("Nilai Akhir : " + programingcriteria.hitungNilaiTotal());
                    System.out.println("Keterangan : " + programingcriteria.keterangan());
                }
                else if (pilihMenu == 2){
                    System.out.print("Input Nilai Programming Knowledge : ");
                    programingcriteria.inputNilai1(input.nextDouble());
                    System.out.print("Input Nilai Clean Coding : ");
                    programingcriteria.inputNilai2(input.nextDouble());
                    System.out.print("Input Nilai Debugging : ");
                    programingcriteria.inputNilai3(input.nextDouble());
                    
                }
                else {
                    break;
                }
            }while(true);
        }
        else if (pilih == 2){
            System.out.print("Input Nilai Design Portofolio : ");
            double nilai1= data.nextDouble();
            System.out.print("Input Nilai Prototyping : ");
            double nilai2 = data.nextDouble();
            System.out.print("Input Nilai Creativity : ");
            double nilai3 = data.nextDouble();
            DesignerCriteria designercriteria = new DesignerCriteria(nama, nilai1, nilai2, nilai3);
            do{
                System.out.println("=== MENU ===");
                System.out.println(" 1. Tampilkan Hasil");
                System.out.println(" 2. Ubah Nilai Pelamar");
                System.out.println(" 3. Exit");
                System.out.print(" Pilih : ");
                int pilihMenu = input.nextInt();
                
                if(pilihMenu == 1){
                    System.out.println("Nilai Akhir : " + designercriteria.hitungNilaiTotal());
                    System.out.println("Keterangan : " + designercriteria.keterangan());
                }
                else if (pilihMenu == 2){
                    System.out.print("Input Nilai Design Portofolio : ");
                    designercriteria.inputNilai1(input.nextDouble());
                    System.out.print("Input Nilai Prototyping : ");
                    designercriteria.inputNilai2(input.nextDouble());
                    System.out.print("Input Nilai Creativity : ");
                    designercriteria.inputNilai3(input.nextDouble());
                }
                else {
                    break;
                }
            }while(true);
        }
        else if(pilih == 3){
            System.out.print("Input Nilai Innovation : ");
            double nilai1= data.nextDouble();
            System.out.print("Input Nilai Decision Making : ");
            double nilai2 = data.nextDouble();
            System.out.print("Input Nilai Communication: ");
            double nilai3 = data.nextDouble();
            ManagerCriteria managercriteria = new ManagerCriteria(nama, nilai1, nilai2, nilai3);
            do{
                System.out.println("=== MENU ===");
                System.out.println(" 1. Tampilkan Hasil");
                System.out.println(" 2. Ubah Nilai Pelamar");
                System.out.println(" 3. Exit");
                System.out.print(" Pilih : ");
                int pilihMenu = input.nextInt();
                
                if(pilihMenu == 1){
                    System.out.println("Nilai Akhir : " + managercriteria.hitungNilaiTotal());
                    System.out.println("Keterangan : " + managercriteria.keterangan());
                }
                else if (pilihMenu == 2){
                    System.out.print("Input Nilai Innovation : ");
                    managercriteria.inputNilai1(input.nextDouble());
                    System.out.print("Input Nilai Decision Making  : ");
                    managercriteria.inputNilai2(input.nextDouble());
                    System.out.print("Input Nilai Communication: ");
                    managercriteria.inputNilai3(input.nextDouble());
                }
                else {
                    break;
                }
            }while(true);
        }
        else{
            System.out.println("=== Input SALAH ===");
            System.out.println("(Mohon Input Ulang)");
        }
    }
    
}
