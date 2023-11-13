package api.academia.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import api.academia.entity.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno,UUID> {

}
