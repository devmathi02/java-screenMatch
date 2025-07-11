package com.alulacursos.screenmatch.principal;

import com.alulacursos.screenmatch.excepsion.ErrorDuracionException;
import com.alulacursos.screenmatch.modelos.Titulo;
import com.alulacursos.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalConBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite el nombre de una pelicula: ");
        var busqueda = teclado.nextLine();

        String direccion = "https://www.omdbapi.com/?t=" +
                busqueda.replace(" ", "+") +
                "&apikey=348560d";

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());


            String json = response.body();
            System.out.println(json);

            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
            TituloOmdb miTituloOmdb = gson.fromJson(json, TituloOmdb.class);
            System.out.println(miTituloOmdb);

            Titulo miTitulo = new Titulo(miTituloOmdb);
            System.out.println("Datos del titulo: " + miTitulo);

            FileWriter escritura  = new FileWriter("peliculas.txt");
            escritura.write(miTitulo.toString());
            escritura.close();
        } catch (NumberFormatException e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error en la URL, verifique la dirección.");
        } catch (ErrorDuracionException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Finalizo la ejecucion del programa");
        //TO-DO: corregir error
    }
}
