package br.com.fiap.faculdade.Service.impl;

import br.com.fiap.faculdade.DTO.CreateFaculdadeDTO;
import br.com.fiap.faculdade.DTO.FaculdadeDTO;
import br.com.fiap.faculdade.Repository.FaculdadeRepository;
import br.com.fiap.faculdade.Service.FaculdadeService;
import br.com.fiap.faculdade.entity.Faculdade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class FaculdadeServiceImpl implements FaculdadeService {
    @Autowired
    private FaculdadeRepository faculdadeRepository;



    @Override
    public FaculdadeDTO addFaculdade(Integer faculdadeId, CreateFaculdadeDTO createFaculdadeDTO) {
        Faculdade faculdade = new Faculdade();
        faculdade.setName(createFaculdadeDTO.getName());
        faculdade.setFoundationDate(createFaculdadeDTO.getFoundationDate());


        Faculdade savedFaculdade = faculdadeRepository.save(faculdade);

        return new FaculdadeDTO(savedFaculdade);
    }

    @Override
    public void delete(Integer faculdadeId) {
        Faculdade faculdade = faculdadeRepository.findById(faculdadeId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));



        faculdadeRepository.delete(faculdade);

    }
}
