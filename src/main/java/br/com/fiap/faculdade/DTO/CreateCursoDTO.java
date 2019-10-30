package br.com.fiap.faculdade.DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CreateCursoDTO {
    @NotBlank
    @NotNull(message = "Nome é Obrigratorio !!")
    private String name;

    public CreateCursoDTO(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
