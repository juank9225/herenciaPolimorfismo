package org.sofka.taller1;

public class Nevera  extends Electrodomestico{
    private int capacidad;
    private int precionevera;

    public Nevera(String consumo, String procedencia,int capacidad) {
        super(consumo, procedencia);
        this.capacidad=capacidad;
    }

    public int getPrecionevera() {
        return precionevera;
    }

    public void setPrecionevera(int precionevera) {
        this.precionevera = precionevera;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }


    public double adicionalNevera() {
        if(capacidad >120) {
            int litrosAdicionales = (capacidad-120);
            int fraccion = (litrosAdicionales/10);
            double incremento = fraccion * 0.05;
            return getPrecio() * incremento;

        }
        return getPrecio();
    }

    @Override
    public double preciobasico() {
        return super.preciobasico()+adicionalNevera();
    }
}
