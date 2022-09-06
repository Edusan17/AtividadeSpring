package com.XzGames.LojaDeGames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produto")
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
		@NotNull(message = "O atributo nome é Obrigatorio!")
		@Size(min = 2, max = 100)
		private String nome;
		
		@NotNull
		@Size(min = 4, max = 100)
		private String qualidade;
		
		@NotNull
		@Size(min = 2, max = 100)
		private String cor;
		
		@NotNull
		@Size(min = 2, max = 100)
		private String console;
		
		@NotNull
		private Long quantidade;
		
		private Double preco;
		
		@ManyToOne
		@JsonIgnoreProperties("produto")
		private Categoria categoria;

		public Categoria getCategoria() {
			return categoria;
		}

		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getQualidade() {
			return qualidade;
		}

		public void setQualidade(String qualidade) {
			this.qualidade = qualidade;
		}

		public String getCor() {
			return cor;
		}

		public void setCor(String cor) {
			this.cor = cor;
		}

		public String getConsole() {
			return console;
		}

		public void setConsole(String console) {
			this.console = console;
		}

		public Long getQuantidade() {
			return quantidade;
		}

		public void setQuantidade(Long quantidade) {
			this.quantidade = quantidade;
		}

		public Double getPreco() {
			return preco;
		}

		public void setPreco(Double preco) {
			this.preco = preco;
		}
}
