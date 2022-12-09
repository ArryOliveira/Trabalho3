package negocio;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import persistencia.PessoaDAO;

public class EscreverNome extends JFrame implements ActionListener{
	public JTextField barra;
	public JLabel comando;
	public JButton enviar;
	public Pessoa pessoa;
	

	public FrameQuartas fq;
	
	public EscreverNome(FrameQuartas quartas,Pessoa p) {
		pessoa=p;
		fq=quartas;
		setSize(500, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		comando = new JLabel("Insira o Nome do Jogador para Continuar: ");
		add(comando);
		
		barra = new JTextField(30);
		barra.setSize(getPreferredSize());
		add(barra);
		
		enviar = new JButton("Enviar");
		add(enviar);
		enviar.addActionListener(this);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		
		if(this.barra.getText().equals("")) {
			this.comando.setText("A criação do seu bolão não será efetuada enquanto você não inserir um nome válido");
		}
		else {
			pessoa.setNome(barra.getText());
			fq.setVisible(true);
			fq.pessoa=pessoa;
			this.setVisible(false);
	}
		
	
}}
