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
@Table(name="tb_execucao")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Execucao {
	@Id
	@GeneratedValue
	@Column(name="cd_execucao")
	private UUID id;
	
	@Column(name="nm_link_execucao")
	private String linkExecucao;
	
	@OneToOne
	@Column(name="fk_exercicio")
	private Exercicio exercicio;
	
	@Column(name="vl_ativo")
	private boolean ativo;
}
