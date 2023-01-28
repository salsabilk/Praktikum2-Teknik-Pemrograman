/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bukatutupjalan;

import java.util.Scanner;

/**
 * DESKRIPSI PROGRAM
Rules : 
Setiap empat mobil yang lewat digabung angkanya. 
Jika jumlah gabungan angka dari empat mobil itu dikurangi 999999 dibagi 5 adalah 0 maka 4 mobi tersebut harus berhenti. 

Input Format 
Satu baris berupa plat number untuk 4 mobil. 

Output Format 
Berupa tulisan "Jalan" atau "Berhenti". 
*/

/**
 * @author Salsabil
 * @version 1.0
 * @since 2023-01-28
 */
public class BukaTutupJalan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Deklarasi Variabel
        String plat1, plat2, plat3, plat4, semua_plat;
        long hitung;
        
        // Membuat Scanner Baru
        Scanner keyboard = new Scanner(System.in);
        
        plat1 = keyboard.next();
        plat2 = keyboard.next();
        plat3 = keyboard.next();
        plat4 = keyboard.next();
        
        // Perhitungan untuk menentukan status keadaan mobil
        semua_plat = plat1 + plat2 + plat3 + plat4;
        hitung = Long.parseLong(semua_plat)-999999;
        hitung = hitung % 5;
        
        if(hitung == 0){
            System.out.println("jalan");
        }else{
            System.out.println("berhenti");
        }
    }
   
}
