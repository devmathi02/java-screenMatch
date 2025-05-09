import com.alulacursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.alulacursos.screenmatch.calculos.FiltroRecomendacion;
import com.alulacursos.screenmatch.modelos.Episodio;
import com.alulacursos.screenmatch.modelos.Pelicula;
import com.alulacursos.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();

        miPelicula.setNombre("Super Mario Bross");
        miPelicula.setFechaLanzamiento(2023);
        miPelicula.setDuracionMinutos(92);
        miPelicula.setIncluidoEnPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(9.4);
        miPelicula.evalua(5.7);
        miPelicula.evalua(10.5);
        System.out.println(miPelicula.getTotalDeEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        Serie casaDragon = new Serie();
        casaDragon.setNombre("La casa del dragon");
        casaDragon.setFechaLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodeos(50);
        casaDragon.setEpisodeosPorTemporadas(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionMinutos());

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("¿que paso ayer?");
        otraPelicula.setFechaLanzamiento(2009);
        otraPelicula.setDuracionMinutos(100);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo necesario para ver tus Titulos favoritos en estas vacaciones: " + calculadora.getTiempoTotal() + " minutos");

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa Targayan");
        episodio.setSerie(casaDragon);
        episodio.setTotalDeVisualizaciones(30);

        filtroRecomendacion.filtra(episodio);

        //inclucion de arraylist
        var peliculaDeMathi = new Pelicula();
        peliculaDeMathi.setNombre("El señor de los anillos");
        peliculaDeMathi.setDuracionMinutos(180);
        peliculaDeMathi.setFechaLanzamiento(2001);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(peliculaDeMathi);
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);


        System.out.println("tamaño de la lista: " + listaDePeliculas.size());
        System.out.println("la primera pelicula es: " + listaDePeliculas.get(0).getNombre());

        System.out.println("lista de peliculas: " + listaDePeliculas);


    }
}
