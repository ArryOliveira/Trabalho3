package negocio;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTable;

import persistencia.PessoaDAO;

public class Cadastros extends JFrame {
	public ArrayList<Pessoa>listaDePessoas;
	public Cadastros() {
	setSize(500,500);
	setTitle("Final");
	String []colunas= {
			"Nome","sq1","pq1","sq2","pq2","sq3","pq3","sq4","pq4","sq5","pq5","sq6","pq6","sq7","pq7","sq8","pq8","ssf1","psf1","ssf1","psf2","ssf3","psf3","ssf4","psf4","sf1","pf1","sf2","pf2"
	};
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	JTable jtable=new JTable(cadastrado(),colunas);
	add(jtable);
	setVisible(true);
	pack();
}

	private String[][] cadastrado() {
		PessoaDAO pessoa=new PessoaDAO();
		ArrayList<Pessoa>cadastros=new ArrayList<Pessoa>();
		cadastros=pessoa.listar();
		/*String []colunas= {
				"Nome","sq1","pq1","sq2","pq2","sq3","pq3","sq4","pq4","sq5","pq5","sq6","pq6","sq7","pq7","sq8","pq8","ssf1","psf1","ssf1","psf2","ssf3","psf3","ssf4","psf4","sf1","pf1","sf2","pf2"
		};*/
		
		String[][] dados=new String[cadastros.size()+1][31];
		for(int i=0;i<cadastros.size();i++) {
			for(int j=0;j<31;j++) {
				dados[i][j]= cadastros.get(i).getNome()+";"+cadastros.get(i).getSelecoesQuarta().get(0)+";"+cadastros.get(i).getPlacaresQuarta().get(0)+";"+
						cadastros.get(i).getSelecoesQuarta().get(1)+";"+cadastros.get(i).getPlacaresQuarta().get(1)+";"+
						cadastros.get(i).getSelecoesQuarta().get(2)+";"+cadastros.get(i).getPlacaresQuarta().get(2)+";"+
						cadastros.get(i).getSelecoesQuarta().get(3)+";"+cadastros.get(i).getPlacaresQuarta().get(3)+";"+
						cadastros.get(i).getSelecoesQuarta().get(4)+";"+cadastros.get(i).getPlacaresQuarta().get(4)+";"+
						cadastros.get(i).getSelecoesQuarta().get(5)+";"+cadastros.get(i).getPlacaresQuarta().get(5)+";"+
						cadastros.get(i).getSelecoesQuarta().get(6)+";"+cadastros.get(i).getPlacaresQuarta().get(6)+";"+
						cadastros.get(i).getSelecoesQuarta().get(7)+";"+cadastros.get(i).getPlacaresQuarta().get(7)+";"+
						cadastros.get(i).getSelecoesSemi().get(0)+";"+cadastros.get(i).getPlacaresSemi().get(0)+";"+
						cadastros.get(i).getSelecoesSemi().get(1)+";"+cadastros.get(i).getPlacaresSemi().get(1)+";"+
						cadastros.get(i).getSelecoesSemi().get(2)+";"+cadastros.get(i).getPlacaresSemi().get(2)+";"+
						cadastros.get(i).getSelecoesSemi().get(3)+";"+cadastros.get(i).getPlacaresSemi().get(3)+";"+
						cadastros.get(i).getSelecoesFinal().get(0)+";"+cadastros.get(i).getPlacaresFinal().get(0)+";"+
						cadastros.get(i).getSelecoesFinal().get(1)+";"+cadastros.get(i).getPlacaresFinal().get(1)+";"+
						cadastros.get(i).getCampeao();
			}
		}
		System.out.println(dados[0][0]);
		
		return dados;
	}}
