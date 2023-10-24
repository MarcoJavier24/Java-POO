package claseabstracta;

public class Circulo implements Figura, Dibujable, Rotable{ //En las interfaces se usan la palabra reservada implements
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() { //En este caso el metodo lo toma circulo y lo usa a su manera para calcular el area.
        double pi = 3.1416;
        return pi *  radio * radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Hola estoy dibujando un circulo.");

    }

    @Override
    public void rotar() {
        System.out.println("Hola estoy rotando un circulo.");
    }
}