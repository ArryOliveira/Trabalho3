package negocio;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Objects;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import persistencia.Conexao;
import persistencia.PessoaDAO;

public class FrameFinal extends JFrame implements ActionListener {
	public Final f;
	public Pessoa pessoa;
	public Campeao campeao;
	public FrameFinal(String vetor[]) {
		f=new Final(vetor);
		setSize(350,350);
		setTitle("Final");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		organizar();
		setVisible(false);
		pack();
	}
	
	private void organizar() {
		setLayout(new BorderLayout());
		add(f,BorderLayout.CENTER);
		JButton Botao=new JButton();
		Botao.setText("ENVIAR");
		add(Botao,BorderLayout.SOUTH);
		Botao.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e) {
	
	JTextField aux[]=f.placares;
	String auxGanhador=Compara(f.selecoes.get(0),f.selecoes.get(1),Integer.parseInt(aux[0].getText()),Integer.parseInt(aux[1].getText()));
	
	
	pessoa.setSelecoesFinal(f.selecoes);
	pessoa.setPlacaresFinal(f.PlacaresFinal(f.placares));
	pessoa.setCampeao(auxGanhador);
	
	campeao=new Campeao(SetaBandeira(auxGanhador));
	campeao.pessoa=pessoa;
	campeao.setVisible(true);
	
	PessoaDAO x=new PessoaDAO();
	x.inserir(pessoa);
	
	
	
	
	
	
	this.setVisible(false);
	
	
		
	}
	
	public String Compara(String s1, String s2, Integer p1, Integer p2) {
		int placar1=p1;
		int placar2=p2;
		String ganhador=null;
		if(placar2>placar1) {
			ganhador=s2;
		}
		else {
			ganhador=s1;
		}
		return ganhador;
	}
	public ImageIcon SetaBandeira(String nome) {
		ImageIcon imagem=null;
		if(nome.equals("bra")) {
			 imagem=new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/brazil.png")));
		}
		if(nome.equals("fra")) {
			 imagem=new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/frança.png")));
		}
		if(nome.equals("eua")) {
			 imagem=new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/eua.png")));
		}
		if(nome.equals("hol")) {
			 imagem=new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/holanda.png")));
		}
		if(nome.equals("ing")) {
			 imagem=new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/inglaterra.png")));
		}
		if(nome.equals("mar")) {
			 imagem=new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/marrocos.png")));
		}
		if(nome.equals("por")) {
			 imagem=new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/portugal.png")));
		}
		if(nome.equals("arg")) {
			 imagem=new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/argentina.png")));
		}
		return imagem;
	}
	/*public ArrayList<Pessoa> listar() {
		ArrayList<Pessoa> aux = new ArrayList<Pessoa>();
		try {
			Connection conexao = new Conexao().getConexao();

			ResultSet resultado = conexao.prepareStatement("select * from pessoa ").executeQuery();

			Pessoa pessoa;
			while (resultado.next()) {
				pessoa = new Pessoa();
				pessoa.setNome(resultado.getString("nome"));
				
				pessoa.getSelecoesQuarta().set(0, resultado.getString("sq1"));
				pessoa.getPlacaresQuarta().set(0,resultado.getInt("pq1"));
				pessoa.getSelecoesQuarta().set(1, resultado.getString("sq2"));
				pessoa.getPlacaresQuarta().set(1, resultado.getInt("pq2"));
				pessoa.getSelecoesQuarta().set(2, resultado.getString("sq3"));
				pessoa.getPlacaresQuarta().set(2, resultado.getInt("pq3"));
				pessoa.getSelecoesQuarta().set(3, resultado.getString("sq4"));
				pessoa.getPlacaresQuarta().set(3, resultado.getInt("pq4"));
				pessoa.getSelecoesQuarta().set(4, resultado.getString("sq5"));
				pessoa.getPlacaresQuarta().set(4, resultado.getInt("pq5"));
				pessoa.getSelecoesQuarta().set(5, resultado.getString("sq6"));
				pessoa.getPlacaresQuarta().set(5, resultado.getInt("pq6"));
				pessoa.getSelecoesQuarta().set(6, resultado.getString("sq7"));
				pessoa.getPlacaresQuarta().set(6, resultado.getInt("pq7"));
				pessoa.getSelecoesQuarta().set(7, resultado.getString("sq8"));
				pessoa.getPlacaresQuarta().set(7, resultado.getInt("pq3"));
				
				pessoa.getSelecoesSemi().set(0, resultado.getString("ssf1"));
				pessoa.getPlacaresSemi().set(0, resultado.getInt("psf1"));
				pessoa.getSelecoesSemi().set(1, resultado.getString("ssf2"));
				pessoa.getPlacaresSemi().set(1, resultado.getInt("psf2"));
				pessoa.getSelecoesSemi().set(2, resultado.getString("ssf3"));
				pessoa.getPlacaresSemi().set(2, resultado.getInt("psf3"));
				pessoa.getSelecoesSemi().set(3, resultado.getString("ssf4"));
				pessoa.getPlacaresSemi().set(3, resultado.getInt("psf4"));
				
				pessoa.getSelecoesFinal().set(0, resultado.getString("sf1"));
				pessoa.getPlacaresFinal().set(0, resultado.getInt("pf1"));
				pessoa.getSelecoesFinal().set(1, resultado.getString("sf2"));
				pessoa.getPlacaresFinal().set(1, resultado.getInt("pf2"));
				
				pessoa.setCampeao(resultado.getString("campeao"));
				
				aux.add(pessoa);
			}
			conexao.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return aux;
	}*/
}
