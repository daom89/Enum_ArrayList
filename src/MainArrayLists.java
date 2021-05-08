import Enums.TipoDocumento;
import Enums.Generos;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.List;
import java.util.Scanner;

public class MainArrayLists {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<Integer>(); //Crear un arraylist de Integer
        numeros.add(7); numeros.add(1); numeros.add(9); numeros.add(2); numeros.add(5); //Añadir elementos al arraylist
        System.out.println(numeros); // Imprime el array
        Collections.sort(numeros);  // Ordenar arraylist numeros
        int numMaximo = Collections.max(numeros); //Obtener el numero maximo
        int numMinimo = Collections.min(numeros); //Obtener el numero minimo
        System.out.println(numeros);
        System.out.println("Numero Maximo: "+numMaximo+", Numero Minimo"+numMinimo);

        ArrayList<String> Nombres = new ArrayList<String>();
        Nombres.add("Diego"); Nombres.add("Juan"); Nombres.add("Pedro"); Nombres.add("Miguel");
        int posicion = Nombres.indexOf("Juan"); //Busco Miguel dentro del array y me devuelve su posicion.
        System.out.println( (posicion >= 0) ? (posicion+"-"+Nombres.get(posicion)) : "No encontrado");

        Scanner sc = new Scanner(System.in);
        ArrayList<Persona> listadoPersonas = new ArrayList<Persona>(); //Creacion e inicializacion de un ArrayList de Personas

        Persona p1 = new Persona("Juliana", "Peña", TipoDocumento.CC, 110, Generos.FEMENINO);
        Persona p2 = new Persona("Juan", "Garcia", TipoDocumento.RC, 220, Generos.MASCULINO);
        Persona p3 = new Persona("Carlos", "Mota", TipoDocumento.TI, 310, Generos.MASCULINO);

        listadoPersonas.add(p1); // Posicion 0
        listadoPersonas.add(p2); // Posicion 1
        listadoPersonas.add(p3); // Posicion 2

        System.out.println(listadoPersonas.get(0)); //Los Indices empiezan en 0
        System.out.println(listadoPersonas.size());// Obtiene la cantidad de elementos en el array

        Persona p4 = new Persona("Diana", "Medina", TipoDocumento.RC, 190, Generos.FEMENINO);
        listadoPersonas.set(2,p4); // Cambiar el objeto persona de la 2 posicion por el p4
        System.out.println(listadoPersonas);
        listadoPersonas.remove(1); //Eliminar un objeto del array
        System.out.println(listadoPersonas);

        System.out.println(listadoPersonas.contains(p4)); //True
        System.out.println(listadoPersonas.contains(p2)); //False

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

        //Buscar por un atributo de persona en el array
        for (int i = 0; i < listadoPersonas.size(); i++) {
            if(listadoPersonas.get(i).getNombre().equalsIgnoreCase("Diana")){
                System.out.println(listadoPersonas.get(i).getNombre()+
                        " fue encontrado en la posicion: "+i);
                break;
            }
        }
        System.out.println("");

        System.out.println(listadoPersonas.get(0).equals(p1)); //True
        System.out.println(listadoPersonas.isEmpty()); //Verifica si un array esta vacio

        Persona[] arrPersonas = listadoPersonas.toArray(new Persona[0]);
        for (Persona per : arrPersonas) {
            System.out.println(per);
        }

        //List<Persona> miLista = listadoPersonas.subList(0,1);

        listadoPersonas.clear(); //Elimina todos los elementos del array
        System.out.println(listadoPersonas);

    }
}
