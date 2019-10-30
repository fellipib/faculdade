package br.com.fiap.faculdade.DTO;

import br.com.fiap.faculdade.entity.Aluno;

public class SimpleAlunoDTO {

    private Integer id;
    private String name;

    public SimpleAlunoDTO(){

    }
    public SimpleAlunoDTO(Aluno aluno){
        this.id = aluno.getId();
        this.name = aluno.getName();
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
