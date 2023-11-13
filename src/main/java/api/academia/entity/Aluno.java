package api.academia.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="tb_aluno")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Aluno {
	@Id
	@GeneratedValue
	@Column(name="cd_aluno")
	private UUID id;
	
	@Column(name="nm_nome_aluno",nullable=false)
	private String nome;
	
	@Column(name="nm_sobrenome_aluno",nullable=false)
	private String sobrenome;
	
	@OneToMany
	@Column(name="tb_tipo_fisico_cd_tipo_fisico")
	private TipoFisico tipoFisico;
	
	@OneToOne
	@Column(name="tb_tipo_fisico_cd_tipo_fisico")
	private Exercicio exercicio;
	
	@OneToMany
	@Column(name="tb_tipo_fisico_cd_tipo_fisico")
	private Contato contato;
	
	@OneToMany
	@Column(name="tb_tipo_fisico_cd_tipo_fisico")
	private Documento documento;
	
	@OneToMany
	@Column(name="tb_tipo_fisico_cd_tipo_fisico")
	private Frequencia frequencia;
	
	@Column(name="vl_ativo")
	private boolean ativo;
}
