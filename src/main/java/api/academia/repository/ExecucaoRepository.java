package api.academia.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

import api.academia.entity.Execucao;

public interface ExecucaoRepository extends JpaRepository<Execucao, UUID> {

}
