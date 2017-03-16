/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja6;

import java.util.ArrayList;
import java.util.Collections;
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
                            System.out.println("HashSet Seleccionado!\n");
                            break;
                        case 2:
                            //Seleccion con el factory
                            conjuntoJava = factory.seleccionarSet(1);
                            conjuntoAndroid = factory.seleccionarSet(1);
                            conjuntoIOS = factory.seleccionarSet(1);
                            System.out.println("TreeSet Seleccionado!\n");
                            break;
                        default:
                            //Seleccion con el factory
                            conjuntoJava = factory.seleccionarSet(2);
                            conjuntoAndroid = factory.seleccionarSet(2);
                            conjuntoIOS = factory.seleccionarSet(2);
                            System.out.println("LinkedHashSet Seleccionado!\n");
                            break;
                    }
                }else{
                    //numero fuera de rango
                    System.out.println("Numero fuera de rango\n");
                }
            }catch(Exception e){
               //si se agrega un string que le diga que agrege solo numeros
                System.out.println("Solo ingrese numeros\n");
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
                            boolean loop2 = true;
                            //Ingreso de datos del desarrollador que se desea ingresar 
                            System.out.println("Ingrese el nombre del desarrollador: ");
                            String nombre =  scanner.nextLine();
                            
                            while(loop2){
                                System.out.println("Seleccione una por una las areas de experiencia:\n 1. Java\n 2. Android\n 3. IOS\n 4. LISTO!");
                                try{
                                    int seleccion2 = scanner.nextInt();
                                    scanner.nextLine();
                                    if(seleccion2>0 && seleccion2<5){
                                        switch(seleccion2){
                                            case 1:
                                                conjuntoJava.add(nombre);
                                                System.out.println("Experiencia en Java seleccionada!\n");
                                                break;
                                            case 2:
                                                conjuntoAndroid.add(nombre);
                                                System.out.println("Experiencia en Android seleccionada!\n");
                                                break;
                                            case 3:
                                                conjuntoIOS.add(nombre);
                                                System.out.println("Experiencia en IOS seleccionada!\n");
                                                break;
                                            default:
                                                loop2 = false;
                                        }
                                    }else{
                                        System.out.println("Numero fuera de rango\n");
                                    }
                                }catch(Exception e){
                                    System.out.println("Solo ingrese numeros\n");
                                    scanner.nextLine();
                                }
                            }
                            break;
                            //Impresion de estadisticas
                        case 2: 
                            int cantidadTodos = 0;
                            int cantidadJavaNoAndroid = 0;
                            int cantidadAndroidYIOSNOJava = 0;
                            int cantidadAndroidNoIOS = 0;
                            int cantidadIOSNoAndroid = 0;
                            boolean esSubconjunto = true;

                            //Convertimos los conjuntos a arrays para recorrer todos los elementos
                            ArrayList<String> listaJava = new ArrayList<>(conjuntoJava);
                            ArrayList<String> listaAndroid = new ArrayList<>(conjuntoAndroid);
                            ArrayList<String> listaIOS = new ArrayList<>(conjuntoIOS);
                            
                            for(int i=0; i<conjuntoJava.size();i++){
                                if(conjuntoAndroid.contains(listaJava.get(i))){
                                    if(conjuntoIOS.contains(listaJava.get(i))){
                                        cantidadTodos++;
                                    }
                                }else{
                                    cantidadJavaNoAndroid++;
                                    esSubconjunto = false;
                                }
                            }
                            for(int i=0; i<conjuntoAndroid.size();i++){
                                if(conjuntoIOS.contains(listaAndroid.get(i))){
                                    if(!conjuntoJava.contains(listaAndroid.get(i))){
                                            cantidadAndroidYIOSNOJava++;
                                    }
                                }else{
                                    cantidadAndroidNoIOS++;
                                }
                            }
                            for(int i=0; i<conjuntoIOS.size();i++){
                                if(!conjuntoAndroid.contains(listaIOS.get(i))){
                                    cantidadIOSNoAndroid++;
                                }
                            }
                        //1
                            System.out.println("1. EL numero de desarrolladores con experiencia en Java, Android y iOS es de: " + cantidadTodos);
                            System.out.println("2. El numero de desarrolladores con experiencia en Java pero no en Andriod es de: " + cantidadJavaNoAndroid);
                        //3    
                            System.out.println("3. El numero de desarrolladores con experiencia en Android y iOs pero no en Java es de: " + cantidadAndroidYIOSNOJava);
                        //4    
                            System.out.println("4. El numero de desarrolladores con experiencia en Android o iOs es de: "+ (cantidadAndroidNoIOS+cantidadIOSNoAndroid));//duda
                            
                        //5
                            System.out.println("3. El conjunto de desarrolladores Java es subconjunto de los desarrolladores Android: " + esSubconjunto);
                        //6
                            if(conjuntoAndroid.size()>= conjuntoJava.size() && conjuntoAndroid.size()>= conjuntoIOS.size()){
                               System.out.println("4. El conjunto con mas desarrolladores es de: Android. Con un total de: "+conjuntoAndroid.size()+" sus desarrolladores son: "+conjuntoAndroid); 
                            }
                            else if (conjuntoJava.size()>= conjuntoAndroid.size()&& conjuntoJava.size()>=conjuntoIOS.size()){
                                 System.out.println("4. El conjunto con mas desarrolladores es de: Java. Con un total de: "+conjuntoJava.size()+" sus desarrolladores son: "+conjuntoJava); 
                            }
                            else if(conjuntoIOS.size()>= conjuntoJava.size()&& conjuntoIOS.size()>=conjuntoAndroid.size()){
                                 System.out.println("4. El conjunto con mas desarrolladores es de: IOS. Con un total de: "+conjuntoAndroid.size()+ " sus desarrolladores son: "+conjuntoIOS); 
                            }
                        //7   
                            if(conjuntoAndroid.size()>= conjuntoJava.size() && conjuntoAndroid.size()>= conjuntoIOS.size()){
                                Collections.sort(listaAndroid);
                                 System.out.println("7. El conjunto mas grande ordenado alfabeticamente: " + listaAndroid); 
                            }
                            else if (conjuntoJava.size()>= conjuntoAndroid.size()&& conjuntoJava.size()>=conjuntoIOS.size()){
                                Collections.sort(listaJava);
                                 System.out.println("7. El conjunto mas grande ordenado alfabeticamente: " + listaJava);                                          
                            }
                            else if(conjuntoIOS.size()>= conjuntoJava.size()&& conjuntoIOS.size()>=conjuntoAndroid.size()){
                                Collections.sort(listaIOS);
                                 System.out.println("7. El conjunto mas grande ordenado alfabeticamente: " + listaIOS); 
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
    
 
