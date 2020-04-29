package com.company.obras;

public class Comercios extends Comerciales{

    private String rubro;

    public Comercios (){
        super();
        this.rubro=null;
    }

    public Comercios (String direccion, int metrosCuadrados, int tiempoEstimado, double costoPorMetroCuadrado, String nombreDeLaObra, String rubro){
        super(direccion, metrosCuadrados, tiempoEstimado, costoPorMetroCuadrado, nombreDeLaObra);
        this.rubro=rubro;
    }

    public void setRubro(String rubro){
        this.rubro=rubro;
    }

    public String getRubro(){
        return rubro;
    }

    @Override
    public String toString(){
        return (super.toString() +
                "\nRubro: " + rubro);
    }
}
