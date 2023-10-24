package relaciones;

import java.util.List;

                        //ASOCIASIONES
public class Auto {
    private Long id;
    private String marca;
    private String modelo;

    //private Propietario prop; Declarando un objeto del tipo propietario, con esto decimos que las clases tienen una relacion 1 a 1

    private List<Propietario> listaPropietarios; //;Declarando un objeto del tipo propietario con una coleccion ya que las colecciones tienen varios objetos asi como en este caso el objeto auto tiene varios propietarios, con esto decimos que las clases tienen una relacion 1 a N (uno a muchos propietarios)

    public Auto() {
    }

                            @Override
                            public String toString() {
                                return "Auto{" +
                                        "id=" + id +
                                        ", marca='" + marca + '\'' +
                                        ", modelo='" + modelo + '\'' +
                                        ", listaPropietarios=" + listaPropietarios +
                                        '}';
                            }

                            public Auto(Long id, String marca, String modelo, List<Propietario> listaPropietarios) { //(Propietario prop) Uso del objeto 1 a 1 /
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.listaPropietarios = listaPropietarios;
        //this.prop = prop; Utilizando en el constructor lel objeto 1 a 1
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    //Getters y setters del objeto 1 a 1
//    public Propietario getProp() {
//        return prop;
//    }
//
//    public void setProp(Propietario prop) {
//        this.prop = prop;
//    }


    public List<Propietario> getListaPropietarios() {
        return listaPropietarios;
    }

    public void setListaPropietarios(List<Propietario> listaPropietarios) {
        this.listaPropietarios = listaPropietarios;
    }
}
