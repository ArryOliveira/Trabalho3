package negocio;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class QuartasDeFinal extends JPanel implements ActionListener {
	
	public JTextField lista[]=new JTextField[16];
	
	
	public QuartasDeFinal() {
		
		setSize(480,480);
		setLayout(new GridLayout(4,9));
		add(new JLabel ("Seleção"));
	
		lista[0]=new JTextField(null,10);
		add(lista[0]);
		
		
		add(new JLabel("Placar:"));
	
		lista[1]=new JTextField(null,3);
		add(lista[1]);
		
		add(new JLabel(" "));
		add(new JLabel("X"));
		add(new JLabel ("Seleção"));
		
		lista[2]=new JTextField(null,10);
		add(lista[2]);
		
		add(new JLabel("Placar:"));
		lista[3]=new JTextField(null,3);
		add(lista[3]);
		
		add(new JLabel ("Seleção"));
		
		lista[4]=new JTextField(null,10);
		add(lista[4]);
		
		add(new JLabel("Placar:"));
		
		lista[5]=new JTextField(null,3);
		add(lista[5]);
		
		add(new JLabel(" "));
		add(new JLabel("X"));
		add(new JLabel ("Seleção"));
		
		lista[6]=new JTextField(null,10);
		add(lista[6]);
	
		add(new JLabel("Placar:"));
		
		lista[7]=new JTextField(null,3);
		add(lista[7]);
		
		add(new JLabel ("Seleção"));
		
		lista[8]=new JTextField(null,10);
		add(lista[8]);
		
		add(new JLabel("Placar:"));
		
		lista[9]=new JTextField(null,3);
		add(lista[9]);
		
		add(new JLabel(" "));
		add(new JLabel("X"));
		add(new JLabel ("Seleção"));
		
		lista[10]=new JTextField(null,10);
		add(lista[10]);
		
		add(new JLabel("Placar:"));
		
		lista[11]=new JTextField(null,3);
		add(lista[11]);
		
		add(new JLabel ("Seleção"));
	
		lista[12]=new JTextField(null,10);
		add(lista[12]);
		
		add(new JLabel("Placar:"));
		
		lista[13]=new JTextField(null,3);
		add(lista[13]);
		
		add(new JLabel(" "));
		add(new JLabel("X"));
		add(new JLabel ("Seleção"));
		
		lista[14]=new JTextField(null,10);
		add(lista[14]);
		
		add(new JLabel("Placar:"));
		
		lista[15]=new JTextField(null,3);
		add(lista[15]);
		
		
		
		}
	public ArrayList<String> SelecoesQuartas(JTextField vetor[]) {
		ArrayList<String>selecoes=new ArrayList<String>();
		for(int i=0;i<vetor.length;i++) {
			if(i%2==0) {
				selecoes.add(vetor[i].getText());
			}
		}
		return selecoes;
	}
	
	public ArrayList<Integer> PlacaresQuartas(JTextField vetor[]) {
		ArrayList<Integer>placares=new ArrayList<Integer>();
		for(int i=0;i<vetor.length;i++) {
			if(i%2!=0) {
				placares.add(Integer.parseInt(vetor[i].getText()));
			}
		}
		return placares;
	}
		
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
}
