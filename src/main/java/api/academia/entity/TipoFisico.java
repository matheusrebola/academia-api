package api.academia.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="tb_tipo_fisico")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TipoFisico {
	@Id
	@GeneratedValue
	@Column(name="cd_tipo_fisico")
	private UUID id;
	
	@OneToOne
	@Column(name="fk_aluno")
	private Aluno aluno;
	
	@OneToOne
	@Column(name="fk_pretencao")
	private Pretencao pretencao;
	
	@Column(name="vl_ativo")
	private boolean ativo;
}
