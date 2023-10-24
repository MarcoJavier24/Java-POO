package claseabstracta;

public class Circulo extends Figura{
    private double radio;

    public Circulo() {
    }

    public Circulo(double x, double y, double radio) {
        super(x, y);
        this.radio = radio;
    }

    @Override
    public double calcularArea() { //En este caso el metodo lo toma circulo y lo usa a su manera para calcular el area.
        double pi = 3.1416;
        return pi *  radio * radio;
    }
}
