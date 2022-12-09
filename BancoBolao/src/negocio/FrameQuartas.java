
package negocio;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameQuartas extends JFrame implements ActionListener {
	public QuartasDeFinal quartas;
	//public FrameSemi sf;
	public Pessoa pessoa=new Pessoa();
	
	

	public FrameQuartas() {
		//sf=semi;
		quartas=new QuartasDeFinal();
		setSize(480,480);
		setTitle("quartas de final");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		organizar();
		pack();
		setVisible(false);
	}
	public void organizar() {
		setLayout(new BorderLayout());
		add(quartas,BorderLayout.CENTER);
		JButton Botao=new JButton();
		Botao.setText("ENVIAR");
		add(Botao, BorderLayout.SOUTH);
		Botao.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		pessoa.setPlacaresQuarta(quartas.PlacaresQuartas(quartas.lista));
		pessoa.setSelecoesQuarta(quartas.SelecoesQuartas(quartas.lista));	
		JTextField aux[]=quartas.lista;
		
		String auxGanhadores[]=new String[4];

		auxGanhadores[0]=((Compara(aux[0].getText(),aux[2].getText(),Integer.parseInt(aux[1].getText()),Integer.parseInt(aux[3].getText()))));
		auxGanhadores[1]=(Compara(aux[4].getText(),aux[6].getText(),Integer.parseInt(aux[5].getText()),Integer.parseInt(aux[7].getText())));
		auxGanhadores[2]=(Compara(aux[8].getText(),aux[10].getText(),Integer.parseInt(aux[9].getText()),Integer.parseInt(aux[11].getText())));
		auxGanhadores[3]=(Compara(aux[12].getText(),aux[14].getText(),Integer.parseInt(aux[13].getText()),Integer.parseInt(aux[15].getText())));
		FrameSemi sf=new FrameSemi(auxGanhadores);
		
		sf.pessoa=pessoa;
		
		
		this.setVisible(false);
		sf.setVisible(true);
	
		
		
		
		
		
		
		
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
