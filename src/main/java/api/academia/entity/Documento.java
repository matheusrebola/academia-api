package api.academia.entity;

import java.util.UUID;

import api.academia.entity.enumeradores.TipoDocumento;
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
@Table(name="tb_documento")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Documento {
	@Id
	@GeneratedValue
	@Column(name="cd_documento")
	private UUID id;
	
	@Enumerated(EnumType.STRING)
	@Column(name="en_tipo_documento")
	private TipoDocumento tipoDocumento;
	
	@Column(name="nm_numero_documento")
	private String numeroDocumento;
	
	@ManyToOne
	@Column(name="tb_aluno_cd_aluno")
	private Aluno aluno;
	
	@Column(name="vl_ativo")
	private boolean ativo;
}
