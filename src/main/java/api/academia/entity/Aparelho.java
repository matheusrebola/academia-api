package api.academia.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class Aparelho {
	@Id
	@GeneratedValue
	@Column(name="cd_aparelho")
	private UUID id;
	
	@Column(name="nm_nome_aparelho")
	private String nome;
	
	@OneToMany
	@Column(name="fk_musculo")
	private Musculo musculo;
	
	@OneToMany
	@Column(name="fk_exercicio")
	private Exercicio exercicio;
	
	@Column(name="vl_ativo")
	private boolean ativo;
}
