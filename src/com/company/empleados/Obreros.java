package com.company.empleados;

public class Obreros  extends Empleados implements Construccion{

    private int edad;

    public Obreros(){
        super();
        this.edad=0;
    }

    public Obreros (String nombre, int documento, int telefono, int edad){
        super(nombre, documento, telefono);
        this.edad=edad;
    }

    public void setEdad(int edad) {
        this.edad=edad;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String construir() {
        return ("Soy obrero y construyo");
    }



    @Override
    public int getCostoPorDia(){
        return 1500;
    }

    @Override
    public String toString(){
        return (super.toString() +
                "\nEdad: " + edad);
    }
}
