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

 

public class main {
    public void Test1 (){
        divideByZero();
    }
    
  public  void divideByZero(){
        
            int c =0;
            for (int i=0; i<10; i++)
                try{
            c=5/i;
            System.out.println("Punto de control 1");
        } catch(ArithmeticException e){
            System.out.println("Division por cero");
        }
        System.out.println("Punto de control 2");
    }
    public static void main(String[] args) {
        main man = new main();
    }
}
