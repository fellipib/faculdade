package br.com.fiap.faculdade.Controller;


import br.com.fiap.faculdade.DTO.AlunoDTO;
import br.com.fiap.faculdade.DTO.CreateAlunoDTO;
import br.com.fiap.faculdade.DTO.SimpleAlunoDTO;
import br.com.fiap.faculdade.Service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("alunos")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;


    @GetMapping
    public List<SimpleAlunoDTO> getAlunoList(@RequestParam(required = false) String name) {
        return alunoService.getAlunoList(name);
    }
    @GetMapping("{alunoId}")
    public AlunoDTO getAlunoById(@PathVariable Integer alunoId){
        return alunoService.getAlunoById(alunoId);
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AlunoDTO insertGame(@RequestBody @Valid CreateAlunoDTO createAlunoDTO) {
        return alunoService.insertAluno(createAlunoDTO);
    }

    @PutMapping("{alunoId}")
    public AlunoDTO updateGame(@PathVariable Integer alunoId,
                              @RequestBody CreateAlunoDTO createAlunoDTO){
        return alunoService.updateAluno(alunoId, createAlunoDTO);
    }
    @DeleteMapping("{alunoId}")
    public void deleteAluno(@PathVariable Integer alunoId){
        alunoService.deleteAluno(alunoId);
    }




}
