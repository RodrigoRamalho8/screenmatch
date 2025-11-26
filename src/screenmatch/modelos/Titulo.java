package screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

//    public Titulo(String nome, int anoDeLancamento, boolean incluidoNoPlano,  int duracaoEmMinutos){
//        this.nome = nome;
//        this.anoDeLancamento = anoDeLancamento;
//        this.incluidoNoPlano = incluidoNoPlano;
//        this.duracaoEmMinutos = duracaoEmMinutos;
//    }

    // <editor-fold desc="Getters & Setters">

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }


    // </editor-fold>

    // <editor-fold desc="Métodos">
    public void ExibeFichaTecnica() {
        System.out.println("Nome do título: " +nome);
        System.out.println("Ano de lançamento: " +anoDeLancamento);
        System.out.println("Duração em minutos: " +duracaoEmMinutos);
        System.out.println("Incluído no plano: " +incluidoNoPlano);
    }

    public void Avalia(double nota){
        this.somaDasAvaliacoes += nota;
        this.totalDeAvaliacoes++;
    }

    public double ObtemMedia(){
        return this.somaDasAvaliacoes / this.totalDeAvaliacoes;
    }
    // </editor-fold>
}
