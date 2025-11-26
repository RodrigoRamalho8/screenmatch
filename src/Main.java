import screenmatch.calculos.CalculadoraDeTempo;
import screenmatch.modelos.Filme;

void main() {
    Filme filme1 = new Filme();

    filme1.setNome("The Matrix");
    filme1.setAnoDeLancamento(1999);
    filme1.setDuracaoEmMinutos(135);
    filme1.setIncluidoNoPlano(true);

    filme1.ExibeFichaTecnica();
    filme1.Avalia(9);
    filme1.Avalia(8);
    filme1.Avalia(9);

    System.out.println("Média de avaliações do filme: " +filme1.ObtemMedia());

    Filme filme2 = new Filme();
    filme2.setNome("Inception");
    filme2.setAnoDeLancamento(2010);
    filme2.setDuracaoEmMinutos(148);
    filme2.setIncluidoNoPlano(true);

    Filme filme3 = new Filme();
    filme3.setNome("Interstellar");
    filme3.setAnoDeLancamento(2014);
    filme3.setDuracaoEmMinutos(169);
    filme3.setIncluidoNoPlano(true);

    Filme filme4 = new Filme();
    filme4.setNome("The Dark Knight");
    filme4.setAnoDeLancamento(2008);
    filme4.setDuracaoEmMinutos(152);
    filme4.setIncluidoNoPlano(false);

    Filme filme5 = new Filme();
    filme5.setNome("Pulp Fiction");
    filme5.setAnoDeLancamento(1994);
    filme5.setDuracaoEmMinutos(154);
    filme5.setIncluidoNoPlano(true);

    Filme filme6 = new Filme();
    filme6.setNome("Fight Club");
    filme6.setAnoDeLancamento(1999);
    filme6.setDuracaoEmMinutos(139);
    filme6.setIncluidoNoPlano(false);

    Filme filme7 = new Filme();
    filme7.setNome("Forrest Gump");
    filme7.setAnoDeLancamento(1994);
    filme7.setDuracaoEmMinutos(142);
    filme7.setIncluidoNoPlano(true);

    Filme filme8 = new Filme();
    filme8.setNome("The Shawshank Redemption");
    filme8.setAnoDeLancamento(1994);
    filme8.setDuracaoEmMinutos(142);
    filme8.setIncluidoNoPlano(true);

    Filme filme9 = new Filme();
    filme9.setNome("Gladiator");
    filme9.setAnoDeLancamento(2000);
    filme9.setDuracaoEmMinutos(155);
    filme9.setIncluidoNoPlano(false);

    Filme filme10 = new Filme();
    filme10.setNome("The Godfather");
    filme10.setAnoDeLancamento(1972);
    filme10.setDuracaoEmMinutos(175);
    filme10.setIncluidoNoPlano(true);

    CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();

    calculadoraDeTempo.Inclui(filme1);
    calculadoraDeTempo.Inclui(filme2);
    calculadoraDeTempo.Inclui(filme4);
    calculadoraDeTempo.Inclui(filme10);
    calculadoraDeTempo.Inclui(filme7);

    System.out.println(calculadoraDeTempo.getTempoTotal());


}