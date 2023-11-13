package api.academia.entity;

import java.util.UUID;

import api.academia.entity.enumeradores.TipoPretencao;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="tb_pretencao")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pretencao {
	@Id
	@GeneratedValue
	@Column(name="cd_pretencao")
	private UUID id;
	
	@Enumerated(EnumType.STRING)
	@Column(name="en_pretencao")
	private TipoPretencao tipoPretencao;
	
	@OneToOne
	@Column(name="fk_dieta")
	private Dieta dieta; 
	
	@OneToOne
	@Column(name="tb_tipo_fisico_cd_tipo_fisico")
	private TipoFisico tipoFisico;
	
	@Column(name="vl_ativo")
	private boolean ativo;
}
