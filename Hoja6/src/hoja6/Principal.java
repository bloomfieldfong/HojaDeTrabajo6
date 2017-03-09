/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja6;

import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author chris
 */
public class Principal {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        Set conjuntoJava;
        Set conjuntoAndroid;
        Set conjuntoIOS;
        
        boolean loop1 = true;
        while(loop1){
            System.out.println("Que implementacion desea utilizar?\n 1. HashSet\n"
                    + " 2. TreeSet\n 3.LinkedHashSet");
            try{
                int seleccion = scanner.nextInt();
                scanner.nextLine();
                if(seleccion>0 && seleccion<4){
                    loop1 = false;
                }else{
                    System.out.println("Numero fuera de rango");
                }
            }catch(Exception e){
                System.out.println("Solo ingrese numeros");
                scanner.nextLine();
            }
        }
    }
}
