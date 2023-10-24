package Logica;

public class Bulbausor extends Pokemon implements IPlanta{

    public Bulbausor() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Bulbasur y estoy usando placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Bulbasur y estoy usando araniazo");

    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Bulbasur y estoy usando mordisco");

    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Hola soy Bulbasur y estoy usando drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola soy Bulbasur y estoy usando paralizar");
    }
}
