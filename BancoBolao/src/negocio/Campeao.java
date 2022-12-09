package negocio;

import java.awt.BorderLayout;
import java.util.Objects;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Campeao extends JFrame{
	Pessoa pessoa;
	public Campeao(ImageIcon imagem) {
		
		setSize(350,350);
		setTitle("Campeão");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		JLabel label=new JLabel();
		label.setIcon(imagem);
		add(label,BorderLayout.CENTER);
		setVisible(false);
	}

	

}
