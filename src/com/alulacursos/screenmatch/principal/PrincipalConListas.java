package com.alulacursos.screenmatch.principal;

import com.alulacursos.screenmatch.modelos.Pelicula;
import com.alulacursos.screenmatch.modelos.Serie;
import com.alulacursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Super Mario Bross", 2023);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("¿que paso ayer?", 2009);
        otraPelicula.evalua(6);
        var peliculaDeMathi = new Pelicula("El señor de los anillos", 2001);
        peliculaDeMathi.evalua(10);
        Serie casaDragon = new Serie("La casa del dragon",2022);


        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeMathi);
        lista.add(casaDragon);

        //casteo
        for (Titulo item: lista) {
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2){
                System.out.println(pelicula.getClasificacion());
            }

        }
    }


}
