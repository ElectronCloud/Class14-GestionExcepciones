/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionExcepciones;

/**
 *
 * @author jcarrero
 */
public class PersonException extends Exception{
    
    public PersonException(){
        super("Person Excepcion");
    }
    
    
    public void xx() throws PersonException{
        
        throw new PersonException();
    }
    
    public void yy(){  //Primera opcion para procesar la excepcion
        try{
            xx();
        }catch (PersonException e){
            
        }
    }
    
    public void zz()throws PersonException{  // Segunda opción para propagar la excepcion
        xx();
        
    }
    
    public static void main(String[] args) {
        PersonException e = new PersonException();
        e.yy();
    }
    
}
