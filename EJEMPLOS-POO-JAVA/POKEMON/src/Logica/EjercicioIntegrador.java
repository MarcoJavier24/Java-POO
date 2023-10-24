package Logica;

public class EjercicioIntegrador {
    public static void main(String[] args) {
        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbausor bulbausor = new Bulbausor();
        Pikachu pikachu = new Pikachu();

        squirtle.atacarAraniazo();
        squirtle.atacarHidrobomba();

        charmander.atacarPlacaje();
        charmander.atacarAscuas();

        bulbausor.atacarMordisco();
        bulbausor.atacarDrenaje();

        pikachu.atacarAraniazo();
        pikachu.atacarDestello();
    }
}