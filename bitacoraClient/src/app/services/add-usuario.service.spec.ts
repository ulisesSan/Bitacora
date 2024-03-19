import { TestBed } from '@angular/core/testing';

import { AddUsuarioService } from './add-usuario.service';

describe('AddUsuarioService', () => {
  let service: AddUsuarioService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AddUsuarioService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
