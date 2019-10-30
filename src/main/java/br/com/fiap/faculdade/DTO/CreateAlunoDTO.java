package br.com.fiap.faculdade.DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import java.time.LocalDate;

public class CreateAlunoDTO {
    @NotBlank
    @NotNull(message = "Nome é Obrigratorio !!")
    private String name;

    @PastOrPresent
    private LocalDate dtofbth;

    public CreateAlunoDTO(){

    }

    public LocalDate getDtofbth() {
        return dtofbth;
    }

    public void setDtofbth(LocalDate dtofbth) {
        this.dtofbth = dtofbth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
