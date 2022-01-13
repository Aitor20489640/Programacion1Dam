/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4c_aitor;

import java.util.*;

/**
 *
 * @author Aitor
 * Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados “Alumno 1”, “Alumno 2”, etc.) y 5 asignaturas.
 * El usuario introducirá las notas por teclado y luego el programa mostrará la nota mínima, máxima y media de cada alumno.
 */
public class Ej4c_Aitor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[4][5];
        int min[] = new int[4];
        int max[] = new int[4];
        int media[] = {0,0,0,0};
        int i = 0, j = 0, c = 1;
        
        
        System.out.println("Bienvenido a un programa para almacenar las notas de 4 alumnos y 5 asignaturas. Una vez introducido las notas el programa mostrará la nota mínima, máxima y media de cada alumno.");
        
        for(i = 0; i < arr.length; i++){
            System.out.println("Introduzca las notas del alumno "+c+":");
            c++;
            for(j = 0; j < arr[i].length; j++){
                System.out.print("Introduzca una nota: ");
                arr[i][j] = sc.nextInt();
            }
        }
        
        min[0] = arr[0][0];
        min[1] = arr[1][0];
        min[2] = arr[2][0];
        min[3] = arr[3][0];
        max[0] = arr[0][0];
        max[1] = arr[1][0];
        max[2] = arr[2][0];
        max[3] = arr[3][0];
        
        for(i = 0; i < arr.length; i++){
            for(j = 0; j < arr[i].length; j++){
                if (arr[i][j] < min[i]){
                    min[i] = arr[i][j];
                }
                if (arr[i][j] > max[i]){
                    max[i] = arr[i][j];
                }
                media[i] = media[i] + arr[i][j];
            }
        }
        
        for(i = 0; i < media.length; i++){
            media[i] = media[i] / arr[0].length;
        }
        
        c = 1;
        System.out.println("--------------------");
        for(i = 0; i < 4; i++){
            System.out.println("estudiante "+c);
            System.out.println("minima: "+min[i]);
            System.out.println("maxima: "+max[i]);
            System.out.println("media: "+media[i]);
            System.out.println("--------------------");
            c++;
            
        }
    }
    
}