package apresentacao;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import negocio.EscreverNome;
import negocio.FrameQuartas;
import negocio.Pessoa;

public class Apresentacao extends JFrame {
	
	public Apresentacao() {
		setSize(350,350);
		setTitle("MENU");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		organizar();
		setVisible(true);
	}

	private void organizar() {
		setLayout(new GridLayout(4,1));
		JButton cadastro=new JButton();
		cadastro.setText("CADASTRAR NOVO BOLÃO");
		cadastro.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Pessoa p=new Pessoa();
				 
				FrameQuartas j=new FrameQuartas();
				EscreverNome en=new EscreverNome(j,p);
			}
		});
		add(cadastro);
		
	}}
