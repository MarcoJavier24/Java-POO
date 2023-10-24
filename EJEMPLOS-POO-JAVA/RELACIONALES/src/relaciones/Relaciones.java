package relaciones;

import java.util.ArrayList;
import java.util.List;

public class Relaciones {
    public static void main(String[] args) {
        Auto aut = new Auto();
        aut.setId(1L);
        aut.setMarca("VW");
        aut.setModelo("Pointer");

        List<Propietario> listaPropietarios =  new ArrayList<Propietario>();

        Propietario prop1 = new Propietario();
        Propietario prop2 = new Propietario();

        prop1.setId(35);
        prop1.setNombre("Marco");
        prop1.setApellido("Saucedo");

        prop2.setId(25);
        prop2.setNombre("Luz");
        prop2.setApellido("Miranda");

        listaPropietarios.add(prop1);
        listaPropietarios.add(prop2);

        aut.setListaPropietarios(listaPropietarios);

        System.out.println("El auto " + aut.getMarca() + " " + aut.getModelo() + " tiene como propietarios a: " + aut.getListaPropietarios().toString());
    }
}