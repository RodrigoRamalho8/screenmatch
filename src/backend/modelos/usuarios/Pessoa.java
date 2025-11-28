package backend.modelos.usuarios;

import backend.util.ValidadorCpf;

import java.util.Date;

public class Pessoa {
    private String Cpf;
    private String Nome;
    private String Apelido = null;
    private String Email;
    private Date DtNascimento;
    private Date DtCadastro;
    private int TipoUsuario = 2;

    public Pessoa(){

    }

    // <editor-fold desc="Getters & Setters">
    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
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

    public void setEmail(String email) {
        Email = email;
    }

    public Date getDtNascimento() {
        return DtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        DtNascimento = dtNascimento;
    }

    public Date getDtCadastro() {
        return DtCadastro;
    }

    public void setDtCadastro(Date dtCadastro) {
        DtCadastro = dtCadastro;
    }

    public int getTipoUsuario() {
        return TipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        TipoUsuario = tipoUsuario;
    }
    //</editor-fold>

    // <editor-fold desc="Métodos">
    public boolean CpfEhValido(String cpf){
        try {
            return new ValidadorCpf().EhValido(cpf);
        }catch (Exception except){
            System.err.println(except.getMessage());
        }
        return false;
    }
    // </editor-fold>
}
