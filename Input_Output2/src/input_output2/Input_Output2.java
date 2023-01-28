/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package input_output2;

import java.util.Scanner; //Library Agar Dapat Menggunakan Scanner dan Melakukan Inputan dari Keyboard

/**
 * Deskripsi Program
 * INPUT PROGRAM
 * Setiap baris input akan berisi String diikuti oleh bilangan bulat.
 * Setiap String akan memiliki maksimal 10 karakter alfabet, 
 * dan setiap bilangan bulat akan berada di rentang 0 hingga 999.
 * 
 * OUTPUT PROGRAM
 * Di setiap baris output harus ada dua kolom :
 * Kolom pertama berisi String dan dibiarkan dibenarkan tepat 15 karakter.
 * Kolom kedua berisi bilangan bulat, dinyatakan tepat dalam 3 digit.
 * Jika input asli memiliki kurang dari tiga digit, Anda harus mengisi digit terdepan output dengan nol.
 */

/**
 * <h1>Input & Output (2)</h1>
 * @author Salsabil
 * @version 1.0
 * @since 2023-01-28
 */
public class Input_Output2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Deklarasi Variabel
        int angka;
        String kata;
        
        //Membuat array of string dan array of integer
        String[] arrayKata = new String[15];
        int[] arrayInt = new int[3];
        
        //Membuat Scanner Baru
        Scanner scan = new Scanner(System.in);
        
        //Memasukkan nilai ke array dengan proses perulangan
        for(int i = 0; i < 3; i++){
            kata = scan.next();
            arrayKata[i] = kata;
            angka = scan.nextInt();
            arrayInt[i] = angka;
        }
        
        //Menampilkan Output
        System.out.println("=======================");
        for(int i = 0; i < 3; i++){
            System.out.printf("%-15s%03d%n", arrayKata[i], arrayInt[i]);
        }
        /*
            %-15s artinya hanya dapat menampilkan 15 karakter (huruf) 
            %03d artinya menampilkan 3 buah bilangan integer diawali dengan nilai 0 jika kurang dari 3 bilangan
        */
        System.out.println("=======================");
    }
    
}
