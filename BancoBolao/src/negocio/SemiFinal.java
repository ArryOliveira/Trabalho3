package negocio;

import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SemiFinal extends JPanel {
		public JTextField[]PlacaresSemifinal=new JTextField[4];
		public ArrayList<String>lista=new ArrayList<String>();
	
	
		public SemiFinal(String vetor[]) {
			setLayout(new GridLayout(2,10));
			add(new JLabel("Seleção:"));
			//SelecoesGanhadoras[0]=new JLabel();
			add(new JLabel(vetor[0]));
			lista.add(vetor[0]);
			add(new JLabel("Placar:"));
			PlacaresSemifinal[0]=new JTextField(null,3);
			add(PlacaresSemifinal[0]);
			add(new JLabel(" "));
			add(new JLabel("X"));
			add(new JLabel("Seleção:"));
			//SelecoesGanhadoras[1]=new JLabel();
			add(new JLabel(vetor[1]));
			lista.add(vetor[1]);
			add(new JLabel("Placar:"));
			PlacaresSemifinal[1]=new JTextField(null,3);
			add(PlacaresSemifinal[1]);
			add(new JLabel("Seleção:"));
			//SelecoesGanhadoras[2]=new JLabel();
			add(new JLabel(vetor[2]));
			lista.add(vetor[2]);
			add(new JLabel("Placar:"));
			PlacaresSemifinal[2]=new JTextField(null,3);
			add(PlacaresSemifinal[2]);
			add(new JLabel(" "));
			add(new JLabel("X"));
			add(new JLabel("Seleção:"));
			//SelecoesGanhadoras[3]=new JLabel();
			add(new JLabel(vetor[3]));
			lista.add(vetor[3]);
			add(new JLabel("Placar:"));
			PlacaresSemifinal[3]=new JTextField(null,3);
			add(PlacaresSemifinal[3]);
			
		
			
			
		
			
			
			
		}
		public ArrayList<Integer> PlacaresSemi(JTextField vetor[]){
			ArrayList<Integer>resultado=new ArrayList<Integer>();
			for(JTextField t : vetor) {
				resultado.add(Integer.parseInt(t.getText()));
			}
			return resultado;
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
	
}
