package com.alulacursos.screenmatch.modelos;

public class Pelicula {
    private String titulo;
    private int fechaLanzamiento;
    private int duracionMinutos;
    private boolean incluidoEnPlan;
    private double sumaEvaluaciones;
    private int totalDeEvaluaciones;

    public String getTitulo() {
        return titulo;
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

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public void setFechaLanzamiento(int fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public void setIncluidoEnPlan(boolean incluidoEnPlan) {
        this.incluidoEnPlan = incluidoEnPlan;
    }


    public int getTotalDeEvaluaciones(){
        return totalDeEvaluaciones;
    }

    public void muestraFichaTecnica(){
        System.out.println("\n==================================================================\n");
        System.out.println("EL nombre de la pelicula es: " + titulo + "\nSu fecha de lanzamiento es: " + fechaLanzamiento + "\nY cuenta con una duración de: " + duracionMinutos + " minutos.");
    }

    public void evalua(double nota){
        sumaEvaluaciones += nota;
        totalDeEvaluaciones++;
    }

    public double calculaMedia(){
        return sumaEvaluaciones / totalDeEvaluaciones;
    }
}
