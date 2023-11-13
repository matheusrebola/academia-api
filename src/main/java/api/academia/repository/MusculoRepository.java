package api.academia.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

import api.academia.entity.Musculo;

public interface MusculoRepository extends JpaRepository<Musculo, UUID>{

}
