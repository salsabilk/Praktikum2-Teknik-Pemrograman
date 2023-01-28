/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package berhitung;

import java.util.Scanner; //Library Agar Dapat Menggunakan Scanner dan Melakukan Inputan dari Keyboard

/**
 * DESKRIPSI PROGRAM
 * INPUT PROGRAM
 * Satu baris berisi A, operator, dan B, masing-masing dipisahkan sebuah spasi,
 * yang menyatakan terdapat operasi "A operator B"
 * 
 * OUTPUT PROGRAM
 * Satu baris berisi sebuah bilangan bulat, hasil "A operator B"
 */

/**
 * @author Salsabil
 * @version 1.0
 * @since 2023-01-28
 */
public class Berhitung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Deklarasi Variabel
        int A, B, hasilOperasi;
        char operator;
        
        // Membuat Scanner Baru
        Scanner keyboard = new Scanner(System.in);
        
        // Memasukkan Scanner ke Variabel
        A = keyboard.nextInt();
        operator = keyboard.next().charAt(0);   // Membaca data bertipe char
        B = keyboard.nextInt();
        
        // Kondisi cek operator yang diinputkan
        if((A >= 1 && A <= 1000) && (B >= 1 && B <= 1000)) {
            switch (operator) {
                case '+' -> {
                    hasilOperasi = A + B;
                    System.out.println(hasilOperasi);
                }
                case '-' -> {
                    hasilOperasi = A - B;
                    System.out.println(hasilOperasi);
                }
                case '*' -> {
                    hasilOperasi = A * B;
                    System.out.println(hasilOperasi);
                }
                case '/' -> {
                    hasilOperasi = A / B;
                    System.out.println(hasilOperasi);
                }
                case '%' -> {
                    hasilOperasi = A % B;
                    System.out.println(hasilOperasi);
                }
                default -> {
                }
            }
        }
    }
}
    
    
