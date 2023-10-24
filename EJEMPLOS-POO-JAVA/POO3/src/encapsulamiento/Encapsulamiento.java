package encapsulamiento;

public class Encapsulamiento {
    public static void main(String[] args) {

        Alumno alu = new Alumno();
        Alumno alu2 = new Alumno(15, "Pepe", "Robles"); //Marca un error ya que el constructor es privado osea que no permite que otras clases lo usen.

        System.out.println("id" + alu2.getId()); //Pasa lo mismo con los setters and getters, si cambiamos el public por un private no se puede acceder a la propiedad en este caso el ID
        System.out.println("nombre" + alu2.getNombre());
        System.out.println("apellido" + alu2.getApellido());

//        Son un tipo particular de clase cuya principal característica es que no pueden ser instanciadas.
//        Generalmente declara la existencia de métodos pero no su implementación, convirtiéndola así en una clase padre.
//                Al menos uno de sus métodos debe ser abstracto (puede tener métodos no abstractos).
//        Sus niveles de visualización deben ser o public o protected (nunca private).
//        Cuando se usan clases abstractas una clase no puede heredar de
//        varias clases abstractas a la vez (como es en el caso de las interfaces).
//        Generalmente las clases abstractas indican el "ES/SER" de un objeto.

    }
}