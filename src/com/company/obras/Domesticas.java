package com.company.obras;

public class Domesticas extends Obras{

    private int cantidadDeHabitaciones;

    public Domesticas(){
        super();
        cantidadDeHabitaciones=0;
    }

    public Domesticas (String direccion, int metrosCuadrados, int tiempoEstimado, double costoPorMetroCuadrado, int cantidadDeHabitaciones){
        super(direccion, metrosCuadrados, tiempoEstimado, costoPorMetroCuadrado);
        this.cantidadDeHabitaciones=cantidadDeHabitaciones;
    }

    public void setCantidadDeHabitaciones(int cantidadDeHabitaciones){
        this.cantidadDeHabitaciones=cantidadDeHabitaciones;
    }

    public int getCantidadDeHabitaciones(){
        return cantidadDeHabitaciones;
    }

    @Override
    public String toString(){
        return (super.toString() +
                "\nCantidad de Habitaciones: "+ cantidadDeHabitaciones);
    }
}
