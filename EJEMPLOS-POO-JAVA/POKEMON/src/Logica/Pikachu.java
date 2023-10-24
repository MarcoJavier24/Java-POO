package Logica;

public class Pikachu extends Pokemon implements IELectrico{

    public Pikachu() {
    }

    protected void atacarPlacaje() {
        System.out.println("Hola soy Pikachu y estoy usando placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Pikachu y estoy usando araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Pikachu y estoy usando mordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Hola soy Pikachu y estoy usando Impactrueno");
    }

    @Override
    public void atacarDestello() {
        System.out.println("Hola soy Pikachu y estoy usando Destello");
    }
}
