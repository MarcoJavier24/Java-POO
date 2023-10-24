import java.util.Stack;

//Esta es un tipo de last in, first out osea que el ultimo en entrar es el primero en salir

public class Pilas {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<Integer>(); //La declaracion es casi igual que la de los array list y los linkedlist

        System.out.println("Lista vacia: " + pila);
        System.out.println("Esta vacia? " + pila.isEmpty());

        //agregar
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);

        //Recorrido en un for each
        for (Integer pilita: pila) {
            System.out.println(pilita);
        }

        //mostrar
        System.out.println("Pila: " + pila);
        System.out.println("Pila vacia?" + pila.isEmpty());

        pila.pop();// Eliminar el ultimo registro que entro
        System.out.println("Esta el 3? " + pila.search(3)); //Para buscar un elemento en particular,en este caso si existe
        System.out.println("Esta el 3? " + pila.search(8)); //Para buscar un elemento en particular,en este caso no existe
        System.out.println("Ultimo agregado " + pila.peek()); //Para ver el ultimo elemento agregado en la lista
    }
}