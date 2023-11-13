package api.academia.entity;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="tb_frequencia")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Frequencia {
	@Id
	@GeneratedValue
	@Column(name="cd_frequencia")
	private UUID id;
	
	@Column(name="dt_presenca")
	private LocalDateTime presenca;
	
	@ManyToOne
	@Column(name="tb_aluno_cd_aluno")
	private Aluno aluno;
	
	@Column(name="vl_ativo")
	private boolean ativo;
}
