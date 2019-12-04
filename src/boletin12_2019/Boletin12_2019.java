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

        Garaxe coches = new Garaxe();

        coches.setMatricula("1244");
        coches.setMatricula("20");
        coches.setMatricula("32");

        coches.calcular_precio(5);
        coches.calcular_cambio(20);
        System.out.println(coches.visualizacion());
        coches.comprobar_arrayList();

    }

}
