import backend.modelos.usuarios.Pessoa;

void main() {


    try{
        Pessoa rodrigo = new Pessoa();
        rodrigo.setCpf("52998224725"); // Cpf aleatorio
        rodrigo.setNome("Rodrigo");
        rodrigo.setApelido("Rodinho");
        rodrigo.setEmail("rodrigogarcia.ramalho@gmail.com");
        rodrigo.setDtCadastro(LocalDate.now());
        rodrigo.setDtNascimento(LocalDate.of(2001, 5, 8));
        rodrigo.setTipoUsuario(2);

        rodrigo.getPessoa();

    } catch (Exception e) {
        System.out.println(e.getMessage());
    }

}