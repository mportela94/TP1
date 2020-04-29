package com.company;

import com.company.empleados.Empleados;
import com.company.obras.Obras;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String nombreEmpresa;
    protected List <Empleados> listadoDeEmpleados;
    protected List <Obras> listadoDeObras;

    public Empresa(){
        this.nombreEmpresa=null;
        this.listadoDeEmpleados=new ArrayList<>();
        this.listadoDeObras=new ArrayList<>();
    }

    public Empresa(String nombreEmpresa){
        this.nombreEmpresa=nombreEmpresa;
        this.listadoDeEmpleados=new ArrayList<>();
        this.listadoDeObras=new ArrayList<>();
    }

    public void setNombreEmpresa(String nombreEmpresa){
        this.nombreEmpresa=nombreEmpresa;
    }

    public String getNombreEmpresa(){
        return nombreEmpresa;
    }

    public void setEmpleados(List<Empleados> empleadosDeObra){
        this.listadoDeEmpleados= empleadosDeObra;
    }

    public List getEmpleados(){
        return listadoDeEmpleados;
    }

    public void setObras(List<Obras> listadoDeObras){
        this.listadoDeObras=listadoDeObras;
    }

    public List getObras(){
        return listadoDeObras;
    }

    public String agregarEmpleado(Empleados unEmpleado) {   //agrega empleado a la lista de Empleados de la Empresa
        listadoDeEmpleados.add(unEmpleado);
        return ("\nCarga exitosa.");
    }

    public String agregarObra(Obras unaObra){   //agrega una obra a la lista de Obras de la Empresa
        listadoDeObras.add(unaObra);
        return ("\nCarga exitosa.");
    }

    public StringBuilder mostrarObraConPresupuesto(){
        StringBuilder datosDeObra = new StringBuilder();
        for (int i=0; i<listadoDeObras.size();i++){
           datosDeObra.append(listadoDeObras.get(i).toString() + "\nPresupuesto Total de Obra: $" + listadoDeObras.get(i).getPrecioTotalEstimado() + "\n");
        }
        return datosDeObra;
    }

    @Override
    public String toString (){
        return ("Nombre de la Empresa: " + nombreEmpresa);
    }
}
