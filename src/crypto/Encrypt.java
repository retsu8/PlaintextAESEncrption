/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto;
import crypto.AES;
import java.io.UTFDataFormatException;
import java.nio.charset.Charset;

/**
 *
 * @author retsu
 */
public class Encrypt { public static void main(String[] args) {
 
 
 try{
String textClear = "a b c d e f g h i j k l m n o p";
    //AES
        String j = "1a25s8fe5dsg65ad";
        System.out.println("Cleartext: "+textClear);
        byte[] encr = AES.encrypt(textClear.getBytes(), j.getBytes());
        System.out.println("Text in AES: "+new String(encr));
    
     }catch(Exception e){
     e.printStackTrace();
     }
    }
}

