package api.academia.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.academia.entity.Execucao;

@Repository
public interface ExecucaoRepository extends JpaRepository<Execucao, UUID> {

}
