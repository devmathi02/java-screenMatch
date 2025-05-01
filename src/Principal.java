public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();

        miPelicula.titulo = "Super Mario Bross";
        miPelicula.fechaLanzamiento = 2023;
        miPelicula.duracionMinutos = 92;

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(9.4);
        miPelicula.evalua(5.7);
        miPelicula.evalua(10.5);
        System.out.println(miPelicula.calculaMedia());

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.titulo = "¿que paso ayer?";
        otraPelicula.fechaLanzamiento = 2009;
        otraPelicula.duracionMinutos = 100;

        otraPelicula.muestraFichaTecnica();
    }
}
