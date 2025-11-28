package screenmatch.backend.calculos;
import screenmatch.backend.modelos.conteudos.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public int getTempoTotal(){
        return tempoTotal;
    }

    public void Inclui(Titulo t){
        this.tempoTotal += t.getDuracaoEmMinutos();
    }

}