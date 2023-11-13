package api.academia.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

import api.academia.entity.Frequencia;

public interface FrequenciaRepository extends JpaRepository<Frequencia, UUID>{

}
