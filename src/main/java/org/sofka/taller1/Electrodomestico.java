package org.sofka.taller1;

import java.util.Locale;
import java.util.Scanner;

public class Electrodomestico {
    private String consumo;
    private String procedencia;
    private double precio;

    public Electrodomestico(String consumo, String procedencia) {
        this.consumo = consumo;
        this.procedencia = procedencia;
        this.precio = preciobasico();
    }

    public double getPrecio() {
        return precio;
    }

    public String getConsumo() {
        return consumo;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public double optenerConsumo(){
       switch (consumo){
           case "A":
                precio=+450000;
                break;
           case "B":
                precio=+350000;
                break;
           case "C":
                precio=+250000;
                break;
           }
           return precio;
       }

    public double optenerProcedencia(){
        switch (procedencia){

            case "NACIONAL":
                return precio=+250000;
            case "IMPORTADO":
                return precio=+350000;
        }
        return precio;
     }

     public double preciobasico(){
         return this.precio=optenerProcedencia()+optenerConsumo();
     }

}
