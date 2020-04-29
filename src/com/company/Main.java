package com.company;

import com.company.empleados.Arquitectos;
import com.company.empleados.Empleados;
import com.company.empleados.MaestroMayor;
import com.company.empleados.Obreros;
import com.company.obras.Comercios;
import com.company.obras.Domesticas;
import com.company.obras.Hoteles;
import com.company.obras.Obras;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        /*2.A Crear instancias de cada tipo de empleado y mostrar el comportamiento
        de “construir” (para los obreros y maestros) y como es el comportamiento de
        un arquitecto.*/

        //Inicializacion de Arquitectos
        Arquitectos arquitecto1 = new Arquitectos("Mies Van der Rohe", 15184965, 4589784, 445874);
        Arquitectos arquitecto2= new Arquitectos("Le Corbusier", 11674894, 4716489, 590487);

        //Inicializacion de Maestros Mayores de Obra
        MaestroMayor maestroMayor1 = new MaestroMayor("Blas Erviti", 39956978, 4879784, 24);
        MaestroMayor maestroMayor2= new MaestroMayor("Anabel Perez", 43897466, 4296784, 22);
        MaestroMayor maestroMayor3= new MaestroMayor("Cruz Gomez", 17697695, 4784949, 53);
        MaestroMayor maestroMayor4= new MaestroMayor("Lucia Nunez", 25364974, 421411, 43);

        //Inicializacion de Obreros
        Obreros obrero1 = new Obreros("Roberto Gomez", 24136497, 4879496, 44);
        Obreros obrero2 = new Obreros("Juan Gonzalez", 36548745,4967848,28);
        Obreros obrero3 = new Obreros("Lisandro Rodriguez", 33154874,4518474,31);
        Obreros obrero4 = new Obreros("Luciano Diaz", 39484659, 4284844, 24);
        Obreros obrero5 = new Obreros("Leandro Martinez", 32659595, 4884944, 32);

        System.out.println("\nArquitecto: " + arquitecto1.crearPlanos());
        System.out.println("\nMaestro Mayor: " + maestroMayor1.construir());
        System.out.println("\nObrero: " + obrero1.construir());

        /*2.B Crear una nueva empresa con un nombre y asignarle distintos tipos de
        empleados. La empresa tiene: nombre, una lista de empleados y las obras
        realizadas.*/

        //Inicializo Empresa
        Empresa nuevaEmpresa = new Empresa("Soluciones SA");

        System.out.println("\n\tCarga de Empleados a la Lista de la Empresa");
        System.out.println(nuevaEmpresa.agregarEmpleado(arquitecto1) + "\n" + nuevaEmpresa.agregarEmpleado(arquitecto2));
        System.out.println(nuevaEmpresa.agregarEmpleado(maestroMayor1) + "\n" + nuevaEmpresa.agregarEmpleado(maestroMayor2));
        System.out.println(nuevaEmpresa.agregarEmpleado(maestroMayor3) + "\n" +nuevaEmpresa.agregarEmpleado(maestroMayor4));
        System.out.println(nuevaEmpresa.agregarEmpleado(obrero1) + "\n" + nuevaEmpresa.agregarEmpleado(obrero2));
        System.out.println(nuevaEmpresa.agregarEmpleado(obrero3) + "\n" + nuevaEmpresa.agregarEmpleado(obrero4) + "\n" +nuevaEmpresa.agregarEmpleado(obrero5));


        /*2.C  Crear al menos una obra por cada tipo distinto que existe, asignando
        empleados a la obra. También se pide ejecutar algún método para saber el
        costo estimado de la obra.*/

        Domesticas unaCasa = new Domesticas("Castelli 245", 93, 105, 1459.93, 2);
        Hoteles unHotel = new Hoteles("Luro 4596", 364, 415, 2670.31, "Hotel Luro IV", 10);
        Comercios unComercio = new Comercios("Libertad 2947", 59, 91, 1863.75, "Autoservicio Gino", "Autoservicios");


        //Carga de Empleados a la Obra con verificacion
        System.out.println("\n\tCarga Empleados de Obra Domestica:");
        System.out.println(unaCasa.agregarEmpleado(arquitecto2));
        System.out.println(unaCasa.agregarEmpleado(maestroMayor2));
        System.out.println(unaCasa.agregarEmpleado(maestroMayor3));
        System.out.println(unaCasa.agregarEmpleado(obrero1));
        System.out.println(unaCasa.agregarEmpleado(obrero4));

        System.out.println("\n\tCarga Empleados de Obra Hoteles:");
        System.out.println(unHotel.agregarEmpleado(arquitecto1));
        System.out.println(unHotel.agregarEmpleado(maestroMayor1));
        System.out.println(unHotel.agregarEmpleado(maestroMayor2));
        System.out.println(unHotel.agregarEmpleado(maestroMayor4));
        System.out.println(unHotel.agregarEmpleado(maestroMayor3));     //este Maestro Mayor no entrara en los Empleados de la Obre, ya hay 3 Maestros Mayores
        System.out.println(unHotel.agregarEmpleado(obrero2));
        System.out.println(unHotel.agregarEmpleado(obrero3));
        System.out.println(unHotel.agregarEmpleado(obrero5));

        System.out.println("\n\tCarga Empleados de Obra Comercial:");
        System.out.println(unComercio.agregarEmpleado(arquitecto1));
        System.out.println(unComercio.agregarEmpleado(arquitecto2));    //este arquitecto no entrara en los Empleados de la Obra, ya hay otro arquitecto
        System.out.println(unComercio.agregarEmpleado(maestroMayor1));
        System.out.println(unComercio.agregarEmpleado(obrero2));    //carga pero tira error de un obrero faltante


        double precioEstimado=0;

        precioEstimado=unaCasa.getPrecioTotalEstimado();
        System.out.println("\nEl precio total estimado para la Obra Domestica es: $" + precioEstimado);
        precioEstimado=unHotel.getPrecioTotalEstimado();
        System.out.println("\nEl precio total estimado para el Hotel es: $" + precioEstimado);
        precioEstimado=unComercio.getPrecioTotalEstimado();
        System.out.println("\nEl precio total estimado para el Comercio es: $" + precioEstimado);

        /*2.D  Se solicita agregar las obras (del punto anterior) a la lista de la empresa.*/

        System.out.println("\n\tCarga de Obras al Listado de la Empresa");
        System.out.println(nuevaEmpresa.agregarObra(unaCasa) + "\n"+nuevaEmpresa.agregarObra(unHotel) + "\n" + nuevaEmpresa.agregarObra(unComercio));

        /*2.E  Crear un método para recorrer los empleados que trabajan en una obra.
        Mostrando por pantalla los distintos datos particulares de cada empleado.*/

        System.out.println("\n\tEmpleados de Obra Domestica");
        StringBuilder empleados = unaCasa.mostrarListadoEmpleados();
        System.out.println(empleados);


        /*2.F  Crear un método para listar todas las obras por pantalla con el costo de la obra.*/

        System.out.println("\n\tObras con Presupuesto Total");
        StringBuilder obras = nuevaEmpresa.mostrarObraConPresupuesto();
        System.out.println(obras);


    }
}
