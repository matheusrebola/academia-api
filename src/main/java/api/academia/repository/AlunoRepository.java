package api.academia.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.academia.entity.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno,UUID> {

}
