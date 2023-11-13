package api.academia.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

import api.academia.entity.TipoFisico;

public interface TipoFisicoRepository extends JpaRepository<TipoFisico, UUID> {

}
