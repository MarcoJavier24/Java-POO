package Logica;

public class Squirtle extends Pokemon implements IAgua{

    public Squirtle() {
    }

    protected void atacarPlacaje() {
        System.out.println("Hola soy Squirtle y estoy usando placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Squirtle y estoy usando araniazo");

    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Squirtle y estoy usando mordisco");

    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Hola soy Squirtle y estoy usando hidrobomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Hola soy Squirtle y estoy usando burbuja");
    }

    @Override
    public void atacarPistolaagua() {
        System.out.println("Hola soy Squirtle y estoy usando pistola agua");
    }
}
