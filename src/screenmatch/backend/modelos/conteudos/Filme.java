package screenmatch.backend.modelos.conteudos;
import screenmatch.backend.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme() {
    }

    // <editor-fold desc="Getters & Setters>"
    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    // </editor-fold>

    @Override
    public int getClassificacao() {
        return (int) getMedia() / 2;
    }
}
