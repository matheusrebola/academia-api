package api.academia.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="tb_dieta")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Dieta {
	@Id
	@GeneratedValue
	@Column(name="cd_aluno")
	private UUID id;
	
	private String linkDieta;
}
