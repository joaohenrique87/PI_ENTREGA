package entities;

import java.util.ArrayList;
import java.util.List;

public class Candidato {

	private int id;
	private String nome;
	private String cpf;
	private String di;
	private String nacionalidade;
	private String sexo;
	private String raca;
	private String estadoCivil;
	private String telefone;
	private String celular;
	private String profissao;
	private String nascimento;
	private String email;
	private String senha;
	
	private Endereco endereco;
	
	private List<Edital> editais = new ArrayList<>();
	
	public Candidato() {
	}

	public Candidato(int id, String nome, String cpf, String di, String nacionalidade, String sexo, String raca,
			String estadoCivil, String telefone, String celular, String profissao, String nascimento,String email,String senha, 
			Endereco endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.di = di;
		this.nacionalidade = nacionalidade;
		this.sexo = sexo;
		this.raca = raca;
		this.estadoCivil = estadoCivil;
		this.telefone = telefone;
		this.celular = celular;
		this.profissao = profissao;
		this.nascimento = nascimento;
		this.email = email;
		this.senha = senha;
		this.endereco = endereco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return di;
	}

	public void setRg(String di) {
		this.di = di;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Edital> getEditais() {
		return editais;
	}
	
	public void addEdital(Edital edital) {
		editais.add(edital);
	}
	
	public void removeEdital(Edital edital) {
		editais.remove(edital);
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\n"
				+ "CPF: " + cpf + "\n"
				+ "DI: " + di + "\n"
				+ "Nacionalidade: " + nacionalidade + "\n"
				+ "Sexo: " + sexo + "\n"
				+ "Raca: " + raca + "\n"
				+ "Estado civil: " + estadoCivil + "\n"
				+ "Telefone: " + telefone + "\n"
				+ "Celular: " + celular + "\n"
				+ "Profissao: " + profissao + "\n"
				+ "Data de Nascimento: " + nascimento + "\n"
				+ "E-mail: " + email + "\n"
				+ "Senha: " + senha + "\n"
				+"\n ENDEREÇO \n"
				+ endereco + "\n";
	}
	
}
