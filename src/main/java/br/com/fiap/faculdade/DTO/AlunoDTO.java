package br.com.fiap.faculdade.DTO;

import br.com.fiap.faculdade.entity.Aluno;
import br.com.fiap.faculdade.entity.Curso;
import br.com.fiap.faculdade.entity.Faculdade;


import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class AlunoDTO {
    private Integer id;
    private String name;
    private LocalDate dtofbth;
    private Faculdade faculdade;
    private List<CursoDTO> cursoList;

    public AlunoDTO(Aluno aluno ){
        this.id = aluno.getId();
        this.name = aluno.getName();
        this.dtofbth = aluno.getDtofbth();
        this.faculdade = aluno.getFaculdade();
        this.cursoList = aluno.getCursos().stream().map(CursoDTO:: new).collect(Collectors.toList());
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDtofbth(LocalDate dtofbth) {
        this.dtofbth = dtofbth;
    }

    public void setFaculdade(Faculdade faculdade) {
        this.faculdade = faculdade;
    }

    public void setCursoList(List<CursoDTO> cursoList) {
        this.cursoList = cursoList;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDtofbth() {
        return dtofbth;
    }

    public Faculdade getFaculdade() {
        return faculdade;
    }

    public List<CursoDTO> getCursoList() {
        return cursoList;
    }
}
