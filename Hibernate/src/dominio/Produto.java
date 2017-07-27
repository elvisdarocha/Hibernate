package dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author elvisrocha
 *
 */
@Entity
public class Produto {

	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private int quantidade;
	
	public Produto(){
		
	}
	
	public Produto(String nome, int quantidade){
		this.nome = nome;
		this.quantidade = quantidade;
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

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", quantidade=" + quantidade + "]";
	}
	
}
