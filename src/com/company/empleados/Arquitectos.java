package com.company.empleados;

public class Arquitectos extends Empleados{

    private int matricula;

    public Arquitectos(){
        super();
        this.matricula=0;
    }

    public Arquitectos(String nombre, int documento, int telefono, int matricula){
        super(nombre,documento,telefono);
        this.matricula=matricula;
    }

    public void setMatricula(int matricula){
        this.matricula=matricula;
    }

    public int getMatricula(){
        return matricula;
    }

    public String crearPlanos(){
        return ("Creando mi proximo plano.");
    }

    @Override
    public int getCostoPorDia() {
        return 2000;
    }

    @Override
    public String toString(){
        return (super.toString() +
                "\nMatricula: " + matricula);
    }
}
