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
		return "C�digo da Institui��o: " + id + "\n"
				+ "Nome da Institui��o: " + nome_instituicao + "\n"
				+ "CNPJ da Institui��o: " + cnpj + "\n";
	}	
}
