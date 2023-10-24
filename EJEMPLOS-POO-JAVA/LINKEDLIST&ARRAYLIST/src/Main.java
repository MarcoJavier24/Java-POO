import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<Persona> linkedList = new LinkedList<Persona>();

        //En las linked list se pueden agregar personas al final de la lista al igual que al principio e intermedio.
        //Las linked list, el primer elemento solo tiene un puntero siguiente pero no anterior y el ultimo elemento tiene un puntero anterior pero no siguiente
        //Pero los demas elementos tienen dos punteros: anterior y siguiente
        linkedList.add(new Persona(1, "Pepe", 25));
        linkedList.add(new Persona(2, "Luis", 35));
        linkedList.add(new Persona(3, "Luz", 56));
        linkedList.add(new Persona(4, "Nacho", 5));

        List<Persona> listArray = new ArrayList<Persona>();
        listArray.add(new Persona(1, "Pepe", 25));
        listArray.add(new Persona(2, "Luis", 35));
        listArray.add(new Persona(3, "Luz", 56));
        listArray.add(new Persona(4, "Nacho", 5));


        //DIFERENCIAS ENTRE LAS ARRAYLIST Y LAS LINKEDLIST

        //Remove en el ArrayList
        listArray.remove(1);

        //Remove en la linkedlist
        String nombreBorrar = "Luz";
        for (Persona persona2 : linkedList){
            if (persona2.getNombre().equals(nombreBorrar)){
                linkedList.remove(persona2);
                break; //Se usa el break para detener el programa
            }
        }

        System.out.println("--------------Luego de eliminar--------------");

        System.out.println("--------------ARRAYLIST--------------");
        for (Persona persona:listArray) {
            System.out.println("Prueba " + persona.getNombre());
        }

        System.out.println("--------------LINKEDLIST--------------");
        for (Persona persona:linkedList) {
            System.out.println("Prueba " + persona.getNombre());
        }

        //TAMANIO LISTA
        System.out.println("--------------Que tamanio tienen las listas--------------");
        System.out.println("ArrayList: " + listArray.size());
        System.out.println("LinkedList: " + linkedList.size());

        //Obtener el primer objeto y el ultimo
        System.out.println("--------------Primer y ultimo elemento--------------");
//        System.out.println("Primero de LinkedList: " + linkedList.get(0).toString());
//        System.out.println("Ultimo de la LinkedList: " + linkedList.get(3).toString());

        //Borrar toda la lista
        System.out.println("--------------Borrando listas--------------");
        listArray.clear();
        linkedList.clear();

        System.out.println("--------------Esta vacia alguna lista?--------------");
        System.out.println("ArrayList: " + listArray.isEmpty());
        System.out.println("ArrayList: " + linkedList.isEmpty());

    }
}