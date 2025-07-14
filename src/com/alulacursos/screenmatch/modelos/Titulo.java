package com.alulacursos.screenmatch.modelos;

import com.alulacursos.screenmatch.excepsion.ErrorDuracionException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{


    private String nombre;
    private int fechaLanzamiento;
    private int duracionMinutos;
    private boolean incluidoEnPlan;
    private double sumaEvaluaciones;
    private int totalDeEvaluaciones;

    public Titulo(String nombre, int fechaLanzamiento) {
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public Titulo(TituloOmdb miTituloOmdb){
        this.nombre = miTituloOmdb.title();
        this.fechaLanzamiento = Integer.valueOf(miTituloOmdb.year());
        if (miTituloOmdb.runtime().contains("N/A")){
          throw new ErrorDuracionException("No pude convertir la duracion" +
                  ", porque contiene un N/A");
        };
        this.duracionMinutos = Integer.valueOf(
                miTituloOmdb.runtime().substring(0,3).replace(" ", "")
        );
    }

    public String getNombre() {
        return nombre;
    }

    public int getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public boolean isIncluidoEnPlan() {
        return incluidoEnPlan;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaLanzamiento(int fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public void setIncluidoEnPlan(boolean incluidoEnPlan) {
        this.incluidoEnPlan = incluidoEnPlan;
    }

    public int getTotalDeEvaluaciones(){
        return totalDeEvaluaciones;
    }

    public void muestraFichaTecnica(){
        System.out.println("\n==================================================================\n");
        System.out.println("EL nombre de la pelicula es: " + nombre + "\nSu fecha de lanzamiento es: " + fechaLanzamiento + "\nY cuenta con una duración de: " + getDuracionMinutos() + " minutos.");
    }

    public void evalua(double nota){
        sumaEvaluaciones += nota;
        totalDeEvaluaciones++;
    }

    public double calculaMedia(){
        return sumaEvaluaciones / totalDeEvaluaciones;
    }

    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }

    @Override
    public String toString() {
        return "(nombre: " + nombre +
                "\nfechaLanzamiento: " + fechaLanzamiento +
                "\nduración en minutos: " + duracionMinutos + " min" + ")\n";
    }
}
