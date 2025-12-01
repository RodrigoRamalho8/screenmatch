package backend.util;

public class ValidadorCpf {
    public boolean EhValido(String cpf){
        if(cpf.length() != 11 ) return false;
        String cpfFormatado = this.FormataCpf(cpf);
        if (cpf.matches(".*[a-zA-Z].*")) return false;
        if (cpfFormatado.matches("(\\d)\\1{10}")) return false;
        return Character.getNumericValue((int)cpf.charAt(9)) == this.CalculaPrimeiroDigito(cpfFormatado) &&
                Character.getNumericValue((int)cpf.charAt(10)) == this.CalculaSegundoDigito(cpfFormatado);
    }

    public String FormataCpf(String cpf){
        return cpf.replaceAll("[^0-9]", "");
    }

    public int CalculaPrimeiroDigito(String cpf){
        int n = 0;
        for(int i = 0; i <9; i++){
            n += (Character.getNumericValue(cpf.charAt(i)) * (10 - i));
        }
        int resto = n % 11;
        return (resto < 2 ? 0 : 11-resto );
    }

    public int CalculaSegundoDigito(String cpf){
        int n = 0;
        for(int i = 0; i < 10; i++){
            n += (Character.getNumericValue(cpf.charAt(i)) * (cpf.length() - i));
        }
        int resto = n % 11;
        return (resto  < 2) ? 0 : 11 - resto;
    }
}
