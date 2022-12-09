package negocio;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Final extends JPanel {
	public JTextField[]placares=new JTextField[2];
	public ArrayList<String>selecoes=new ArrayList<String>();
	
	public Final(String vetor[]) {
		setLayout(new FlowLayout());
		add(new JLabel("Seleção:"));
		add(new JLabel(" "));
		add(new JLabel(vetor[0]));
		selecoes.add(vetor[0]);
		add(new JLabel("Placar:"));
		placares[0]=new JTextField(null,3);
		add(placares[0]);
		add(new JLabel(" "));
		add(new JLabel("X"));
		add(new JLabel("Seleção:"));
		add(new JLabel(" "));
		add(new JLabel(vetor[1]));
		selecoes.add(vetor[1]);
		add(new JLabel("Placar:"));
		placares[1]=new JTextField(null,3);
		add(placares[1]);
		
		
		}
	
	public ArrayList<Integer> PlacaresFinal(JTextField vetor[]){
		ArrayList<Integer>resultado=new ArrayList<Integer>();
		for(JTextField t : vetor) {
			resultado.add(Integer.parseInt(t.getText()));
		}
		return resultado;
	}
}
