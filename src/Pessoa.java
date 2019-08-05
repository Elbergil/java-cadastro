
public class Pessoa {
      private String nome;
      private int idade;
	public Pessoa(String nome, int idade) {// métado construtor com campos
		super();
		this.nome = nome;
		this.idade = idade;
	}
	public Pessoa(String string) {//método construtor com campos sem nada
		super(); 
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
      
	

}

 