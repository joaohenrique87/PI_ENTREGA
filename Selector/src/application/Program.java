package application;


import entities.Candidato;
import entities.Edital;
import entities.Endereco;
import entities.Instituicao;

public class Program {

	public static void main(String[] args) {
		
	
			Edital edital1 = new Edital(20201, "Recife", "Médico",
					new Instituicao(1, "Secretaria de Saúde do Estado de Pernambuco", "108359320001-08"));
			Edital edital2 = new Edital(20202, "Recife", "Enfermeiro",
					new Instituicao(2, "Secretaria de Saúde do Estado de Pernambuco", "108359320001-08"));
			Edital edital3 = new Edital(20203, "Caruaru", "Professor",
					new Instituicao(3, "Prefeitura de Jaboatão dos Guararapes", "41033168000180"));
			
			Candidato c1 = new Candidato(1, "Maria Luiza Oliveira Calado", "123456783-34", "1234543 SDS-PE", "Brasileira",
					"F", "Branca", "Casada", "32589647", "999632145", "Médica", "07/10/1983", "mariacalado@gmail.com", "teste",
					new Endereco(1, "Rua Amapa", 30, "casa", "Centro", "52000-000", "Recife", "PE"));
			
			Candidato c2 = new Candidato(2, "Ricardo Eugênio Boechat", "632452879-15", "452896 SDS-PE", "Brasileiro",
					"M", "Negro", "Casado", "32489687", "999753621", "Médico", "15/03/1987", "ricardoboechat@gmail.com", "teste",
					new Endereco(2, "Rua Fernandes Vieira", 405, "Apto 501", "Boa Vista", "52600-030", "Recife", "PE"));
			
			Candidato c3 = new Candidato(3, "Paulo Rogério Vieira", "365986024-78", "635748 SDS-PE", "Brasileiro",
					"M", "Branco", "Solteiro", "33520678", "998765412", "Médico", "18/07/1978", "paulovieira@yahoo.com.br", "teste",
					new Endereco(3, "Av. Boa Viagem", 4321, "Apto 1105", "Boa Viagem", "54000-000", "Recife", "PE"));
			
			Candidato c4 = new Candidato(4, "Mariana da Silva Araújo", "632558974-24", "632874 SDS-PE", "Brasileira",
					"F", "Branca", "Solteira", "34589936", "986253014", "Médica", "03/05/1980", "marianaaraujo@gmail.com", "teste",
					new Endereco(4, "Av. Rui Barbosa", 54, "Apto 203", "Graças", "52360-070", "Recife", "PE"));
			
			Candidato c5 = new Candidato(5, "João Luiz de Freitas Cardoso", "856362041-88", "365148 SDS-PE", "Brasileiro",
					"F", "Pardo", "Casado", "34272021", "993658295", "Médico", "30/08/1975", "joao.cardoso@gmail.com", "teste",
					new Endereco(5, "Rua Jacobina", 434, "Apto 1004", "Bairro Bovo", "53050-040", "Olinda", "PE"));
			
			Candidato c6 = new Candidato(6, "Adriana Queiroz Malta", "365789011-36", "452369 SDS-PE", "Brasileira",
					"F", "Branca", "Solteira", "34853695", "98250203", "Enfermeira", "15/06/1990", "adrianamalta@gmail.com", "teste",
					new Endereco(6, "Rua do Amparo", 20, "casa", "Centro", "54150-020", "Olinda", "PE"));
			
			Candidato c7 = new Candidato(7, "Fernando Paiva de Medeiros", "8963214752-00", "963852 SDS-PE", "Brasileiro",
					"M", "Branco", "Casado", "37174526", "99362501", "Enfermeiro", "20/05/1993", "fernandopm@gmail.com", "teste",
					new Endereco(7, "Av. Santos Dumont", 805, "Apto 504", "Aflitos", "56300-000", "Recife", "PE"));
			
			Candidato c8 = new Candidato(8, "Marília Alcoforado Guerra", "532014896321-34", "874256 SDS-PE", "Brasileira",
					"F", "Parda", "Casada", "37256398", "96542301", "Enfermeira", "29/08/1986", "mariliaguerra@uol.com", "teste",
					new Endereco(8, "Rua Bandeira de Melo", 690, "Apto 1401", "Espinheiro", "52020-000", "Recife", "PE"));
			
			Candidato c9 = new Candidato(9, "Francisco Batista Farias", "632547899630-75", "632589 SSP-SP", "Brasileiro",
					"M", "Branco", "Casado", "33269865", "994785236", "Enfermeiro", "08/03/1997", "franciscofarias@gmail.com", "teste",
					new Endereco(9, "Av. Paulista", 482, "Apto 701", "Centro", "51478-050", "Recife", "PE"));
			
			Candidato c10 = new Candidato(10, "Maria Luiza Oliveira Calado", "123456783-34", "1234543 SDS-PE", "Brasileira",
					"F", "Branca", "Casada", "32589647", "999632145", "Enfermeira", "04/09/1990", "mariacalado@gmail.com", "teste",
					new Endereco(10, "Rua Joaquim Freitas", 30, "casa", "Centro", "52000-000", "Caruaru", "PE"));
			
			Candidato c11 = new Candidato(11, "Carlos Santiago Neto", "856320147-99", "456789 SDS-PE", "Brasileiro",
					"M", "Negro", "Solteiro", "33209696", "99024456", "Professor", "07/10/1970", "carlosneto@gmail.com", "teste",
					new Endereco(11, "Rua das Graças", 70, "Apto 803", "Graças", "55600-030", "Caruaru", "PE"));
			
			Candidato c12 = new Candidato(12, "Mauro Braga de Oliveira", "36529985-02", "365214 SDS-PE", "Brasileiro",
					"M", "Branco", "Casada", "32589647", "96584712", "Professor", "14/12/1978", "mauro.oliveira@gmail.com", "teste",
					new Endereco(12, "Av. Conselheiro Aguiar", 1402, "Apto 101", "Boa Viagem", "51200-009", "Caruaru", "PE"));
			
			Candidato c13 = new Candidato(13, "Larissa de Melo Costa", "365526987-02", "145963 SDS-PE", "Brasileira",
					"F", "Branca", "Casada", "34279632", "97893652", "Professora", "01/11/1980", "larissacosta@gmail.com", "teste",
					new Endereco(13, "Rua do Cupim", 363, "casa", "Graças", "52052-000", "Caruaru", "PE"));
			
			Candidato c14 = new Candidato(14, "Juliana Fonseca Borges", "365214789-85", "365412 SDS-PE", "Brasileira",
					"F", "Branca", "Solteira", "36352010", "98523614", "Professora", "25/07/1986", "julianaborges@gmail.com", "teste",
					new Endereco(14, "Rua Dezessete de Agosto", 44, "Apto 203", "Casa Forte", "56300-563", "Recife", "PE"));
			
			Candidato c15 = new Candidato(15, "Roberto Sampaio Modesto", "6325987365", "365789 SDS-PE", "Brasileiro",
					"M", "Branco", "Casado", "32563458", "96327852", "Professor", "05/07/1973", "r.modestoo@gmail.com", "teste",
					new Endereco(15, "Av. Charles Vieira", 630, "casa", "Centro", "52052-960", "Caruaru", "PE"));
			
			
			edital1.addCandidato(c1);
			edital1.addCandidato(c2);
			edital1.addCandidato(c3);
			edital1.addCandidato(c4);
			edital1.addCandidato(c5);
			edital2.addCandidato(c6);
			edital2.addCandidato(c7);
			edital2.addCandidato(c8);
			edital2.addCandidato(c9);
			edital2.addCandidato(c10);
			edital3.addCandidato(c11);
			edital3.addCandidato(c12);
			edital3.addCandidato(c13);
			edital3.addCandidato(c14);
			edital3.addCandidato(c15);
			

		
		System.out.println();
		System.out.println(edital2);
		
		
	}

}