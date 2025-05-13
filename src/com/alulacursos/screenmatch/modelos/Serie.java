package com.alulacursos.screenmatch.modelos;

public class Serie extends Titulo{
    int temporadas;
    int episodeosPorTemporadas;
    int minutosPorEpisodeos;

    public Serie(String nombre, int fechaLanzamiento) {
        super(nombre, fechaLanzamiento);
    }

    @Override
    public int getDuracionMinutos() {
        return temporadas * episodeosPorTemporadas * minutosPorEpisodeos;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodeosPorTemporadas() {
        return episodeosPorTemporadas;
    }

    public void setEpisodeosPorTemporadas(int episodeosPorTemporadas) {
        this.episodeosPorTemporadas = episodeosPorTemporadas;
    }

    public int getMinutosPorEpisodeos() {
        return minutosPorEpisodeos;
    }

    public void setMinutosPorEpisodeos(int minutosPorEpisodeos) {
        this.minutosPorEpisodeos = minutosPorEpisodeos;
    }

    @Override
    public String toString() {
        return "Serie: " + this.getNombre() + " (" + this.getFechaLanzamiento() + ") ";
    }
}
