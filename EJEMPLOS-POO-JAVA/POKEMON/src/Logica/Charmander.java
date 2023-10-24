package Logica;

public class Charmander extends Pokemon implements IFuego{

    public Charmander() {
    }

    protected void atacarPlacaje() {
        System.out.println("Hola soy Charmander y estoy usando placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Charmander y estoy usando araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Charmander y estoy usando mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Hola soy Charmander y estoy usando punio fuego");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Hola soy Charmander y estoy usando lanza llamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Hola soy Charmander y estoy usando ascuas");
    }
}
