package api.academia.entity;

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
@Table(name="tb_musculo")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Musculo {
	@Id
	@GeneratedValue
	@Column(name="cd_musculo")
	private UUID id;
	
	@Column(name="nm_nome_musculo")
	private String nomeMusculo;
	
	@Column(name="nm_grupo_muscular")
	private String grupoMuscular;
	
	@Column(name="nm_beneficio")
	private String beneficio;
	
	@ManyToOne
	@Column(name="tb_exercicio_cd_exercicio")
	private Exercicio exercicio;
	
	@ManyToOne
	@Column(name="tb_aparelho_cd_aparelho")
	private Aparelho aparelho;
	
	@Column(name="vl_ativo")
	private boolean ativo;
}
