package pedrokussy;

public class Funcionario {
	private int id;
	private String nome;
	private String funcao;
	
	public Funcionario( String nome, String funcao) {
		this.nome = nome;
		this.funcao = funcao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFuncao() {
		return this.funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	
	
	
}
