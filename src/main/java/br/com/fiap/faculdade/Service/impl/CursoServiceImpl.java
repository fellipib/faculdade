package br.com.fiap.faculdade.Service.impl;

import br.com.fiap.faculdade.DTO.CreateCursoDTO;
import br.com.fiap.faculdade.DTO.CursoDTO;
import br.com.fiap.faculdade.Repository.CursoRepository;
import br.com.fiap.faculdade.Service.CursoService;
import br.com.fiap.faculdade.entity.Curso;
import br.com.fiap.faculdade.entity.Faculdade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class CursoServiceImpl implements CursoService {
    @Autowired
    private CursoRepository cursoRepository;

    @Override
    public CursoDTO addCurso(Integer faculdadeId, CreateCursoDTO createCursoDTO) {
        Curso curso = new Curso();
        curso.setName(createCursoDTO.getName());

        Curso savedCurso = cursoRepository.save(curso);

        return new CursoDTO(savedCurso);
    }

    @Override
    public void delete(Integer faculdadeId, Integer cursoId) {
        Curso curso = cursoRepository.findById(faculdadeId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));



        cursoRepository.delete(curso);

    }
}
