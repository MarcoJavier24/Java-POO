package claseabstracta;

public abstract class Figura {

    //CLASE ABSTRACTA
    //        Son un tipo particular de clase cuya principal característica es que no pueden ser instanciadas.
    //        Generalmente declara la existencia de métodos pero no su implementación, convirtiéndola así en una clase padre.
    //                Al menos uno de sus métodos debe ser abstracto (puede tener métodos no abstractos).
    //        Sus niveles de visualización deben ser o public o protected (nunca private).
    //        Cuando se usan clases abstractas una clase no puede heredar de
    //        varias clases abstractas a la vez (como es en el caso de las interfaces).
    //        Generalmente las clases abstractas indican el "ES/SER" de un objeto.

    protected double x; //Pos en x
    protected double y; //Pos en y

    public Figura() {
    }

    public Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract double calcularArea(); //Se declara el metodo pero no se escribe su implementacion.

}
