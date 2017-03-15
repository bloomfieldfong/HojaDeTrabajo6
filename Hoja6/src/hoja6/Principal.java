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
        //Sets de los conjunots
        Set<String> conjuntoJava = null;
        Set<String> conjuntoAndroid = null;
        Set<String> conjuntoIOS = null;
        
        Factory<String> factory = new Factory<>();
        
        boolean loop = true;
        while(loop){
            //Seleccion de la implementacion que se desea utilizar
            System.out.println("Que implementacion desea utilizar?\n 1. HashSet\n"
                    + " 2. TreeSet\n 3.LinkedHashSet");
            try{
                int seleccion = scanner.nextInt();
                scanner.nextLine();
                if(seleccion>0 && seleccion<4){
                    loop = false;
                    switch(seleccion){
                        case 1:
                            //Seleccion con el factory
                            conjuntoJava = factory.seleccionarSet(0);
                            conjuntoAndroid = factory.seleccionarSet(0);
                            conjuntoIOS = factory.seleccionarSet(0);
                            break;
                        case 2:
                            //Seleccion con el factory
                            conjuntoJava = factory.seleccionarSet(1);
                            conjuntoAndroid = factory.seleccionarSet(1);
                            conjuntoIOS = factory.seleccionarSet(1);
                            break;
                        default:
                            //Seleccion con el factory
                            conjuntoJava = factory.seleccionarSet(2);
                            conjuntoAndroid = factory.seleccionarSet(2);
                            conjuntoIOS = factory.seleccionarSet(2);
                            break;
                    }
                }else{
                    //numero fuera de rango
                    System.out.println("Numero fuera de rango");
                }
            }catch(Exception e){
               //si se agrega un string que le diga que agrege solo numeros
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
                    //ya que ingreso un tipo de implementacion que desea usar debera seleccionar que desea hacer
                    switch(seleccion){
                        case 1:
                            //Ingreso de datos del desarrollador que se desea ingresar 
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
                            //Impresion de estadisticas
                        case 2: 
                            int a = 0;
                            //Nos indica cuando desarrolladores de java, android y ios existen 
                               if( conjuntoAndroid.equals(conjuntoJava)==true && conjuntoIOS.equals(conjuntoJava)==true ){
                               a++;  
                               }
                        //1
                            System.out.println("EL numero de desarrolladores con experiencia en Java, Android y iOS es de: "+ a);
                            System.out.println("El numero de desarrolladores con experiencia en Java pero no en Andriod es de: "+(conjuntoIOS.size()+conjuntoJava.size()));
                        //3    
                            int b = 0;
                            
                            if(conjuntoAndroid.equals(conjuntoIOS)==true){
                                b++;
                            }
                            System.out.println("El numero de desarrolladores con experiencia en Android y iOs (interesccion) es de: "+b);
                        //4    
                            System.out.println("El numero de desarrolladores con experiencia en Android o iOs es de: "+ (conjuntoAndroid.size()+conjuntoIOS.size()));//duda
                            
                        //5
                            int c = 0;
                            if(conjuntoJava.equals(conjuntoAndroid)== true){
                               c++; 
                            }
                            if(c>=(conjuntoJava.size()*0.8)){
                                System.out.println("NO");
                            }
                            else{
                                System.out.println("Si");
                            }
                           
                            
                        //6
                            if(conjuntoAndroid.size()>= conjuntoJava.size() && conjuntoAndroid.size()>= conjuntoIOS.size()){
                               System.out.println("El conjunto con mas desarrolladores es de: Android. Con un total de: "+conjuntoAndroid.size()+" sus desarrolladores son: "+conjuntoAndroid); 
                            }
                            else if (conjuntoJava.size()>= conjuntoAndroid.size()&& conjuntoJava.size()>=conjuntoIOS.size()){
                                 System.out.println("El conjunto con mas desarrolladores es de: Java. Con un total de: "+conjuntoJava.size()+" sus desarrolladores son: "+conjuntoJava); 
                            }
                            else if(conjuntoIOS.size()>= conjuntoJava.size()&& conjuntoIOS.size()>=conjuntoAndroid.size()){
                                 System.out.println("El conjunto con mas desarrolladores es de: IOS. Con un total de: "+conjuntoAndroid.size()+ " sus desarrolladores son: "+conjuntoIOS); 
                            }
                        //7   
                            if(conjuntoAndroid.size()>= conjuntoJava.size() && conjuntoAndroid.size()>= conjuntoIOS.size()){
                               System.out.println(conjuntoAndroid); 
                            }
                            else if (conjuntoJava.size()>= conjuntoAndroid.size()&& conjuntoJava.size()>=conjuntoIOS.size()){
                                 System.out.println(conjuntoJava); 
                            }
                            else if(conjuntoIOS.size()>= conjuntoJava.size()&& conjuntoIOS.size()>=conjuntoAndroid.size()){
                                 System.out.println(conjuntoIOS); 
                            }
                            break;                                   
                        case 3:
                            loop = false;
                            break;
                    }
                }else{
                    //Le dice si su numero esta fuera de rango
                    System.out.println("Numero fuera de rango");
                }
            }catch(Exception e){
                   //Si ingresa un string le dice que solo puede agregar numeros
                System.out.println("Solo ingrese numeros");
                scanner.nextLine();
            }
        }
    }
    }
    
 
