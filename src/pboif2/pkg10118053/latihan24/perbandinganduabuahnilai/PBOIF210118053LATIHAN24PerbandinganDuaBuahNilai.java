/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118053.latihan24.perbandinganduabuahnilai;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class PBOIF210118053LATIHAN24PerbandinganDuaBuahNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("=====Program Perbandingan Nilai"); 
        Scanner input = new Scanner(System.in);
        
        for(String b = "ya"; b.equals("ya")||b.equals("Ya");){
        
        System.out.print("Masukkan Nilai Pertama : ");
        int nilai1 = input.nextInt();
        
        System.out.print("Masukkan Nilai Kedua : ");
        int nilai2 = input.nextInt();
        
        if(nilai1>nilai2){
        System.out.println("Hasil :" + nilai1 + " Lebih besar dari " + nilai2);      
        }else {
        System.out.println("Hasil :" + nilai2 + " Lebih besar dari " + nilai1);
        System.out.println("");
              }
            System.out.print("Ulangi Aktifitas ? (Ya/Tidak) : ");
            b=input.next();
                    
    }
    
}
