package backend.util;

public class Formatters {
    public String FormataCpf(String cpf){
        return cpf.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
    }
}
