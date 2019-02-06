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
public class Dog extends Pet implements Licensable{

protected License license;

    public Dog(License license, String name) {
        super(name);
        this.license = license;
    }

    public Dog(String name) {
        super(name);
        this.license = license;
    }
    
    public void speak(){
        
    }
    
    public License getLicense(){
        return this.license;
    }
    
}
