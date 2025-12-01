import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormularioCadastroPessoaComponent } from './componentes/formulario-cadastro-pessoa/formulario-cadastro-pessoa.component';

@NgModule({
  declarations: [
    AppComponent,
    FormularioCadastroPessoaComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
