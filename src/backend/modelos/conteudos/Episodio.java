package backend.modelos.conteudos;


public class Episodio{
    private Serie Serie;
    private Temporada Temporada;
    private int Numero;
    private String Titulo;


    //<editor-fold desc="Getters & Setters">
    public Serie getSerie() {
        return Serie;
    }

    public void setSerie(Serie serie) {
        Serie = serie;
    }

    public Temporada getTemporada() {
        return Temporada;
    }

    public void setTemporada(Temporada temporada) {
        Temporada = temporada;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

//    public int getDuracaoEmMinutos() {
//        return DuracaoEmMinutos;
//    }
//
//    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
//        DuracaoEmMinutos = duracaoEmMinutos;
//    }

    //</editor-fold>
}