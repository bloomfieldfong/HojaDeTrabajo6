/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja6;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;

/**
 *
 * @author chris
 * @param <E>
 */
public class Factory<E>{
    
    public Set<E> seleccionarSet(int tipoSet){
        switch(tipoSet){
            case 0:
                return new HashSet<>();
            case 1:
                return new TreeSet<>();
            case 2:
                return new LinkedHashSet<>();
            default:
                return null;
        }
    }
}
