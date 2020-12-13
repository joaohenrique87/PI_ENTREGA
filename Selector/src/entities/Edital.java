package entities;

import java.util.ArrayList;
import java.util.List;

public class Edital {

	private int id;
	private String lotacao;
	private String cargo;
	
	private Instituicao instituicao;
	
	private List<Candidato> candidatos = new ArrayList<>();
	
	public Edital() {
	}
	
	public Edital(int id, String lotacao, String cargo, Instituicao instituicao) {
		super();
		this.id = id;
		this.lotacao = lotacao;
		this.cargo = cargo;
		this.instituicao = instituicao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLotacao() {
		return lotacao;
	}

	public void setLotacao(String lotacao) {
		this.lotacao = lotacao;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public Instituicao getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(Instituicao instituicao) {
		this.instituicao = instituicao;
	}

	public List<Candidato> getCandidatos() {
		return candidatos;
	}
	
	public void addCandidato(Candidato candidato) {
		candidatos.add(candidato);
	}
	
	public void removeCandidato(Candidato candidato) {
		candidatos.remove(candidato);
	}

	@Override
	public String toString() {
		return " EDITAL " + id +"\n"
				+ "Lotação: " + lotacao + "\n"
				+ "Cargo: " + cargo + "\n"
				+"\n INSTUTUIÇÃO \n"
				+ instituicao 				
				+ "\n CANDIDATOS \n"
				+ candidatos + "\n";
				
	}
	
	
}
