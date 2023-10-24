import Logica.Alumno;

public class Main {
    public static void main(String[] args) {

        Alumno alu1 = new Alumno(); //Creando objeto sin parametros o con constructor vacio
        Alumno alu2 = new Alumno(5, "Luis", "Del Valle");//Creando objeto con parametros o con constructor con parametros

        //Uso de los getters para traer la informacion del alumno 2
        System.out.println("La id del alumno 2 es: " +alu2.getId());
        System.out.println("El nombre es: " + alu2.getNombre());
        System.out.println("El apellido es: " + alu2.getApellido());

        //Uso de los setters para asignar valores al alumno 2
        alu1.setId(1);
        alu1.setNombre("Pepe");
        alu1.setApellido("Lopez");

        System.out.println("-------------------------------------");
        System.out.println("La id del alumno 1 es: " +alu1.getId());
        System.out.println("El nombre del alumno 1 es: " + alu1.getNombre());
        System.out.println("El apellido del alumno 1 es: " + alu1.getApellido());

        //Cambio de valor o sobreescrbir el valor para su correccion
        alu2.setId(3);

        System.out.println("-------------------------------------");
        System.out.println("La id del alumno 2 es: " +alu2.getId());
        System.out.println("El nombre es: " + alu2.getNombre());
        System.out.println("El apellido es: " + alu2.getApellido());
    }
}