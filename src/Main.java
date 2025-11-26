void main() {
    Filme filme1 = new Filme(
            "Top Gun: Maverick",
            2022,
            true,
            197
    );

    filme1.ExibeFichaTecnica();
    filme1.Avalia(5);
    filme1.Avalia(8);
    filme1.Avalia(7);
    System.out.println(filme1.ObtemMedia());
}
