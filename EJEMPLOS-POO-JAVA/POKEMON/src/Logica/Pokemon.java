package Logica;

//CLASE BASE DE DONDE LOS POKEMONS VAN A HEREDAR

public abstract class Pokemon {
    //Propiedades de los pokemons
    protected int numPokedex;
    protected String nombre;
    protected double peso;
    protected String sexo;
    protected int temporada;

    protected abstract void atacarPlacaje();
    protected abstract void atacarAraniazo();
    protected abstract void atacarMordisco();

    //Cuando va mas a la especializacion de que hace solamente y no me importa mucho el como son, se utilizan las interfaces.
    //Cuando se necesita saber mas el que hace se utiliza la clase abstracta.
}
