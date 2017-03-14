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
        
        Set conjuntoJava = null;
        Set conjuntoAndroid = null;
        Set conjuntoIOS = null;
        
        Factory factory = new Factory();
        
        boolean loop = true;
        while(loop){
            System.out.println("Que implementacion desea utilizar?\n 1. HashSet\n"
                    + " 2. TreeSet\n 3.LinkedHashSet");
            try{
                int seleccion = scanner.nextInt();
                scanner.nextLine();
                if(seleccion>0 && seleccion<4){
                    loop = false;
                    switch(seleccion){
                        case 1:
                            conjuntoJava = factory.seleccionarSet(0);
                            conjuntoAndroid = factory.seleccionarSet(0);
                            conjuntoIOS = factory.seleccionarSet(0);
                            break;
                        case 2:
                            conjuntoJava = factory.seleccionarSet(1);
                            conjuntoAndroid = factory.seleccionarSet(1);
                            conjuntoIOS = factory.seleccionarSet(1);
                            break;
                        default:
                            conjuntoJava = factory.seleccionarSet(2);
                            conjuntoAndroid = factory.seleccionarSet(2);
                            conjuntoIOS = factory.seleccionarSet(2);
                            break;
                    }
                }else{
                    System.out.println("Numero fuera de rango");
                }
            }catch(Exception e){
                System.out.println("Solo ingrese numeros");
                scanner.nextLine();
            }
        }
        loop = true;
        while(loop){
            System.out.println("Menu:\n 1. Ingresar Desarrollador \n 2. Mostrar Estadisticas \n 3. Salir");
                    
                    
                    /*+ "\n"
                    + " 2. Desarrolladores con experiencia en Java, Android y iOS\n "
                    + "3.Desarrolladores con experiencia en Java pero que no tengan "
                    + "experiencia en Android\n 4.Desarrolladores con experiencia en"
                    + " Android y iOS, pero que no tengan experiencia en Java\n "
                    + "5. Desarrolladores con experiencia en Android o iOS"
                    + ", pero que no tengan experiencia en Java\n 6. Indicar SI o NO"
                    + " el conjunto de desarrolladores Java es un subconjunto de Des"
                    + "arrolladores Android."
                    + "");*/
            try{
                int seleccion = scanner.nextInt();
                scanner.nextLine();
                if(seleccion>0 && seleccion<3){
                    
                    switch(seleccion){
                        case 1:
                            System.out.println("Ingrese el nombre del desarrollador: ");
                            String nombre =  scanner.nextLine();
                            System.out.println("Area de experiencia:\n 1. Java\n 2. Android\n 3. IOS");
                            int seleccion2 = scanner.nextInt();
                            scanner.nextLine();
                            switch(seleccion2){
                                case 1:
                                    conjuntoJava.add(nombre);
                                    break;
                                case 2:
                                    conjuntoAndroid.add(nombre);
                                    break;
                                default:
                                    conjuntoIOS.add(nombre);
                                    break;
                            }
                            break;
                        case 2:
                            
                            break;
                        case 3:
                            loop = false;
                            break;
                    }
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
    
 
