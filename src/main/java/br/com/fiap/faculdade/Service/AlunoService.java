package br.com.fiap.faculdade.Service;

import br.com.fiap.faculdade.DTO.AlunoDTO;
import br.com.fiap.faculdade.DTO.CreateAlunoDTO;
import br.com.fiap.faculdade.DTO.SimpleAlunoDTO;

import java.util.List;

public interface AlunoService {
    List<SimpleAlunoDTO> getAlunoList(String name);
    AlunoDTO getAlunoById(Integer gameId);
    AlunoDTO insertAluno(CreateAlunoDTO createAlunoDTO);
    AlunoDTO updateAluno(Integer alunoId, CreateAlunoDTO createAlunoDTO);
    void deleteAluno(Integer alunoId);
}
