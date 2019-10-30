package br.com.fiap.faculdade.Service.impl;

import br.com.fiap.faculdade.DTO.AlunoDTO;
import br.com.fiap.faculdade.DTO.CreateAlunoDTO;
import br.com.fiap.faculdade.DTO.SimpleAlunoDTO;
import br.com.fiap.faculdade.Repository.AlunoRepository;
import br.com.fiap.faculdade.Service.AlunoService;
import br.com.fiap.faculdade.entity.Aluno;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

public class AlunoServiceImpl implements AlunoService {

    @Autowired
    private AlunoRepository repository;

    @Override
    public List<SimpleAlunoDTO> getAlunoList(String name) {
        List<Aluno> alunoList = repository.findAll();
        return alunoList.stream()
                .filter(aluno -> name == null || aluno.getName().startsWith(name))
                .map(SimpleAlunoDTO::new)
                .collect(Collectors.toList());
    }

    @Override
    public AlunoDTO getAlunoById(Integer alunoId) {
        Aluno aluno = findAlunoById(alunoId);
        return new AlunoDTO(aluno);
    }

    @Override
    public AlunoDTO insertAluno(CreateAlunoDTO createAlunoDTO) {
        Aluno aluno = new Aluno();
        aluno.setName(createAlunoDTO.getName());
        aluno.setDtofbth(createAlunoDTO.getDtofbth());
        Aluno savedAluno = repository.save(aluno);
        return new AlunoDTO(savedAluno);
    }

    @Override
    public AlunoDTO updateAluno(Integer alunoId, CreateAlunoDTO createAlunoDTO) {
        Aluno aluno = findAlunoById(alunoId);
        BeanUtils.copyProperties(createAlunoDTO, aluno);
        Aluno updatedAluno = repository.save(aluno);
        return new AlunoDTO(updatedAluno);
    }

    @Override
    public void deleteAluno(Integer alunoId) {
        repository.deleteById(alunoId);

    }
    private Aluno findAlunoById(Integer alunoId){
        return repository.findById(alunoId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
}
