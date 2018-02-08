/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola.mundo.en.java;

import java.util.Scanner;



/**
 *
 * @author Estudiantes
 */
public class HolaMundoEnJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hola,¿como te llamas?");
            String n;
            n = sc.next();
        System.out.println("hola " + n);
        
    }
    
}
