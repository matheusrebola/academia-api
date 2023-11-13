package api.academia.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="tb_exercicio")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Exercicio {
	@Id
	@GeneratedValue
	@Column(name="cd_exercicio")
	private UUID id;
	
	@Column(name="nm_nome_exercicio")
	private String nome;
	
	@Column(name="vl_repeticoes")
	private int numeroRepeticoes;
	
	@ManyToOne
	@Column(name="tb_aluno_cd_aluno")
	private Aluno aluno;
	
	@OneToOne
	@Column(name="tb_execucao_cd_execucao")
	private Execucao execucao;
	
	@ManyToOne
	@Column(name="tb_aparelho_cd_aparelho")
	private Aparelho aparelho;
	
	@OneToMany
	@Column(name="fk_musculo")
	private Musculo musculo;
	
	@Column(name="vl_ativo")
	private boolean ativo;
}
