import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;


public class Formulario13 extends JFrame implements ActionListener, ChangeListener{
	
	private JLabel label1;
	private JCheckBox check1;
	private JButton boton1;
	
	public Formulario13() {
		setLayout(null);
		label1 = new JLabel("aceptar termminos y condiciones");
		label1.setBounds(10,10,400,30);
		add(label1);
		
		check1 = new JCheckBox("acepto");
		check1.setBounds(10,50,100,30);
		check1.addChangeListener(this);
		add(check1);
		
		boton1 = new JButton("continuar");
		boton1.setBounds(10,100,100,30);
		add(boton1);
		boton1.addActionListener(this);
		boton1.setEnabled(false);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton1) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		Formulario13 formulario1 = new Formulario13();
		formulario1.setBounds(0,0,350,200);
		formulario1.setVisible(true);
		formulario1.setLocationRelativeTo(null);
		formulario1.setResizable(false);
		

	}

	@Override
	public void stateChanged(ChangeEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
