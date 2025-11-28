package backend.modelos.conteudos;

public class Titulo {
    private String Nome;
    private int AnoDeLancamento;
    private boolean IncluidoNoPlano;
    private double SomaDasAvaliacoes;
    private int TotalDeAvaliacoes;
    private int DuracaoEmMinutos;

    public Titulo() {
    }

    // <editor-fold desc="Getters & Setters">

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public int getAnoDeLancamento() {
        return AnoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.AnoDeLancamento = anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return IncluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.IncluidoNoPlano = incluidoNoPlano;
    }

    public int getTotalDeAvaliacoes() {
        return TotalDeAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return DuracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.DuracaoEmMinutos = duracaoEmMinutos;
    }


    // </editor-fold>

    // <editor-fold desc="Métodos">
    public void ExibeFichaTecnica() {
        System.out.println("Nome do título: " + Nome);
        System.out.println("Ano de lançamento: " + AnoDeLancamento);
        System.out.println("Duração em minutos: " + DuracaoEmMinutos);
        System.out.println("Incluído no plano: " + IncluidoNoPlano);
    }

    public void Avalia(double nota){
        this.SomaDasAvaliacoes += nota;
        this.TotalDeAvaliacoes++;
    }

    public double getMedia(){
        return this.SomaDasAvaliacoes / this.TotalDeAvaliacoes;
    }
    // </editor-fold>
}
