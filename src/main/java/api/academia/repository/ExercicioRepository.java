package api.academia.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.academia.entity.Exercicio;

@Repository
public interface ExercicioRepository extends JpaRepository<Exercicio, UUID>{

}
