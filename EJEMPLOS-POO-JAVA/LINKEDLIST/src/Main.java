import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Persona> lista = new LinkedList<Persona>();

        //En las linked list se pueden agregar personas al final de la lista al igual que al principio e intermedio.
        //Las linked list, el primer elemento solo tiene un puntero siguiente pero no anterior y el ultimo elemento tiene un puntero anterior pero no siguiente
        //Pero los demas elementos tienen dos punteros: anterior y siguiente
        lista.add(new Persona(1, "Pepe", 25));
        lista.add(new Persona(2, "Luis", 35));
        lista.add(new Persona(3, "Luz", 56));
        lista.add(new Persona(4, "Nacho", 5));

        //Agregar al principio
        lista.add(0, new Persona(5, "Mayra", 98));

        System.out.println("---------FOR EACH---------");

        //Recorrer con foreach
        for (Persona persona: lista) {//La linkedlist no tienen indices, se ven registro por registro no por indice
            System.out.println("prueba: " + persona.getNombre());
        }

    }
}

                                //LINKEDLIST
//        Es una clase
//        Representan a una lista doblemente enlazada (ida y vuelta).
//        Permite duplicados
//        Mantiene el orden de insercién
//        Manipulacién mas rapida
//        Puede ser usada/tratada no solo como lista, sino también como pila, o como cola.
//        Permite hacer inserciones o eliminaciones al principio o al final de la coleccién (por eso es que puede ser tratado como una pila o una cola).