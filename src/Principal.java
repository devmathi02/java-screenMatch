import com.alulacursos.screenmatch.modelos.Pelicula;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();

        miPelicula.setTitulo("Super Mario Bross");
        miPelicula.setFechaLanzamiento(2023);
        miPelicula.setDuracionMinutos(92);
        miPelicula.setIncluidoEnPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(9.4);
        miPelicula.evalua(5.7);
        miPelicula.evalua(10.5);
        System.out.println(miPelicula.getTotalDeEvaluaciones());
        System.out.println(miPelicula.calculaMedia());












//        com.alulacursos.screenmatch.modelos.Pelicula otraPelicula = new com.alulacursos.screenmatch.modelos.Pelicula();
//        otraPelicula.titulo = "¿que paso ayer?";
//        otraPelicula.fechaLanzamiento = 2009;
//        otraPelicula.duracionMinutos = 100;
//
//        otraPelicula.muestraFichaTecnica();
    }
}
