package com.company.empleados;

public class MaestroMayor extends Empleados implements Construccion{

    private int edad;

    public MaestroMayor(){
        super();
        this.edad=0;
    }

    public MaestroMayor(String nombre, int documento, int telefono, int edad){
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
        return ("Soy Maestro y superviso las construcciones");
    }

    @Override
    public int getCostoPorDia(){
        return 1800;
    }

    @Override
    public String toString(){
        return (super.toString() +
                "\nEdad: " + edad);
    }
}


//Maestro y Obreros comparten atributo edad, meter en una interfaz get y set de edad y el metodo construir
//Costo Por Dia de trabajo atributo superclase? //(ver funcion de costo total) metodo abstracto que devuelva un entero
//el Arquitecto creaPlanos, el Maestro y el Obrero tienen la funcion "construir" aunque el trabajo es diferente //INTERFAZ
//los tres saben construir y solo dos lo implementan o creo interfaz para maestro mayor y obrero? los tres TRABAJAN, cada uno hace algo diferente
//clase absrtacta constructor vacio? ningun constructor?
