package br.com.fiap.faculdade.DTO;

import br.com.fiap.faculdade.entity.Faculdade;

import java.time.LocalDate;

public class CreateFaculdadeDTO {

    private String name;

    private LocalDate foundationDate;

    public CreateFaculdadeDTO(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getFoundationDate() {
        return foundationDate;
    }

    public void setFoundationDate(LocalDate foundationDate) {
        this.foundationDate = foundationDate;
    }
}
