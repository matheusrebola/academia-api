package api.academia.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.academia.entity.Aparelho;

@Repository
public interface AparelhoRepository extends JpaRepository<Aparelho, UUID> {

}
