import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormularioCadastroPessoaComponent } from './formulario-cadastro-pessoa.component';

describe('FormularioCadastroPessoaComponent', () => {
  let component: FormularioCadastroPessoaComponent;
  let fixture: ComponentFixture<FormularioCadastroPessoaComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [FormularioCadastroPessoaComponent]
    });
    fixture = TestBed.createComponent(FormularioCadastroPessoaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
