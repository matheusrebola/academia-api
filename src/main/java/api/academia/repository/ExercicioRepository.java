package api.academia.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

import api.academia.entity.Exercicio;

public interface ExercicioRepository extends JpaRepository<Exercicio, UUID>{

}
