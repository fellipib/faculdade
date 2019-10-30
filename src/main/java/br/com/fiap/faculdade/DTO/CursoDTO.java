package br.com.fiap.faculdade.DTO;

import br.com.fiap.faculdade.entity.Curso;

public class CursoDTO {

    private Integer id;
    private String name;

    public CursoDTO(){

    }
    public CursoDTO(Curso curso) {
        this.id = curso.getId();
        this.name = curso.getName();

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
