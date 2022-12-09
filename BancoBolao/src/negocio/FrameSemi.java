package negocio;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameSemi extends JFrame implements ActionListener {
	public SemiFinal semifinal;
	public FrameFinal f;
	public Pessoa pessoa;
	
	public FrameSemi(String GanhadoresQuartas[]) {
		
		semifinal=new SemiFinal(GanhadoresQuartas);
		setSize(480,480);
		setTitle("Semi Finais");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		organizar();
		pack();
		setVisible(false);
		
		
	}

	private void organizar() {
		setLayout(new BorderLayout());
		setTitle("Semi-Final");
		JButton Botao=new JButton();
		Botao.setText("ENVIAR");
		add(semifinal,BorderLayout.CENTER);
		add(Botao,BorderLayout.SOUTH);
		Botao.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		pessoa.setSelecoesSemi(semifinal.lista);
		pessoa.setPlacaresSemi(semifinal.PlacaresSemi(semifinal.PlacaresSemifinal));
		JTextField aux[]=semifinal.PlacaresSemifinal;
		String auxGanhadores[]=new String[2];
		auxGanhadores[0]=semifinal.Compara(semifinal.lista.get(0),semifinal.lista.get(1), Integer.parseInt(aux[0].getText()), Integer.parseInt(aux[1].getText()));
		auxGanhadores[1]=semifinal.Compara(semifinal.lista.get(2),semifinal.lista.get(3), Integer.parseInt(aux[2].getText()), Integer.parseInt(aux[3].getText()));
		f=new FrameFinal(auxGanhadores);
		f.pessoa=pessoa;
		this.setVisible(false);
		
	
		f.setVisible(true);
		
	}
}
