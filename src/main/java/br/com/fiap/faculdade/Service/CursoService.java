package br.com.fiap.faculdade.Service;

import br.com.fiap.faculdade.DTO.*;

import java.util.List;

public interface CursoService {
    CursoDTO addCurso(Integer faculdadeId, CreateCursoDTO createCursoDTO);

    void delete(Integer faculdadeId, Integer cursoId);

}
