/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gajiagent;

import java.util.Scanner; //Library Agar Dapat Menggunakan Scanner dan Melakukan Inputan dari Keyboard

/**
 * DESKRIPSI PROGRAM
 * Agent menerima gaji pokok sebersar Rp. 500.000,00.
 * Agent mendapat bonus 25% jika total item yang dijual minimal 40 item.
 * Agent mendapat bonus 35% jika total item yang dijual diatas 80 item. 
 * Jika agent menjual dibawah 15 mendapat denda pemotongan gaji 15% dari total minus penjualan ke 15 item. 
 * Agent hanya meerima bonus 10% setiap itemnya. 
 * Harga setiap item adalah Rp. 50.000,00.
 * 
 * INPUT PROGRAM
 * Satu baris berupa jumlah penjualan bulan ini 
 * 
 * Format Output 
 * Satu baris berisi sebuah bilangan gajih yang diterima 
 */

/**
 * @author Salsabil
 * @version 1.0
 * @since 2023-01-28
 */
public class GajiAgent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Deklarasi Variabel
        int gaji_pokok = 500000;
        int harga_item = 50000;
        int jumlah_item, total_penjualan, bonus, total_gaji = 0, denda;
        
        // Membuat Scanner Baru
        Scanner keyboard = new Scanner(System.in);
        jumlah_item = keyboard.nextInt();
        total_penjualan = jumlah_item * harga_item;                 // Menghitung jumlah item yang dijual
        bonus = total_penjualan * 10 / 100;                         // Menghitung bonus per item
        denda = ((15 * harga_item) - total_penjualan) * 15/100;     // Menghitung denda jika penjualan < 15 item
        
        // Kondisi untuk mengetahui total gaji berdasarkan jumlah item yang dijual
        if(jumlah_item < 15){
            total_gaji = gaji_pokok - denda;
        }
        if(jumlah_item >= 40){
            total_gaji = gaji_pokok + (total_penjualan * 25 / 100);
        }
        if(jumlah_item >= 80){
            total_gaji = gaji_pokok + (total_penjualan * 35 / 100);
        }
        if(jumlah_item >= 15 && jumlah_item < 40){
            total_gaji = gaji_pokok + bonus;
        }
        System.out.println(total_gaji); 
    }
    
}
