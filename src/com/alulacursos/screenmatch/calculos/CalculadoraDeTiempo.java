package com.alulacursos.screenmatch.calculos;

import com.alulacursos.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo){
        System.out.println("Agregando duración en minutos: " + titulo);
        this.tiempoTotal += titulo.getDuracionMinutos();
    }

}
