/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin12_2019;

/**
 *
 * @author david
 */
public class Boletin12_2019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Garaxe coche1 = new Garaxe();
        Garaxe coche2 = new Garaxe();
        Garaxe coche3 = new Garaxe();
        Garaxe coche4 = new Garaxe();
        Garaxe coche5 = new Garaxe();
        Garaxe coche6 = new Garaxe();
        Garaxe coche7 = new Garaxe();
        
        
        coche1.setMatricula("1244");
        coche2.setMatricula("20");
        coche3.setMatricula("32");
        coche4.setMatricula("41");
       // coche1.setMatricula("5");
      // coche1.setMatricula("6");
        
        
        coche1.calcular_precio(5);
        coche1.calcular_cambio(20);
        System.out.println(coche1.visualizacion());

        
        
    }

}
