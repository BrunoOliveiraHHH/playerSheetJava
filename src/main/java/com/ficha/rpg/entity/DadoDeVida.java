package com.ficha.rpg.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_dado_de_vida")
public class DadoDeVida {
	
	@Id
	@Column(name="id_dado_vida")
	private Integer id;
	
	@Column(name="dado_de_vida")
	private String dadoDeVida;
	
	@Column(name="media_dado_vida")
	private String mediaDadoDeVida;

}
