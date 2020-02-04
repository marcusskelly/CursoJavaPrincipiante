import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;


public class Licencia extends JFrame implements ActionListener, ChangeListener{

	private JLabel label1, label2;
	private JCheckBox check1;
	private JButton boton1, boton2;
	private JScrollPane scrollpane1;
	private JTextArea textarea1;
	String nombre = "";
	
	
	public Licencia() {
		setLayout(null);
		setTitle("licencia de uso");
		Bienvenida ventanaBienvenida = new Bienvenida();
		nombre = ventanaBienvenida.texto;
		
		label1 = new JLabel("TERMINOS Y CONDICIONES");
		label1.setBounds(215,5,200,30);
		label1.setFont(new Font("Andale Mono",1,14));
		label1.setForeground(new Color(0,0,0));
		add(label1);
		
		textarea1 = new JTextArea();
		textarea1.setEditable(false);
		textarea1.setFont(new Font("Andale Mono",0,9));
		textarea1.setText("\n\n          Terminos y condiciones" +
		"\n\n          A.  Prohibida su venta o distribucion."+
		"\n          B.  Prohibido la alteracion del codigo fuente."+
		"\n          C.  No se hace responsable del mal uso del software."+
		"\n\n          Los acuerdos legales expuestos a cotinuacion."+
		"\n          Para aceptar estos terminos, pulse en aceptar.");
		scrollpane1 = new JScrollPane(textarea1);
		scrollpane1.setBounds(10,40,575,200);
		add(scrollpane1);
		
		check1 = new JCheckBox("Yo " + nombre + " Acepto");
		check1.setBounds(10,250,300,30);
		check1.addChangeListener(this);
		add(check1);
		
		boton1 = new JButton("continuar");
		boton1.setBounds(10,290,100,30);
		boton1.addActionListener(this);
		boton1.setEnabled(false);
		add(boton1);
		
		boton2 = new JButton("no acepto");
		boton2.setBounds(120,290,100,30);
		boton2.addActionListener(this);
		boton2.setEnabled(true);
		add(boton2);
		
		ImageIcon imagen1 = new ImageIcon("C:\\Users\\Estela\\Desktop\\Proyecto\\images\\coca-cola.png");
		setIconImage(imagen1.getImage());
		label2 = new JLabel(imagen1);
		label2.setBounds(315,135,300,300);
		add(label2);
}
	public void  stateChanged(ChangeEvent e) {
		if(check1.isSelected()==true) {
			boton1.setEnabled(true);
			boton2.setEnabled(false);
		}else {
			boton1.setEnabled(false);
			boton2.setEnabled(true);
		}
		
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton1) {
			Principal formulario1 = new Principal();
			formulario1.setBounds(0,0,640,535);
			formulario1.setVisible(true);
			formulario1.setLocationRelativeTo(null);
			formulario1.setResizable(false);
			this.setVisible(false);
			
		}else if(e.getSource()==boton2){
			Bienvenida ventanabienvenida = new Bienvenida();
			ventanabienvenida.setBounds(0,0,350,450);
			ventanabienvenida.setVisible(true);
			ventanabienvenida.setLocationRelativeTo(null);
			ventanabienvenida.setResizable(false);
			this.setVisible(false);
		}
		
	}
	public static void main(String[] args) {
		Licencia ventanabienvenida = new Licencia();
		ventanabienvenida.setBounds(0,0,600,360);
		ventanabienvenida.setVisible(true);
		ventanabienvenida.setLocationRelativeTo(null);
		ventanabienvenida.setResizable(false);

	}

}
