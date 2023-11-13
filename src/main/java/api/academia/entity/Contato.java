package api.academia.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="tb_contato")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Contato {
	@Id
	@GeneratedValue
	@Column(name="cd_contato")
	private UUID id;
	
	@Enumerated(EnumType.STRING)
	@Column(name="en_tipo_contato", nullable=false)
	private TipoContato tipoContato;
	
	@Column(name="nm_contato", nullable=false)
	private String contato;
	
	@Column(name="tb_aluno_cd_aluno", nullable=false)
	@ManyToOne
	private Aluno aluno;
}
