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
        
        Set<String> conjuntoJava = null;
        Set<String> conjuntoAndroid = null;
        Set<String> conjuntoIOS = null;
        
        Factory<String> factory = new Factory<>();
        
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
                    
                    
                    
            try{
                int seleccion = scanner.nextInt();
                scanner.nextLine();
                if(seleccion>0 && seleccion<=3){
                    
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
                            int cantidadJAI = 0;
                            String[] listaAndroid = (String[])conjuntoAndroid.toArray();
                            
                            System.out.println("JAVA: " + conjuntoJava);
                            System.out.println("ANDROID: " + conjuntoAndroid);
                            System.out.println("IOS: " + conjuntoIOS);
                            System.out.println("EL numero de desarrolladores con experiencia en Java, Android y iOS es de: " + cantidadJAI);
                            System.out.println("El numero de desarrolladores con experiencia en Java paro no en Androdi es de: ");
                            System.out.println("El numero de desarrolladores con experiencia en Android y iOs (interesccion) es de: ");
                            System.out.println("El numero de desarrolladores con experiencia en Android y iOs (union) es de: ");
                            System.out.println("El conjunto con mas desarrolladores es de: . Con los siguientes: ");
                            System.out.println("El conjunto con mas desarrolladores es de: . Con los siguientes: "); //numero ascendente 
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
    
 
