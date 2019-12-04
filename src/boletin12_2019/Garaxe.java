/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin12_2019;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author david
 */
public class Garaxe {

    private int numeroCoches = 0, plazasvacias = 5, tamano;
    private String matricula;
    private double resultado;
    private double precio = 1.5;
    private double cartosrecibidos, cartosdevoltos, tempo, cambio;

    List<String> matriculas = new ArrayList<String>();

    public Garaxe() {

    }

    public void setMatricula(String matri) {

        if (numeroCoches <= 4) {

            System.out.println("Plazas vacias = " );

          this.matricula=matri;
            numeroCoches++;
            plazasvacias--;
            matriculas.add(matri);
            tamano = matriculas.size();
           

            System.out.println(matriculas);

        } else {

            System.out.println(" COMPLETO ");

        }

    }

    public void calcular_precio(int tempo) {

        if (tempo < 3) {

            this.tempo = tempo;
            resultado = precio;

        } else {

            this.tempo = tempo;

            resultado = (precio + (tempo * 0.2)) - 0.60;

        }

    }

    public void calcular_cambio(double cr) {

        this.cartosrecibidos = cr;

        cambio = cartosrecibidos - resultado;
        numeroCoches--;
        plazasvacias++;
    }

    public String visualizacion() {

        return "FACTURA \nMATRICULA =" + matricula + "\nTEMPO = " + tempo + " horas\nPRECIO = " + resultado + " €\nCARTOS RECIBIDOS = " + cartosrecibidos + " €\nCARTOS DEVOLTOS = " + cambio + " €";

    }

}
