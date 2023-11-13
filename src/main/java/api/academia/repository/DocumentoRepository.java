package api.academia.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

import api.academia.entity.Documento;

public interface DocumentoRepository extends JpaRepository<Documento, UUID>{

}
