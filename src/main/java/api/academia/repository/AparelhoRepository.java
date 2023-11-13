package api.academia.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import api.academia.entity.Aparelho;

public interface AparelhoRepository extends JpaRepository<Aparelho, UUID> {

}
