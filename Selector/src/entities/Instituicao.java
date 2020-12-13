package entities;

public class Instituicao {

	private int id;
	private String nome_instituicao;
	private String cnpj;
	
	public Instituicao() {
	}
		
	public Instituicao(int id, String nome_instituicao, String cnpj) {
		super();
		this.id = id;
		this.nome_instituicao = nome_instituicao;
		this.cnpj = cnpj;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome_instituicao() {
		return nome_instituicao;
	}

	public void setNome_instituicao(String nome_instituicao) {
		this.nome_instituicao = nome_instituicao;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "Código da Instituição: " + id + "\n"
				+ "Nome da Instituição: " + nome_instituicao + "\n"
				+ "CNPJ da Instituição: " + cnpj + "\n";
	}	
}
