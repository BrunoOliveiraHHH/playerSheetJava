package com.ficha.rpg.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_classe")
public class Classe {
	
	@Id
	@Column(name="id_classe")
	private Integer id;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="dado_de_vida")
	private DadoDeVida dadoDeVida;

}
