package br.com.fiap.faculdade.Service;

import br.com.fiap.faculdade.DTO.CreateFaculdadeDTO;
import br.com.fiap.faculdade.DTO.CursoDTO;
import br.com.fiap.faculdade.DTO.FaculdadeDTO;

public interface FaculdadeService {
    FaculdadeDTO addFaculdade(Integer faculdadeId, CreateFaculdadeDTO createCharacterDTO);

    void delete(Integer faculdadeId);
}
