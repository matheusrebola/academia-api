package api.academia.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import api.academia.entity.Contato;

public interface ContatoRepository extends JpaRepository<Contato, UUID>{

}
