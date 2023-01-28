/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bignumber;

import java.util.Scanner;       //Agar Dapat Menggunakan Scanner 
import java.math.BigInteger;

/**
 * @author Salsabil
 * @version 1.0
 * @since 2023-01-28
 */
public class BigNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Deklarasi Variabel
        BigInteger input1, input2, hasil_tambah, hasil_kali;
        
        // Membuat Scanner Baru
        Scanner keyboard = new Scanner(System.in);
        
        // Input Angka Dengan Tipe Data Big Integer
        input1 = keyboard.nextBigInteger();
        input2 = keyboard.nextBigInteger();
        
        // Operasi Pertambahan dan Perkalian Angka Bertipe Big Integer
        hasil_tambah = input1.add(input2);
        hasil_kali = input1.multiply(input2);
        
        // Menampilkan Hasil Tambah dan Hasil Kali
        System.out.println(hasil_tambah);
        System.out.println(hasil_kali);
        
    }
    
}
