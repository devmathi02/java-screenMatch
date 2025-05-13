package com.alulacursos.screenmatch.principal;

import com.alulacursos.screenmatch.modelos.Pelicula;
import com.alulacursos.screenmatch.modelos.Serie;
import com.alulacursos.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Super Mario Bross", 2023);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("¿que paso ayer?", 2009);
        otraPelicula.evalua(6);
        var peliculaDeMathi = new Pelicula("El señor de los anillos", 2001);
        peliculaDeMathi.evalua(10);
        Serie casaDragon = new Serie("La casa del dragon",2022);


        List<Titulo> lista = new LinkedList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeMathi);
        lista.add(casaDragon);

        System.out.println(lista);

        //casteo
        //update: el casteo ya no es necesario pq series añadio un metodo toString
//        for (Titulo item: lista) {
//            System.out.println(item.getNombre());
//            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2){
//                System.out.println(pelicula.getClasificacion());
//            }
//        }

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penelope Cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Ricardo Darin");
        System.out.println("Lista de Artistas NO ordenadas: " + listaDeArtistas);

        Collections.sort(listaDeArtistas);
        System.out.println("Lista de Artistas ordenadas: " + listaDeArtistas);

        Collections.sort(lista);
        System.out.println("Lista de Peliculas: " + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaLanzamiento));
        System.out.println("Lista ordenada por fecha de lanzamiento: " + lista);
    }


}
