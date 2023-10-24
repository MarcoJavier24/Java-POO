import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Persona> lista = new ArrayList<Persona>(); //Estamos construyendo una nueva arraylist.
        lista.add(new Persona(1, "Pepe", 25));
        lista.add(new Persona(2, "Luis", 35));
        lista.add(new Persona(3, "Luz", 56));
        lista.add(new Persona(4, "Nacho", 5));

        System.out.println("---------FOR---------");
        //Recorrer por indice
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("prueba: " + lista.get(i).getNombre());
        }

        System.out.println("---------FOR EACH---------");

        //Recorrer con foreach
        for (Persona perso: lista) {//Se crea una nueva variable auxiliar perso que esta dentro de la lista para traer las variables que estan en la lista
            System.out.println("prueba: " + perso.getNombre());
        }

    }
}

                                //COLLECTIONS
//        Las colecciones son estructuras similares a los arreglos pero con la principal característica de que son dinámicos (su tamaño y cantidad de elementos puede variar en el tiempo).
//        En Java, las colecciones se emplean mediante la interfaz "Collection", que permite implementar una serie de métodos comunes como ser: Añadir, Eliminar, Obtener el tamaño de la colección, etc.
//        Las listas son un conjunto de elementos relacionados entre si que tienen un determinado orden.
//        Su tamano es dinamico(puede cambiar en el tiempo)

                                //LIFO Y FIFO
//        FIFO: Primero que entra, primero que sale
//        LIFO: Ultimo en entrar, primero en salir.

                                //ARRAYLISTS
//                                Es una clase que se representa como una matriz dinamica que permite almacenar elementos

//        Hereda de la clase AbstractList, la cual implementa la interfaz List.
//        Permite colecciones o elementos duplicados.
//        El orden de los registros es el orden en el que fueron insertados.
//        Permite acceso aleatorio (tiene indice)
//        Manipulacién lenta (recorrer tooodo el arraylist para hacer un cambio)


//        Es una clase
//        Representan a una lista doblemente enlazada (ida y vuelta).
//        Permite duplicados
//        Mantiene el orden de insercién
//        Manipulacién mas rapida
//        Puede ser usada/tratada no solo como lista, sino también como pila, o como cola.
//        Permite hacer inserciones o eliminaciones al principio o al final de la coleccién (por eso es que puede ser tratado como una pila o una cola).