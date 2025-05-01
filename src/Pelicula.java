public class Pelicula {
    public String titulo;
    int fechaLanzamiento;
    int duracionMinutos;
    boolean incluidoEnPlan;
    double sumaEvaluaciones;
    int totalDeEvaluaciones;

    void muestraFichaTecnica(){
        System.out.println("\n==================================================================\n");
        System.out.println("EL nombre de la pelicula es: " + titulo + "\nSu fecha de lanzamiento es: " + fechaLanzamiento + "\nY cuenta con una duración de: " + duracionMinutos + " minutos.");
    }

    void evalua(double nota){
        sumaEvaluaciones += nota;
        totalDeEvaluaciones++;
    }

    double calculaMedia(){
        return sumaEvaluaciones / totalDeEvaluaciones;
    }
}
