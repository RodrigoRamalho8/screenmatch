package screenmatch.backend.util;

import java.util.regex.Pattern;

public class ValidadorCpf {
    public boolean EhValido(String cpf) throws Exception {
        try {
            if(cpf.length() != 11 ) return false;
            if (cpf.matches(".*[a-zA-Z].*")) return false;
            String cpfFormatado = this.FormataCpf(cpf);
            if (cpfFormatado.matches("(\\d)\\1{10}")) return false;
            if(Character.getNumericValue((int)cpf.toCharArray()[9]) != this.CalculaPrimeiroDigito(cpfFormatado)) return false;
            return Character.getNumericValue((int)cpf.toCharArray()[10]) == this.CalculaSegundoDigito(cpfFormatado);
        }catch (Exception except) {
            throw new Exception("CPF inválido");
        }
    }

    public String FormataCpf(String cpf){
        return cpf.replaceAll("[^0-9]", "");
    }

    public int CalculaPrimeiroDigito(String cpf){
        int n = 0;
        for(int i = 0; i <= (cpf.length() - 2); i++){
            n += (Character.getNumericValue(cpf.charAt(i)) * (10 - i));
        }
        int resto = n % 11;
        return (resto < 2 ? 0 : 11-resto );
    }

    public int CalculaSegundoDigito(String cpf){
        int n = 0;
        for(int i = 0; i <= (cpf.length() - 1); i++){
            n += (Character.getNumericValue(cpf.charAt(i)) * (cpf.length() - i));
        }
        int resto = n % 11;
        return (resto  > 2) ? 0 : 11 - resto;
    }
}
