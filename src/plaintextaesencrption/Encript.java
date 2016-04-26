/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plaintextaesencrption;

/**
 *
 * @author retsu
 */
public class Encript {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String textline = "a b c d e f g h i j k l m n o p";
        String[] plaintext = textline.split(" ");
        String[][] AESmatrix = buildMatrix(plaintext);
        encrypt(plaintext);
    }
    private static void encrypt(String[] plaintext) {
        
    }

    private static String[][] buildMatrix(String[] plaintext) {
        String[][] AESmatrix = new String[4][4];
        int i = 0;
        int j = 0;
        for (String s : plaintext){
            s = s.trim();
            if(i > 3){
                j++;
                i = 0;}
            AESmatrix[i][j] = s;
            i++;
        }
        return AESmatrix;
    }
    
}
