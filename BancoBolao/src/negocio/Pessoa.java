package negocio;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import persistencia.Conexao;

public class Pessoa {
	private String nome;
	private int id;
	private ArrayList<String>selecoesQuarta;
	private ArrayList<Integer>placaresQuarta;
	private ArrayList<String>selecoesSemi;
	private ArrayList<Integer>placaresSemi;
	private ArrayList<String>selecoesFinal;
	private ArrayList<Integer>placaresFinal;
	private String campeao;
	public String getCampeao() {
		return campeao;
	}
	public void setCampeao(String campeao) {
		this.campeao = campeao;
	}
	public ArrayList<String> getSelecoesFinal() {
		return selecoesFinal;
	}
	public void setSelecoesFinal(ArrayList<String> selecoesFinal) {
		this.selecoesFinal = selecoesFinal;
	}
	public ArrayList<Integer> getPlacaresFinal() {
		return placaresFinal;
	}
	public void setPlacaresFinal(ArrayList<Integer> placaresFinal) {
		this.placaresFinal = placaresFinal;
	}
	public ArrayList<String> getSelecoesSemi() {
		return selecoesSemi;
	}
	public void setSelecoesSemi(ArrayList<String> selecoesSemi) {
		this.selecoesSemi = selecoesSemi;
	}
	public ArrayList<Integer> getPlacaresSemi() {
		return placaresSemi;
	}
	public void setPlacaresSemi(ArrayList<Integer> placaresSemi) {
		this.placaresSemi = placaresSemi;
	}
	public ArrayList<Integer> getPlacaresQuarta() {
		return placaresQuarta;
	}
	public void setPlacaresQuarta(ArrayList<Integer> placaresQuarta) {
		this.placaresQuarta = placaresQuarta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<String> getSelecoesQuarta() {
		return selecoesQuarta;
	}
	public void setSelecoesQuarta(ArrayList<String> selecoesQuarta) {
		this.selecoesQuarta = selecoesQuarta;
	}
	
	
}
