/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plaintextaesencrption;
import plaintexteasencrption.AES;
/**
 *
 * @author retsu
 */
public class Encript { public static void main(String[] args) {
 
 
 try{
 
String textClar = "Prova di criptaggio con AES";
    //AES
    String j = "1a25s8fe5dsg65ad";
    System.out.println("Text in chiaro: "+textClar);
    byte[] encr = AES.encrypt(textClar.getBytes(), j.getBytes());
    System.out.println("Testo criptato con AES: "+new String(encr));

    byte[] decr = AES.decrypt(encr, j.getBytes());
     System.out.println("Testo decriptato con AES: "+new String(decr));
     System.out.println("------------------");



     }catch(Exception e){
     e.printStackTrace();
     }
    }
    
}
