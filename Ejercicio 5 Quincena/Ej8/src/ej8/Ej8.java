/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej8;

import java.util.Scanner;

/**
 *
 * @author aitor
 */
public class Ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int num;
        int contpos = 0;
        int contneg = 0;
        System.out.println("Escribe un numero");
        num = entry.nextInt();
        while (num != 0) { 
            
            if (num > 0) {
                contpos++;
            } else {
                contneg++;
            }
            System.out.println("Escribe otro numero");
            num = entry.nextInt();

            
        }
        
        if (contneg > 0){
            System.out.println("Se han leido numeros");            
        }
        System.out.println("Se han leido "+contpos+" numeros positivos, "+contneg+" numeros negativos.");

    }

}
