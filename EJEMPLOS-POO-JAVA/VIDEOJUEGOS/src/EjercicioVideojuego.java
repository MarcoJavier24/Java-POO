import ejerciciovideojuego.logica.VideoJuego;
import java.util.ArrayList;
import java.util.List;

public class EjercicioVideojuego {
    public static void main(String[] args) {
        List<VideoJuego> listaVidejuegos = new ArrayList<VideoJuego>();

        VideoJuego game1 = new VideoJuego(1, "Banjo Kazooie", "Nintendo 64", 4, "Plataforma");
        VideoJuego game2 = new VideoJuego(1, "Residen Evil 2", "Nintendo 64", 10, "Terror");
        VideoJuego game3 = new VideoJuego(1, "Syphon Filter", "PlayStation", 5, "Accion");
        VideoJuego game4 = new VideoJuego(1, "Taxi Driver", "Saturn", 1, "Conduccion");
        VideoJuego game5 = new VideoJuego(1, "Age of empires 2", "PC", 20, "Estrategia");

        listaVidejuegos.add(game1);
        listaVidejuegos.add(game2);
        listaVidejuegos.add(game3);
        listaVidejuegos.add(game4);
        listaVidejuegos.add(game5);

        for (VideoJuego game: listaVidejuegos) {
            System.out.println("Titulo: " + game.getTitulo() + " Consola: " + game.getConsola() + " Cantidad de jugadores: " + game.getCantJugadores());

        }

        game1.setTitulo("Mario 64");
        game1.setCantJugadores(1);

        game3.setTitulo("Crash Bandicoot");
        game3.setCantJugadores(1);

        System.out.println("-----------------------------------------");
        
        for (VideoJuego game: listaVidejuegos) {
            if (game.getConsola().equals("Nintendo 64")) {
                System.out.println(game.toString());
            }
        }
    }
}