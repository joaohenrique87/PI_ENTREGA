package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
//import com.mysql.jdbc.PreparedStatement
import java.util.List;

import connection.conexao;
import entities.Candidato;
import entities.Edital;
import entities.Endereco;
import entities.Instituicao;

public class DAO {
	
	public void save(Candidato candidato) {
		String sql = "INSERT INTO candidato (id_candidato, nome, cpf, di, nacionalidade, sexo, raca, estadoCivil, telefone, celular, profissao, nascimento,"
				+ "email, senha) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			
			pstm.setInt(1, candidato.getId());
			pstm.setString(2, candidato.getNome());
			pstm.setString(3, candidato.getCpf());
			pstm.setString(4, candidato.getRg());
			pstm.setString(5, candidato.getNacionalidade());
			pstm.setString(6, candidato.getSexo());
			pstm.setString(7, candidato.getRaca());
			pstm.setString(8, candidato.getEstadoCivil());
			pstm.setString(9, candidato.getTelefone());
			pstm.setString(10, candidato.getCelular());
			pstm.setString(11, candidato.getProfissao());
			pstm.setString(12, candidato.getNascimento());
			pstm.setString(13, candidato.getEmail());
			pstm.setString(14, candidato.getSenha());
			
			pstm.execute();
			
			System.out.println("Candidato salvo com sucesso");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstm!=null) {
					pstm.close();
				}
				if (conn!=null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}		
	}
	
	public void save(Endereco endereco) {
		String sql = "INSERT INTO endereco (id, logradouro, numero, complemento, bairro, cep, cidade, estado) VALUES (?,?,?,?,?,?,?,?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			
			pstm.setInt(1, endereco.getId());
			pstm.setString(2, endereco.getLogradouro());
			pstm.setInt(3, endereco.getNumero());
			pstm.setString(4, endereco.getComplemento());
			pstm.setString(5, endereco.getBairro());
			pstm.setString(6, endereco.getCep());
			pstm.setString(7, endereco.getCidade());
			pstm.setString(8, endereco.getEstado());

			pstm.execute();
			
			System.out.println("Endereço salvo com sucesso");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstm!=null) {
					pstm.close();
				}
				if (conn!=null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}		
	}
	
	public void save(Instituicao instituicao) {
		String sql = "INSERT INTO instituicao (id_instituicao, nome_instituicao, cnpj_instituicao) VALUES (?,?,?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			
			pstm.setInt(1, instituicao.getId());
			pstm.setString(2, instituicao.getNome_instituicao());
			pstm.setString(3, instituicao.getCnpj());

			pstm.execute();
			
			System.out.println("Instituição salva com sucesso");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstm!=null) {
					pstm.close();
				}
				if (conn!=null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}		
	}
	
	public void save(Edital edital) {
		String sql = "INSERT INTO edital (id_edital, lotacao, cargo) VALUES (?,?,?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			
			pstm.setInt(1, edital.getId());
			pstm.setString(2, edital.getLotacao());
			pstm.setString(3, edital.getCargo());

			pstm.execute();
			
			System.out.println("Edital salvo com sucesso");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstm!=null) {
					pstm.close();
				}
				if (conn!=null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}		
	}
	
	
	
	public static List<Candidato> getCandidatos() {
		String sql = "SELECT * FROM candidato";
		
		List<Candidato> candidatos = new ArrayList<Candidato>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		ResultSet rset = null;
		
		try {
			conn = conexao.createConnectionToMySQL();
			
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			rset = pstm.executeQuery();
			
			while (rset.next()) {
				
				Candidato candidato = new Candidato();
				candidato.setId(rset.getInt("id_candidato"));
				candidato.setNome(rset.getString("nome"));
				candidato.setCpf(rset.getString("cpf"));
				candidato.setRg(rset.getString("di"));
				candidato.setNacionalidade(rset.getString("nacionalidade"));
				candidato.setSexo(rset.getString("sexo"));
				candidato.setRaca(rset.getString("raca"));
				candidato.setEstadoCivil(rset.getString("estadoCivil"));
				candidato.setTelefone(rset.getString("telefone"));
				candidato.setCelular(rset.getString("celular"));
				candidato.setProfissao(rset.getString("profissao"));
				candidato.setNascimento(rset.getString("nascimento"));
				candidato.setEmail(rset.getString("email"));
				candidato.setSenha(rset.getString("senha"));
				
				candidatos.add(candidato);		
			}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (rset!=null) {
						rset.close();
					}
					if (pstm!=null) {
						pstm.close();
					}
					if (conn!=null) {
						conn.close();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return candidatos;
		}
	

	}

