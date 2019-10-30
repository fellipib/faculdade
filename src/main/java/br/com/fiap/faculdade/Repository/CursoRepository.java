package br.com.fiap.faculdade.Repository;

import br.com.fiap.faculdade.entity.Aluno;
import br.com.fiap.faculdade.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Integer> {

}
