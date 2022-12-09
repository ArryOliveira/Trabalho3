package persistencia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//import com.mysql.jdbc.Connection;

//import negocio.Aluno;
//import negocio.BolaoPessoa;
import negocio.Pessoa;
public class PessoaDAO {
	public void inserir(Pessoa pessoa) {
		try {
			Connection conexao = new Conexao().getConexao();

			PreparedStatement inserir =
					 conexao.prepareStatement("insert into pessoa (Nome,sq1,pq1,sq2,pq2,sq3,pq3,sq4,pq4,sq5,pq5,sq6,pq6,sq7,pq7,sq8,pq8,ssf1,psf1,ssf2,psf2,ssf3,psf3,ssf4,psf4,sf1,pf1,sf2,pf2,campeao ) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			inserir.setString(1, pessoa.getNome());
			
			inserir.setString(2, pessoa.getSelecoesQuarta().get(0));
			inserir.setInt(3, pessoa.getPlacaresQuarta().get(0));
			inserir.setString(4, pessoa.getSelecoesQuarta().get(1));
			inserir.setInt(5, pessoa.getPlacaresQuarta().get(1));
			inserir.setString(6, pessoa.getSelecoesQuarta().get(2));
			inserir.setInt(7, pessoa.getPlacaresQuarta().get(2));
			inserir.setString(8, pessoa.getSelecoesQuarta().get(3));
			inserir.setInt(9, pessoa.getPlacaresQuarta().get(3));
			inserir.setString(10, pessoa.getSelecoesQuarta().get(4));
			inserir.setInt(11, pessoa.getPlacaresQuarta().get(4));
			inserir.setString(12, pessoa.getSelecoesQuarta().get(5));
			inserir.setInt(13, pessoa.getPlacaresQuarta().get(5));
			inserir.setString(14, pessoa.getSelecoesQuarta().get(6));
			inserir.setInt(15, pessoa.getPlacaresQuarta().get(6));
			inserir.setString(16, pessoa.getSelecoesQuarta().get(7));
			inserir.setInt(17, pessoa.getPlacaresQuarta().get(7));
			
			inserir.setString(18, pessoa.getSelecoesSemi().get(0));
			inserir.setInt(19, pessoa.getPlacaresSemi().get(0));
			inserir.setString(20, pessoa.getSelecoesSemi().get(1));
			inserir.setInt(21, pessoa.getPlacaresSemi().get(1));
			inserir.setString(22, pessoa.getSelecoesSemi().get(2));
			inserir.setInt(23, pessoa.getPlacaresSemi().get(2));
			inserir.setString(24, pessoa.getSelecoesSemi().get(3));
			inserir.setInt(25, pessoa.getPlacaresSemi().get(3));
			
			
			inserir.setString(26, pessoa.getSelecoesFinal().get(0));
			inserir.setInt(27, pessoa.getPlacaresFinal().get(0));
			inserir.setString(28, pessoa.getSelecoesFinal().get(1));
			inserir.setInt(29, pessoa.getPlacaresFinal().get(1));
			
			inserir.setString(30, pessoa.getCampeao());
			
			inserir.executeUpdate();
			
			conexao.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public ArrayList<Pessoa> listar() {
		ArrayList<Pessoa> aux = new ArrayList<Pessoa>();
		try {
			Connection conexao = new Conexao().getConexao();

			ResultSet resultado = 
					conexao.prepareStatement("select * from pessoa")
					.executeQuery();
			
			while(resultado.next()) {
				Pessoa p = new Pessoa();
				p.setSelecoesQuarta(new ArrayList<String>());
				p.setPlacaresQuarta(new ArrayList<Integer>());
				
				p.setSelecoesSemi(new ArrayList<String>());
				p.setPlacaresSemi(new ArrayList<Integer>());
				
				p.setSelecoesFinal(new ArrayList<String>());
				p.setPlacaresFinal(new ArrayList<Integer>());
				
				
				
				
				p.setNome(resultado.getString("Nome"));
				
				p.getSelecoesQuarta().add(resultado.getString("sq1"));
				p.getPlacaresQuarta().add(resultado.getInt("pq1"));
				p.getSelecoesQuarta().add(resultado.getString("sq2"));
				p.getPlacaresQuarta().add(resultado.getInt("pq2"));
				p.getSelecoesQuarta().add(resultado.getString("sq3"));
				p.getPlacaresQuarta().add(resultado.getInt("pq3"));
				p.getSelecoesQuarta().add(resultado.getString("sq4"));
				p.getPlacaresQuarta().add(resultado.getInt("pq4"));
				p.getSelecoesQuarta().add(resultado.getString("sq5"));
				p.getPlacaresQuarta().add(resultado.getInt("pq5"));
				p.getSelecoesQuarta().add(resultado.getString("sq6"));
				p.getPlacaresQuarta().add(resultado.getInt("pq6"));
				p.getSelecoesQuarta().add(resultado.getString("sq7"));
				p.getPlacaresQuarta().add(resultado.getInt("pq7"));
				p.getSelecoesQuarta().add(resultado.getString("sq8"));
				p.getPlacaresQuarta().add(resultado.getInt("pq8"));
				
				p.getSelecoesSemi().add(resultado.getString("ssf1"));
				p.getPlacaresSemi().add(resultado.getInt("psf1"));
				p.getSelecoesSemi().add(resultado.getString("ssf2"));
				p.getPlacaresSemi().add(resultado.getInt("psf2"));
				p.getSelecoesSemi().add(resultado.getString("ssf3"));
				p.getPlacaresSemi().add(resultado.getInt("psf3"));
				p.getSelecoesSemi().add(resultado.getString("ssf4"));
				p.getPlacaresSemi().add(resultado.getInt("psf4"));
				
				p.getSelecoesFinal().add(resultado.getString("sf1"));
				p.getPlacaresFinal().add(resultado.getInt("pf1"));
				p.getSelecoesFinal().add(resultado.getString("sf2"));
				p.getPlacaresFinal().add(resultado.getInt("pf2"));
				
				p.setCampeao(resultado.getString("campeao"));
				
				
				aux.add(p);
			}
			conexao.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return aux;

	
}}
