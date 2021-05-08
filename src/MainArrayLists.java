import Enums.TipoDocumento;
import Enums.Generos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainArrayLists {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(7); numeros.add(1); numeros.add(9); numeros.add(2); numeros.add(5); //Añadir elementos al arraaylist
        System.out.println(numeros);
        Collections.sort(numeros);  // Ordenar arraylist numeros
        int numMaximo = Collections.max(numeros); //Obtener el numero maximo
        int numMinimo = Collections.min(numeros); //Obtener el numero minimo
        System.out.println(numeros);
        System.out.println("Numero Maximo: "+numMaximo+", Numero Minimo"+numMinimo);

        Scanner sc = new Scanner(System.in);
        ArrayList<Persona> listadoPersonas = new ArrayList<Persona>(); //Creacion e inicializacion de un ArrayList

        Persona p1 = new Persona("Juliana", "Peña", TipoDocumento.CC, 110, Generos.FEMENINO);
        Persona p2 = new Persona("Juan", "Garcia", TipoDocumento.RC, 220, Generos.MASCULINO);
        Persona p3 = new Persona("Carlos", "Mota", TipoDocumento.TI, 310, Generos.MASCULINO);

        listadoPersonas.add(p1);
        listadoPersonas.add(p2);
        listadoPersonas.add(p3);

        System.out.println(listadoPersonas.get(0)); //Los Indices empiezan en 0
        System.out.println(listadoPersonas.size());// Obtiene la cantidad de elementos en el array

        Persona p4 = new Persona("Diana", "Medina", TipoDocumento.RC, 190, Generos.FEMENINO);
        listadoPersonas.set(2,p4); // Cambiar el objeto persona de la 2 posicion por el p4
        System.out.println(listadoPersonas);
        listadoPersonas.remove(2); //Eliminar un objeto del array
        System.out.println(listadoPersonas);

        //Recorrer un ArrayList por medio de un for
        System.out.println("------- Recorrer For ----------");
        for (int i = 0; i < listadoPersonas.size(); i++) {
            System.out.println(listadoPersonas.get(i));
        }
        System.out.println("");

        System.out.println("------- Recorrer ForEach -------");
        //Recorrer un ArrayList por medio del foreach
        for (Persona tmpPersona : listadoPersonas) {
            System.out.println(tmpPersona);
        }
        System.out.println("");

        listadoPersonas.clear(); //Elimina todos los elementos del array
        System.out.println(listadoPersonas);

    }
}
