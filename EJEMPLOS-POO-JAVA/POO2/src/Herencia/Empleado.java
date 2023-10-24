package Herencia;
//    Hay clases que comparten gran parte de sus características.
//    El mecanismo conocido con el nombre de herencia permite reutilizar clases: Se crea una nueva clase que extiende la funcionalidad de una clase existente sin tener que reescribir el código asociado a esta última.
//    La nueva clase, a la que se denomina subclase, puede poseer atributos y métodos que no existan en la clase original.
//    Los objetos de la nueva clase heredan los atributos y los métodos de la clase original, que se denomina superclase.

public class Empleado extends Persona{  //En este caso se usa extends para heredar de la clase padre o superclase Persona.

    int num_legajo;
    String cargo;
    Double sueldo;

    public Empleado() {
    }

    public Empleado(int id, String dni, String nombre, String apellido, String domicilio, String telefono, int num_legajo, String cargo, Double sueldo) {
        super(id, dni, nombre, apellido, domicilio, telefono); //La palabra reservada SUPER se usa para traer las propiedades que se heredan de la clase Persona
        this.num_legajo = num_legajo;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public int getNum_legajo() {
        return num_legajo;
    }

    public void setNum_legajo(int num_legajo) {
        this.num_legajo = num_legajo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
}
