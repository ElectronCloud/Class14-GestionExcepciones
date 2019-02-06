/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

/**
 *
 * @author jcarrero
 */
public abstract class Pet implements Speaking{
    protected String name;
    
    public Pet (String name){
        this.name= name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public abstract void speak();
}
