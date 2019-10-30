package br.com.fiap.faculdade.Repository;


import br.com.fiap.faculdade.entity.Faculdade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FaculdadeRepository extends JpaRepository<Faculdade, Integer> {
}
