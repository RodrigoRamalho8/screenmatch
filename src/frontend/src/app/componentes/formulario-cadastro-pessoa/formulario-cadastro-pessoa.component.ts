import { Component } from '@angular/core';
import { Pessoa } from 'src/app/pessoa';  

@Component({
  selector: 'formulario-cadastro-pessoa',
  templateUrl: './formulario-cadastro-pessoa.component.html',
  styleUrls: ['./formulario-cadastro-pessoa.component.css']
})
export class FormularioCadastroPessoaComponent {
  pessoa:Pessoa = {
    nome: '',
    ultimoNome: '',
    dtNascimento: undefined,
    genero: 0,
    email: '',    
    senha: ''
  }

  cadastrar(){
      console.log(this.pessoa);
  }
}
