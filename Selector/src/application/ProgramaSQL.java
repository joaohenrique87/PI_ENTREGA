package application;

import entities.Candidato;
import entities.Edital;
import entities.Endereco;
import entities.Instituicao;
import DAO.DAO;


public class ProgramaSQL {

	public static void main(String[] args) {
		
		DAO x = new DAO();
		
		Candidato c1 = new Candidato();
		c1.setId(1);
		c1.setNome("Maria Luiza Oliveira Calado");
		c1.setCpf("123456783-34");
		c1.setRg("1234543 SDS-PE");
		c1.setNacionalidade("Brasileira");
		c1.setSexo("F");
		c1.setRaca("Branca");
		c1.setEstadoCivil("Casada");
		c1.setTelefone("32589647");
		c1.setCelular("999632145");
		c1.setProfissao("Médica");
		c1.setNascimento("07/10/1983");
		c1.setEmail("mariacalado@gmail.com");
		c1.setSenha("teste");

		x.save(c1);
		
		Candidato c2 = new Candidato();
		c2.setId(2);
		c2.setNome("Ricardo Eugênio Boechat");
		c2.setCpf("632452879-15");
		c2.setRg("452896 SDS-PE");
		c2.setNacionalidade("Brasileiro");
		c2.setSexo("M");
		c2.setRaca("Negro");
		c2.setEstadoCivil("Casado");
		c2.setTelefone("32489687");
		c2.setCelular("999753621");
		c2.setProfissao("Médico");
		c2.setNascimento("15/03/1987");
		c2.setEmail("ricardoboechat@gmail.com");
		c2.setSenha("teste");

		x.save(c2);
		
		Candidato c3 = new Candidato();
		c3.setId(3);
		c3.setNome("Paulo Rogério Vieira");
		c3.setCpf("365986024-78");
		c3.setRg("635748 SDS-PE");
		c3.setNacionalidade("Brasileiro");
		c3.setSexo("M");
		c3.setRaca("Branco");
		c3.setEstadoCivil("Solteiro");
		c3.setTelefone("33520678");
		c3.setCelular("998765412");
		c3.setProfissao("Médico");
		c3.setNascimento("18/07/1978");
		c3.setEmail("paulovieira@yahoo.com.br");
		c3.setSenha("teste");

		x.save(c3);
		
		Candidato c4 = new Candidato();
		c4.setId(4);
		c4.setNome("Mariana da Silva Araújo");
		c4.setCpf("632558974-24");
		c4.setRg("632874 SDS-PE");
		c4.setNacionalidade("Brasileira");
		c4.setSexo("F");
		c4.setRaca("Branca");
		c4.setEstadoCivil("Solteira");
		c4.setTelefone("34589936");
		c4.setCelular("986253014");
		c4.setProfissao("Médica");
		c4.setNascimento("03/05/1980");
		c4.setEmail("marianaaraujo@gmail.com");
		c4.setSenha("teste");

		x.save(c4);
		
		Candidato c5 = new Candidato();
		c5.setId(5);
		c5.setNome("João Luiz de Freitas Cardoso");
		c5.setCpf("856362041-88");
		c5.setRg("365148 SDS-PE");
		c5.setNacionalidade("Brasileiro");
		c5.setSexo("F");
		c5.setRaca("Pardo");
		c5.setEstadoCivil("Casado");
		c5.setTelefone("34272021");
		c5.setCelular("993658295");
		c5.setProfissao("Médico");
		c5.setNascimento("30/08/1975");
		c5.setEmail("joao.cardoso@gmail.com");
		c5.setSenha("teste");

		x.save(c5);
		
		Candidato c6 = new Candidato();
		c6.setId(6);
		c6.setNome("Adriana Queiroz Malta");
		c6.setCpf("365789011-36");
		c6.setRg("452369 SDS-PE");
		c6.setNacionalidade("Brasileira");
		c6.setSexo("F");
		c6.setRaca("Branca");
		c6.setEstadoCivil("Solteira");
		c6.setTelefone("34853695");
		c6.setCelular("98250203");
		c6.setProfissao("Enfermeira");
		c6.setNascimento("15/06/1990");
		c6.setEmail("adrianamalta@gmail.com");
		c6.setSenha("teste");

		x.save(c6);
		
		Candidato c7 = new Candidato();
		c7.setId(7);
		c7.setNome("Fernando Paiva de Medeiros");
		c7.setCpf("8963214752-00");
		c7.setRg("963852 SDS-PE");
		c7.setNacionalidade("Brasileiro");
		c7.setSexo("M");
		c7.setRaca("Branco");
		c7.setEstadoCivil("Casado");
		c7.setTelefone("37174526");
		c7.setCelular("99362501");
		c7.setProfissao("Enfermeiro");
		c7.setNascimento("20/05/1993");
		c7.setEmail("fernandopm@gmail.com");
		c7.setSenha("teste");

		x.save(c7);
		
		Candidato c8 = new Candidato();
		c8.setId(8);
		c8.setNome("Marília Alcoforado Guerra");
		c8.setCpf("532014896-34");
		c8.setRg("874256 SDS-PE");
		c8.setNacionalidade("Brasileira");
		c8.setSexo("F");
		c8.setRaca("Parda");
		c8.setEstadoCivil("Casada");
		c8.setTelefone("37256398");
		c8.setCelular("96542301");
		c8.setProfissao("Enfermeira");
		c8.setNascimento("29/08/1986");
		c8.setEmail("mariliaguerra@uol.com");
		c8.setSenha("teste");

		x.save(c8);
		
		Candidato c9 = new Candidato();
		c9.setId(9);
		c9.setNome("Francisco Batista Farias");
		c9.setCpf("632547899-75");
		c9.setRg("632589 SSP-SP");
		c9.setNacionalidade("Brasileiro");
		c9.setSexo("M");
		c9.setRaca("Branco");
		c9.setEstadoCivil("Casado");
		c9.setTelefone("33269865");
		c9.setCelular("994785236");
		c9.setProfissao("Enfermeiro");
		c9.setNascimento("08/03/1997");
		c9.setEmail("franciscofarias@gmail.com");
		c9.setSenha("teste");

		x.save(c9);
		
		Candidato c10 = new Candidato();
		c10.setId(10);
		c10.setNome("Maria Luiza Oliveira Calado");
		c10.setCpf("123456783-34");
		c10.setRg("1234543 SDS-PE");
		c10.setNacionalidade("Brasileira");
		c10.setSexo("F");
		c10.setRaca("Branca");
		c10.setEstadoCivil("Casada");
		c10.setTelefone("32589647");
		c10.setCelular("999632145");
		c10.setProfissao("Enfermeira");
		c10.setNascimento("04/09/1990");
		c10.setEmail("mariacalado@gmail.com");
		c10.setSenha("teste");

		x.save(c10);
		
		Candidato c11 = new Candidato();
		c11.setId(11);
		c11.setNome("Carlos Santiago Neto");
		c11.setCpf("856320147-99");
		c11.setRg("456789 SDS-PE");
		c11.setNacionalidade("Brasileiro");
		c11.setSexo("M");
		c11.setRaca("Negro");
		c11.setEstadoCivil("Solteiro");
		c11.setTelefone("33209696");
		c11.setCelular("99024456");
		c11.setProfissao("Professor");
		c11.setNascimento("07/10/1970");
		c11.setEmail("carlosneto@gmail.com");
		c11.setSenha("teste");

		x.save(c11);
		
		Candidato c12 = new Candidato();
		c12.setId(12);
		c12.setNome("Mauro Braga de Oliveira");
		c12.setCpf("36529985-02");
		c12.setRg("365214 SDS-PE");
		c12.setNacionalidade("Brasileiro");
		c12.setSexo("M");
		c12.setRaca("Branco");
		c12.setEstadoCivil("Casado");
		c12.setTelefone("32589647");
		c12.setCelular("96584712");
		c12.setProfissao("Professor");
		c12.setNascimento("14/12/1978");
		c12.setEmail("mauro.oliveira@gmail.com");
		c12.setSenha("teste");

		x.save(c12);
		
		Candidato c13 = new Candidato();
		c13.setId(13);
		c13.setNome("Larissa de Melo Costa");
		c13.setCpf("365526987-02");
		c13.setRg("145963 SDS-PE");
		c13.setNacionalidade("Brasileira");
		c13.setSexo("F");
		c13.setRaca("Branca");
		c13.setEstadoCivil("Casada");
		c13.setTelefone("34279632");
		c13.setCelular("97893652");
		c13.setProfissao("Professora");
		c13.setNascimento("01/11/1980");
		c13.setEmail("larissacosta@gmail.com");
		c13.setSenha("teste");

		x.save(c13);
		
		Candidato c14 = new Candidato();
		c14.setId(14);
		c14.setNome("Juliana Fonseca Borges");
		c14.setCpf("365214789-85");
		c14.setRg("365412 SDS-PE");
		c14.setNacionalidade("Brasileira");
		c14.setSexo("F");
		c14.setRaca("Branca");
		c14.setEstadoCivil("Solteira");
		c14.setTelefone("36352010");
		c14.setCelular("98523614");
		c14.setProfissao("Professora");
		c14.setNascimento("25/07/1986");
		c14.setEmail("julianaborges@gmail.com");
		c14.setSenha("teste");

		x.save(c14);
		
		Candidato c15 = new Candidato();
		c15.setId(15);
		c15.setNome("Roberto Sampaio Modesto");
		c15.setCpf("6325987365");
		c15.setRg("365789 SDS-PE");
		c15.setNacionalidade("Brasileiro");
		c15.setSexo("M");
		c15.setRaca("Branco");
		c15.setEstadoCivil("Casado");
		c15.setTelefone("32563458");
		c15.setCelular("96327852");
		c15.setProfissao("Professora");
		c15.setNascimento("05/07/1973");
		c15.setEmail("r.modestoo@gmail.com");
		c15.setSenha("teste");

		x.save(c15);
		
		Endereco e1 = new Endereco();
		e1.setId(1);
		e1.setLogradouro("Rua Amapa");
		e1.setNumero(30);
		e1.setComplemento("casa");
		e1.setBairro("Centro");
		e1.setCep("52000-000");
		e1.setCidade("Recife");
		e1.setEstado("PE");
				
		x.save(e1);
		
		Endereco e2 = new Endereco();
		e2.setId(2);
		e2.setLogradouro("Rua Fernandes Vieira");
		e2.setNumero(405);
		e2.setComplemento("Apto 501");
		e2.setBairro("Boa Vista");
		e2.setCep("52600-030");
		e2.setCidade("Recife");
		e2.setEstado("PE");
				
		x.save(e2);
		
		Endereco e3 = new Endereco();
		e3.setId(3);
		e3.setLogradouro("Av. Boa Viagem");
		e3.setNumero(4321);
		e3.setComplemento("Apto 1105");
		e3.setBairro("Boa Viagem");
		e3.setCep("54000-000");
		e3.setCidade("Recife");
		e3.setEstado("PE");
				
		x.save(e3);
		
		Endereco e4 = new Endereco();
		e4.setId(4);
		e4.setLogradouro("Av. Rui Barbosa");
		e4.setNumero(54);
		e4.setComplemento("Apto 203");
		e4.setBairro("Graças");
		e4.setCep("52360-070");
		e4.setCidade("Recife");
		e4.setEstado("PE");
				
		x.save(e4);
		
		Endereco e5 = new Endereco();
		e5.setId(5);
		e5.setLogradouro("Rua Jacobina");
		e5.setNumero(434);
		e5.setComplemento("Apto 1004");
		e5.setBairro("Bairro Bovo");
		e5.setCep("53050-040");
		e5.setCidade("Olinda");
		e5.setEstado("PE");
				
		x.save(e5);
		
		Endereco e6 = new Endereco();
		e6.setId(6);
		e6.setLogradouro("Rua do Amparo");
		e6.setNumero(20);
		e6.setComplemento("casa");
		e6.setBairro("Centro");
		e6.setCep("54150-020");
		e6.setCidade("Olinda");
		e6.setEstado("PE");
				
		x.save(e6);
		
		Endereco e7 = new Endereco();
		e7.setId(7);
		e7.setLogradouro("Av. Santos Dumont");
		e7.setNumero(805);
		e7.setComplemento("Apto 504");
		e7.setBairro("Aflitos");
		e7.setCep("56300-000");
		e7.setCidade("Recife");
		e7.setEstado("PE");
				
		x.save(e7);
		
		Endereco e8 = new Endereco();
		e8.setId(8);
		e8.setLogradouro("Rua Bandeira de Melo");
		e8.setNumero(690);
		e8.setComplemento("Apto 1401");
		e8.setBairro("Espinheiro");
		e8.setCep("52020-000");
		e8.setCidade("Recife");
		e8.setEstado("PE");
				
		x.save(e8);
	
		Endereco e9 = new Endereco();
		e9.setId(9);
		e9.setLogradouro("Av. Paulista");
		e9.setNumero(482);
		e9.setComplemento("Apto 701");
		e9.setBairro("Centro");
		e9.setCep("51478-050");
		e9.setCidade("Recife");
		e9.setEstado("PE");
				
		x.save(e9);

		Endereco e10 = new Endereco();
		e10.setId(10);
		e10.setLogradouro("Rua Joaquim Freitas");
		e10.setNumero(30);
		e10.setComplemento("casa");
		e10.setBairro("Centro");
		e10.setCep("52000-000");
		e10.setCidade("Caruaru");
		e10.setEstado("PE");
				
		x.save(e10);
		
		Endereco e11 = new Endereco();
		e11.setId(11);
		e11.setLogradouro("Rua das Graças");
		e11.setNumero(70);
		e11.setComplemento("Apto 803");
		e11.setBairro("Graças");
		e11.setCep("55600-030");
		e11.setCidade("Caruaru");
		e11.setEstado("PE");
				
		x.save(e11);
		
		Endereco e12 = new Endereco();
		e12.setId(12);
		e12.setLogradouro("Av. Conselheiro Aguiar");
		e12.setNumero(1402);
		e12.setComplemento("Apto 101");
		e12.setBairro("Boa Viagem");
		e12.setCep("51200-009");
		e12.setCidade("Caruaru");
		e12.setEstado("PE");
				
		x.save(e12);
		
		Endereco e13 = new Endereco();
		e13.setId(13);
		e13.setLogradouro("Rua do Cupim");
		e13.setNumero(363);
		e13.setComplemento("casa");
		e13.setBairro("Graças");
		e13.setCep("52052-000");
		e13.setCidade("Caruaru");
		e13.setEstado("PE");
			
		x.save(e13);

		Endereco e14 = new Endereco();
		e14.setId(14);
		e14.setLogradouro("Rua Dezessete de Agosto");
		e14.setNumero(44);
		e14.setComplemento("Apto 203");
		e14.setBairro("Casa Forte");
		e14.setCep("56300-563");
		e14.setCidade("Recife");
		e14.setEstado("PE");
			
		x.save(e14);
		
		Endereco e15 = new Endereco();
		e15.setId(15);
		e15.setLogradouro("Av. Charles Vieira");
		e15.setNumero(630);
		e15.setComplemento("casa");
		e15.setBairro("Centro");
		e15.setCep("52052-960");
		e15.setCidade("Caruaru");
		e15.setEstado("PE");
			
		x.save(e15);
		
		Instituicao i1 = new Instituicao();
		i1.setId(1);
		i1.setNome_instituicao("Secretaria de Saúde do Estado de Pernambuco");
		i1.setCnpj("108359320001-08");
			
		x.save(i1);
		
		Instituicao i2 = new Instituicao();
		i2.setId(2);
		i2.setNome_instituicao("Prefeitura de Jaboatão dos Guararapes");
		i2.setCnpj("41033168000180");
			
		x.save(i2);
		
		Edital ed1 = new Edital();
		ed1.setId(20201);
		ed1.setLotacao("Recife");
		ed1.setCargo("Médico");
			
		x.save(ed1);
		
		Edital ed2 = new Edital();
		ed2.setId(20202);
		ed2.setLotacao("Recife");
		ed2.setCargo("Enfermeiro");
			
		x.save(ed2);
		
		Edital ed3 = new Edital();
		ed3.setId(20203);
		ed3.setLotacao("Caruaru");
		ed3.setCargo("Professor");
			
		x.save(ed3);
		
		

		}
	}
