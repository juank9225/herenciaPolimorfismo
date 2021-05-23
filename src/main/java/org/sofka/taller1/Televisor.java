package org.sofka.taller1;

public class Televisor extends Electrodomestico{

    private boolean TDT;
    private int pulgadas;

    public Televisor(String consumo, String procedencia, boolean TDT, int pulgadas) {
        super(consumo, procedencia);
        this.TDT = TDT;
        this.pulgadas = pulgadas;
    }

    public double calcularpulgada(){
          if(pulgadas>40){
             return getPrecio()*0.3;
          }
          return 0;
    }

    public double calculartdt(){
        double conTedete=0;
        if (TDT) {
            conTedete=2500;
            return conTedete;
        }
        return conTedete;
    }

    @Override
    public double preciobasico() {
       return super.preciobasico()+calculartdt()+calcularpulgada();

    }

    @Override
    public String toString() {
        return "Televisor{" +
                "TDT=" + TDT +
                ", pulgadas=" + pulgadas +" precio= "+ getPrecio()+" consumo = "+getConsumo()+" procedencia= "+getProcedencia()+
                '}';
    }
}
