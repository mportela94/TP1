package com.company.obras;

public class Hoteles extends Comerciales {

    private int cantidadDePisos;

    public Hoteles(){
        super();
        this.cantidadDePisos=0;
    }

    public Hoteles(String direccion, int metrosCuadrados, int tiempoEstimado, double costoPorMetroCuadrado, String nombreDeLaObra, int cantidadDePisos){
        super(direccion, metrosCuadrados, tiempoEstimado, costoPorMetroCuadrado, nombreDeLaObra);
        this.cantidadDePisos=cantidadDePisos;
    }

    public void setCantidadDePisos(int cantidadDePisos){
        this.cantidadDePisos=cantidadDePisos;
    }

    public int getCantidadDePisos(){
        return cantidadDePisos;
    }

    @Override
    public String toString(){
        return (super.toString() +
                "\nCantidad de Pisos: " + cantidadDePisos);
    }
}
