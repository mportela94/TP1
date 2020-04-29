package com.company.obras;

import com.company.Empresa;
import com.company.empleados.Arquitectos;
import com.company.empleados.Empleados;
import com.company.empleados.MaestroMayor;
import com.company.empleados.Obreros;


import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class Obras extends Empresa {

    protected String direccion;
    protected int metrosCuadrados;
    protected int tiempoEstimado;   //en dias
    protected double costoPorMetroCuadrado; //por metro cuadrado
    protected List<Empleados> empleadosDeObra;

    public Obras(){
        this.direccion=null;
        this.metrosCuadrados=0;
        this.tiempoEstimado=0;
        this.costoPorMetroCuadrado=0.00;
        this.empleadosDeObra =new ArrayList<>();
    }

    public Obras(String direccion, int metrosCuadrados, int tiempoEstimado, double costoPorMetroCuadrado){
        this.direccion=direccion;
        this.metrosCuadrados=metrosCuadrados;
        this.tiempoEstimado=tiempoEstimado;
        this.costoPorMetroCuadrado=costoPorMetroCuadrado;
        this.empleadosDeObra =new ArrayList<>();
    }

    public void setDireccion(String direccion){
        this.direccion=direccion;
    }

    public String getDireccion(){
        return direccion;
    }

    public void setMetrosCuadrados(int metrosCuadrados){
        this.metrosCuadrados=metrosCuadrados;
    }

    public int getMetrosCuadrados(){
        return metrosCuadrados;
    }

    public void setTiempoEstimado(int tiempoEstimado){
        this.tiempoEstimado=tiempoEstimado;
    }

    public int getTiempoEstimado(){
        return tiempoEstimado;
    }

    public void setCostoPorMetroCuadrado (double costoPorMetroCuadrado){
        this.costoPorMetroCuadrado=costoPorMetroCuadrado;
    }

    public double getCostoPorMetroCuadrado(){
        return costoPorMetroCuadrado;
    }

    @Override
    public void setEmpleados(List<Empleados> empleadosDeObra) {
        this.empleadosDeObra = empleadosDeObra;
    }

    @Override
    public List<Empleados> getEmpleados() {
        return empleadosDeObra;
    }

    @Override
    public String agregarEmpleado(Empleados unEmpleado){  ///rever
        String verificacionEmpleado = null;
        int cantidadDeEmpleados=0;

        if (empleadosDeObra.isEmpty()){
            empleadosDeObra.add(unEmpleado);
            verificacionEmpleado=("\nCarga de empleado realizada.");
        }else{

            if (unEmpleado instanceof Arquitectos) {
                cantidadDeEmpleados=validarArquitectos();
                if (cantidadDeEmpleados==0){
                    empleadosDeObra.add(unEmpleado);
                    verificacionEmpleado=("\nCarga de empleado realizada.");
                }else
                    verificacionEmpleado=("\nYa hay un arquitecto en la Obra.");

            }else if (unEmpleado instanceof MaestroMayor){
                cantidadDeEmpleados=validarMaestrosMayores();
                if (cantidadDeEmpleados>=0 && cantidadDeEmpleados<3){
                    empleadosDeObra.add(unEmpleado);
                    verificacionEmpleado=("\nCarga de empleado realizada.");
                }else
                    verificacionEmpleado=("\nYa hay tres Maestros Mayores en la obra.");

            }else if (unEmpleado instanceof Obreros){
                empleadosDeObra.add(unEmpleado);
                verificacionEmpleado=("\nCarga del empleado realizada.");
                cantidadDeEmpleados=validarObreros();
                if (cantidadDeEmpleados < 2)
                    verificacionEmpleado=("Falta agregar al menos 1 Obreros a la Obra.");
            }

        }
        return verificacionEmpleado;
    }

    public int validarArquitectos(){
        int cantidadDeArquitectos=0;

        for (int i = 0; i< empleadosDeObra.size(); i++){
            if (empleadosDeObra.get(i) instanceof Arquitectos){
                cantidadDeArquitectos++;
            }
        }
        return cantidadDeArquitectos;
    }

    public int validarMaestrosMayores(){
        int cantidadMaestrosMayores=0;

        for (int i = 0; i< empleadosDeObra.size(); i++){
            if (empleadosDeObra.get(i) instanceof MaestroMayor){
                cantidadMaestrosMayores++;
            }
        }

        return cantidadMaestrosMayores;
    }

    public int validarObreros(){
        int cantidadObreros=0;

        for (int i = 0; i< empleadosDeObra.size(); i++){
            if (empleadosDeObra.get(i) instanceof Obreros){
                cantidadObreros++;
            }
        }

        return cantidadObreros;
    }


    public StringBuilder mostrarEmpleadosObra(){
        StringBuilder empleados = new StringBuilder();
        for(int i=0; i<empleadosDeObra.size();i++){
            empleados.append(empleadosDeObra.get(i).toString() + "\n");
        }
        return empleados;
    }

    public double getPrecioTotalEstimado(){
        double precioTotalEstimado;

        precioTotalEstimado=((getCostoPorMetroCuadrado()) * getMetrosCuadrados())+(getCostoDeEmpleados() * getTiempoEstimado());

        return precioTotalEstimado;
    }

    public double getCostoDeEmpleados(){
        double costoDeEmpleados=0;

        if (empleadosDeObra.isEmpty()){
            costoDeEmpleados=0;
        }else {
            for(int i = 0; i< empleadosDeObra.size(); i++){
                Empleados unEmpleado= empleadosDeObra.get(i);
                costoDeEmpleados+=unEmpleado.getCostoPorDia();
            }

            /*for(Empleados empleados : listadoDeEmpleados){
                costoDeEmpleados+=empleados.getCostoPorDia();
            }*/
        }
        return costoDeEmpleados;
    }

    @Override
    public String toString(){
        return("\nObra: " +
                "\nDireccion: " + direccion +
                "\nMetros Cuadrados: " + metrosCuadrados + " m2" +
                "\nTiempo Estimado: "+ tiempoEstimado + " dias" +
                "\nCosto por m2: $" + costoPorMetroCuadrado);
    }

}
