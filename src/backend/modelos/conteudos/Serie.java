package backend.modelos.conteudos;
import java.util.List;

public class Serie extends Titulo{
    private int QuantidadeDeTemporadas;
    private List<Temporada> Temporadas;

    private int Numero;

    //<editor-fold desc="Getters & Setters>"
    public int getQuantidadeDeTemporadas() {
        return QuantidadeDeTemporadas;
    }

    public void setQuantidadeDeTemporadas(int quantidadeDeTemporadas) {
        QuantidadeDeTemporadas = quantidadeDeTemporadas;
    }

    public List<Temporada> getTemporadas() {
        return Temporadas;
    }

    public void setTemporadas(List<Temporada> temporadas) {
        Temporadas = temporadas;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return this.Temporadas
                .stream()
                .mapToInt(Temporada::getDuracaoEmMinutos)
                .sum();
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

    //</editor-fold>

    public void AddTemporada(Temporada temporada){
        this.Temporadas.addLast(temporada);
        this.QuantidadeDeTemporadas++;
    }

    public void AddTemporada(Temporada temporada, int index){
        this.Temporadas.add(index-1, temporada);
        this.QuantidadeDeTemporadas++;
    }

    public void RemoveTemporada(Temporada temporada){
        this.Temporadas.remove(temporada);
        this.QuantidadeDeTemporadas--;
    }

    public void RemoveTemporada (int index){
        this.Temporadas.remove(index);
        this.QuantidadeDeTemporadas--;
    }

}