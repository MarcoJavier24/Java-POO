package claseabstracta;

public class Cuadrado extends Figura{ //Si no usamos el metodo abstracto nos marcara un error por lo cual tenemos que implementar forzosamente el metodo abstracto


    public Cuadrado() {
    }

    public Cuadrado(double x, double y, double lado) {
        super(x, y);
        this.lado = lado;
    }

    private double lado;

    @Override //El metodo abstracto se sobreescribe aqui por lo cual realizara otro tipo de funcion por eso se agrega la ANOTACION Override
    public double calcularArea() {
        return lado * lado;
    }

}