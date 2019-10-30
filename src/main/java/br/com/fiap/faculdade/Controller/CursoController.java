package br.com.fiap.faculdade.Controller;


import br.com.fiap.faculdade.DTO.CreateCursoDTO;
import br.com.fiap.faculdade.DTO.CursoDTO;
import br.com.fiap.faculdade.Service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("cursos")
public class CursoController {
    @Autowired
    private CursoService cursoService;


    @PostMapping
    public CursoDTO addCurso(@PathVariable Integer cursoId,
                                 @RequestBody CreateCursoDTO createCursoDTO) {
        return cursoService.addCurso(cursoId, createCursoDTO);
    }

    @DeleteMapping("{characterId}")
    public void deleteCurso(@PathVariable Integer cursoId,
                                @PathVariable Integer faculdadeId) {
        cursoService.delete(cursoId, faculdadeId);
    }




}
