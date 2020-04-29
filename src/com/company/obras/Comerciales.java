package com.company.obras;

public class Comerciales extends Obras{

    protected String nombreDeLaObra;

    public Comerciales (){
        super();
        this.nombreDeLaObra=null;
    }

    public Comerciales(String direccion, int metrosCuadrados, int tiempoEstimado, double costoPorMetroCuadrado, String nombreDeLaObra){
        super(direccion, metrosCuadrados, tiempoEstimado, costoPorMetroCuadrado);
        this.nombreDeLaObra=nombreDeLaObra;
    }

    public void setNombreDeLaObra(String nombreDeLaObra) {
        this.nombreDeLaObra = nombreDeLaObra;
    }

    public String getNombreDeLaObra() {
        return nombreDeLaObra;
    }

    @Override
    public String toString(){
        return (super.toString() +
                "\nNombre de la Obra: " + nombreDeLaObra);
    }
}
