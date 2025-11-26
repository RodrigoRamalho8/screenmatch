package screenmatch.modelos;
import screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

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
        return (int) ObtemMedia() / 2;
    }
}
