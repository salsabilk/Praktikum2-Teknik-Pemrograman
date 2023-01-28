/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task1;

import java.util.Scanner;

/** 
 * <h1> Input & Output</h1>
 * @author Salsabil
 * @version 1.0
 * @since 2023-01-24
 */
public class Task1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Deklarasi Variabel
        int panjang;
        String kalimat;
        
        // Membuat Scanner Baru
        Scanner keyboard = new Scanner(System.in);
        
        //Memasukkan scanner ex kedalam string a
        kalimat = keyboard.nextLine();
        
        // Membuat array of string
        /* Split digunakan untuk mengambil suatu nilai yang terdapat dalam variabel String,
        dengan menggunakan regex tambahkan expresi reguler atau simbol simbol seperti pada kasus
        kemudian akan mengembalikan nilainya dengan nilai char array.*/
        String[] stringArray = kalimat.split("[@ ? ! _ , . ']+");
        
        panjang = stringArray.length;
        
        // Mencetak Jumlah Kata
        System.out.println(panjang);
        
        for(int i = 0; i < panjang; i++){
            System.out.println(stringArray[i]);
        }
    } 
}
