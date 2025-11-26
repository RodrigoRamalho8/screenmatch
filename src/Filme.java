public class Filme {
    String _nome;
    int _anoDeLancamento;
    boolean _incluidoNoPlano;
    double _somaDasAvaliacoes;
    int _totalDeAvaliacoes;
    int _duracaoEmMinutos;

    public Filme(String nome, int anoDeLancamento, boolean incluidoNoPlano,  int duracaoEmMinutos){
        this._nome = nome;
        this._anoDeLancamento = anoDeLancamento;
        this._incluidoNoPlano = incluidoNoPlano;
        this._duracaoEmMinutos = duracaoEmMinutos;
    }

    void ExibeFichaTecnica(){
        System.out.println("Nome do filme: " + this._nome);
        System.out.println("Ano de lançamento: " + this._anoDeLancamento);
    }

    void Avalia(double nota){
        this._somaDasAvaliacoes += nota;
        this._totalDeAvaliacoes++;
    }

    double ObtemMedia(){
        return this._somaDasAvaliacoes / this._totalDeAvaliacoes;
    }
}
