package com.example.ProyLab.clases;

import javax.xml.transform.sax.SAXSource;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by alumno on 12/07/2017.
 */
public class Principal {

    public static void main(String[] args) throws Exception {
        System.out.println("Ingrese el restaurante");
        Scanner sn = new Scanner(System.in);
        Restaurante restaurante = new Restaurante();

        System.out.println("Nombre del restaurante");
        restaurante.setNomRes(sn.next());
        System.out.println("Ingrese la dirección");
        restaurante.setDirRes(sn.next());
        System.out.println("Ingrese cantidad de trabajadores:");
        restaurante.setTrabRes(sn.nextInt());
        System.out.println("Qué cantidad de comensales soporta simultaneamente?:");
        restaurante.setComensalesSimul(sn.nextInt());
        //System.out.println("Acepta niños?");
        //restaurante.setNiños(sn.nextBoolean());
        System.out.println("Ingrese categoria: ");
        restaurante.setCatRes(sn.nextFloat());

        System.out.println("Los impuestos que debe pagar: "+ restaurante.impuesto());

        System.out.println("Ahora debe agregar comensales");
        System.out.println("Cuantos comensales ingresará?");
        int cantidadComensal = sn.nextInt();
        for (int i = 0; i <= cantidadComensal; i++) {
            System.out.println("");
        }

    }

}
