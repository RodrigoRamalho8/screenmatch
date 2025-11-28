package backend.modelos.conteudos;
import java.util.List;

public class Temporada extends Serie{
    private Serie Serie;
    private int QuantidadeDeEpisodios;
    private List<Episodio> Episodios;
    private int DuracaoEmMinutos;
    private int Numero;
    private String Titulo;


    public Serie getSerie() {
        return Serie;
    }

    public void setSerie(Serie serie) {
        Serie = serie;
    }

    public int getQuantidadeDeEpisodios() {
        return QuantidadeDeEpisodios;
    }

    public void setQuantidadeDeEpisodios(int quantidadeDeEpisodios) {
        QuantidadeDeEpisodios = quantidadeDeEpisodios;
    }

    public List<Episodio> getEpisodios() {
        return Episodios;
    }

    public void setEpisodios(List<Episodio> episodios) {
        Episodios = episodios;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return DuracaoEmMinutos;
    }

    @Override
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        DuracaoEmMinutos = duracaoEmMinutos;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }
}
