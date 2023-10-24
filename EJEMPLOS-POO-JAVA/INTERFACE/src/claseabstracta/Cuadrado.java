package claseabstracta;

public class Cuadrado implements Figura, Dibujable{


    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    private double lado;

    @Override //El metodo abstracto se sobreescribe aqui por lo cual realizara otro tipo de funcion por eso se agrega la ANOTACION Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public void dibujar() {
        System.out.println("Hola estoy dibujando un cuadrado.");
    }
}