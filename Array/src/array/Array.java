/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;

/**
 * @author Salsabil
 * @version 1.0
 * @since 2023-01-28
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // One Dimensional Arrays
        int[] firstArray = {2, 5, 3};
        int[] secondArray = {9, 5, 3};
        int[] thirdArray = {2, 4, 9};
        int[] fourthArray = {10, 11, 12};
        int[] fifthArray = {13, 14, 15};
        int[] sixthArray = {16, 17, 18};
        int[] seventhArray = {19, 20, 21};
        int[] eighthArray = {22, 23, 24};
        int[] ninthArray = {25, 26, 27};
        
        // Two Dimensional Arrays
        int[][] twoDimensionalArray1 = {firstArray, secondArray, thirdArray};
        int[][] twoDimensionalArray2 = {fourthArray, fifthArray, sixthArray};
        int[][] twoDimensionalArray3 = {seventhArray, eighthArray, ninthArray};
        
        // Three Dimensional Arrays
        int[][][] threeDimensionalArray = {twoDimensionalArray1, twoDimensionalArray2, twoDimensionalArray3};
        
        // Perulangan Untuk Menampilkan Array 
        for(int i = 0; i < threeDimensionalArray.length; i++)
        {
            System.out.print("{");
            for(int j = 0; j < threeDimensionalArray[i].length; j++)
            {
                System.out.print("{");
                for(int k = 0; k < threeDimensionalArray[i][j].length; k++){
                    System.out.print(threeDimensionalArray[i][j][k] +" ");
                }
                System.out.print("} ");
            }
            System.out.print("}");
            System.out.println();
        }
    }
    
}
