package backend.modelos.usuarios;

import backend.util.ValidadorCpf;
import backend.util.ValidadorEmail;

import java.time.LocalDate;
import java.util.Date;

public class Pessoa {
    private String Cpf;
    private String Nome;
    private String UltimoNome;
    private String Apelido = null;
    private String Email;
    private LocalDate DtNascimento;
    private LocalDate DtCadastro;
    private int TipoUsuario = 2;
    private int Genero;

    public Pessoa(){

    }

    // <editor-fold desc="Getters & Setters">
    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) throws Exception{
        if(!new ValidadorCpf().EhValido(cpf)) {
            throw new Exception("CPF inválido!");
        }
        this.Cpf = cpf;
    }


    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        try{
            if(nome.matches("^[a-zA-Z]+$")){
                Nome = nome;
            }
            else{
                throw new Exception("Nome inválido");
            }
        }catch(Exception except){
            System.err.println(except.getMessage());
        }

    }

    public String getUltimoNome() {
        return UltimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        try {
            if (ultimoNome.matches("^[a-zA-Z]+$")) {
                UltimoNome = ultimoNome;
            } else {
                throw new Exception("Nome inválido");
            }
        } catch (Exception except) {
            System.err.println(except.getMessage());
        }
    }

    public String getApelido() {
        return Apelido;
    }

    public void setApelido(String apelido) {
        Apelido = apelido;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) throws Exception{
        if(!new ValidadorEmail().EhValido(email)){
            throw new Exception("Email inválido!");
        }
        Email = email;
    }

    public LocalDate getDtNascimento() {
        return DtNascimento;
    }

    public void setDtNascimento(LocalDate dtNascimento) {
        DtNascimento = dtNascimento;
    }

    public LocalDate getDtCadastro() {
        return DtCadastro;
    }

    public void setDtCadastro(LocalDate dtCadastro) {
        DtCadastro = dtCadastro;
    }

    public int getTipoUsuario() {
        return TipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        TipoUsuario = tipoUsuario;
    }

    public int getGenero() {
        return Genero;
    }

    public void setGenero(int genero) {
        Genero = genero;
    }
    //</editor-fold>

    // <editor-fold desc="Métodos">
        public void getPessoa(){
            System.out.println(
                    "Cpf: " + this.getCpf() +
                    "\nNome: " + this.getNome() +
                    "\nApelido: " + this.getApelido() +
                    "\nEmail: " + this.getEmail() +
                    "\nData de nascimento: " + this.getDtNascimento() +
                    "\nData de cadastro: " + this.getDtCadastro() +
                    "\nTipo de usuário: " + this.getTipoUsuario()
            );
        }
    // </editor-fold>
}
