package api.academia.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

import api.academia.entity.Pretencao;

public interface PretencaoRepository extends JpaRepository<Pretencao, UUID>{

}
