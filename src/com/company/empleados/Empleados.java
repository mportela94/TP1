package com.company.empleados;

import com.company.Empresa;

public abstract class Empleados extends Empresa {

    protected String nombre;
    protected int documento;
    protected int telefono;

    public Empleados(){
        this.nombre=null;
        this.documento=0;
        this.telefono=0;
    }

    public Empleados(String nombre, int documento, int telefono){
        this.nombre=nombre;
        this.documento=documento;
        this.telefono=telefono;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setDocumento(int documento){
        this.documento=documento;
    }

    public int getDocumento(){
        return documento;
    }

    public void setTelefono(int telefono){
        this.telefono=telefono;
    }

    public int getTelefono(){
        return telefono;
    }

    public abstract int getCostoPorDia();

    @Override
    public String toString(){
        return ("\nEmpleado: " +
                "\nNombre y Apellido: " + nombre +
                "\nDocumento: " + documento +
                "\nTelefono: " + telefono);
    }

}
