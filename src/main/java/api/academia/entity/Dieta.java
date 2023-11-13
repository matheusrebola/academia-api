package api.academia.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="tb_dieta")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Dieta {
	@Id
	@GeneratedValue
	@Column(name="cd_dieta")
	private UUID id;
	
	@Column(name="nm_link_dieta")
	private String linkDieta;
	
	@Column(name="tb_pretencao_cd_pretencao")
	private Pretencao pretencao;
	
	@Column(name="tb_pretencao_tb_tipo_fisico_cd_tipo_fisico_")
	private TipoFisico tipoFisico;
	
	@Column(name="vl_ativo")
	private boolean ativo;
}
