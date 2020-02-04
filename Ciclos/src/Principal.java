import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Principal extends JFrame implements ActionListener {
	
	private JMenuBar mb;
	private JMenu menuOpciones, menuCalcular, menuAcercaDe, menuColorFondo;
	private JMenuItem miCalculo,miRojo,miNegro,miElCreador,miSalir,miNuevo;
	private JLabel labelLogo,labelBienvenido,labelTitle,labelNombre,labelApellido,
					labelDepartamento,labelAntiguedad,labelResultado,labelFooter;
	private JTextField txtNombreTrabajador,txtApellidoTrabajador;
	private JComboBox comboDepartamento,comboAntiguedad;
	private JScrollPane scrollpane1;
	private JTextArea textarea1;
	String nombreAdministrador="";
	
	
	public Principal() {
		setLayout(null);
		setTitle("pantalla principal");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(255,0,0));
		Bienvenida ventanaBienvenida = new Bienvenida();
		nombreAdministrador = ventanaBienvenida.texto;
		
		
		mb = new JMenuBar();
		mb.setBackground(new Color(255,0,0));
		setJMenuBar(mb);
		
		menuOpciones = new JMenu("opciones");
		menuOpciones.setBackground(new Color(255,0,0));
		menuOpciones.setFont(new Font("Andale Mono",1,14));
		menuOpciones.setForeground(new Color(255,255,255));
		mb.add(menuOpciones);
		
		menuCalcular = new JMenu("calcular");
		menuCalcular.setBackground(new Color(255,0,0));
		menuCalcular.setFont(new Font("Andale Mono",1,14));
		menuCalcular.setForeground(new Color(255,255,255));
		mb.add(menuCalcular);
		
		menuAcercaDe = new JMenu("acerca de");
		menuAcercaDe.setBackground(new Color(255,0,0));
		menuAcercaDe.setFont(new Font("Andale Mono",1,14));
		menuAcercaDe.setForeground(new Color(255,255,255));
		mb.add(menuAcercaDe);
		
		menuColorFondo = new JMenu("color de fondo");
		menuColorFondo.setFont(new Font("Andale Mono",1,14));
		menuColorFondo.setForeground(new Color(255,0,0));
		menuOpciones.add(menuColorFondo);
		
		miCalculo = new JMenuItem("calculo");
		miCalculo.setFont(new Font("Andale Mono",1,14));
		miCalculo.setForeground(new Color(255,0,0));
		menuCalcular.add(miCalculo);
		miCalculo.addActionListener(this);
		
		miRojo = new JMenuItem("rojo");
		miRojo.setFont(new Font("Andale Mono",1,14));
		miRojo.setForeground(new Color(255,0,0));
		menuColorFondo.add(miRojo);
		miRojo.addActionListener(this);
		
		miNegro = new JMenuItem("negro");
		miNegro.setFont(new Font("Andale Mono",1,14));
		miNegro.setForeground(new Color(255,0,0));
		menuColorFondo.add(miNegro);
		miNegro.addActionListener(this);
		
		miNuevo = new JMenuItem("nuevo");
		miNuevo.setFont(new Font("Andale Mono",1,14));
		miNuevo.setForeground(new Color(255,0,0));
		menuOpciones.add(miNuevo);
		miNuevo.addActionListener(this);
		
		miElCreador = new JMenuItem("El creador");
		miElCreador.setFont(new Font("Andale Mono",1,14));
		miElCreador.setForeground(new Color(255,0,0));
		menuAcercaDe.add(miElCreador);
		miElCreador.addActionListener(this);
		
		miSalir = new JMenuItem("salir");
		miSalir.setFont(new Font("Andale Mono",1,14));
		miSalir.setForeground(new Color(255,0,0));
		menuOpciones.add(miSalir);
		miSalir.addActionListener(this);
		
		ImageIcon imagen1 = new ImageIcon("C:\\Users\\Estela\\Desktop\\Proyecto\\images\\logo-coca.png");
		setIconImage(imagen1.getImage());
		labelLogo = new JLabel(imagen1);
		labelLogo.setBounds(5,5,250,100);
		add(labelLogo);
		
		labelBienvenido = new JLabel("bienvenido " + nombreAdministrador);
		labelBienvenido.setBounds(280,30,300,50);
		labelBienvenido.setFont(new Font("Andale Mono",1,32));
		labelBienvenido.setForeground(new Color(255,255,255));
		add(labelBienvenido);
		
		labelTitle = new JLabel("Datos de trabajador para calculo de vacaciones");
		labelTitle.setBounds(45,140,900,25);
		labelTitle.setFont(new Font("Andale Mono",0,24));
		labelTitle.setForeground(new Color(255,255,255));
		add(labelTitle);
		
		labelNombre= new JLabel("Nombre completo");
		labelNombre.setBounds(25,188,180,25);
		labelNombre.setFont(new Font("Andale Mono",1,12));
		labelNombre.setForeground(new Color(255,255,255));
		add(labelNombre);
		
		txtNombreTrabajador = new JTextField();
		txtNombreTrabajador.setBounds(25,213,150,25);
		txtNombreTrabajador.setFont(new Font("Andale Mono",1,14));
		txtNombreTrabajador.setForeground(new Color(255,0,0));
		txtNombreTrabajador.setBackground(new Color(224,224,224));
		add(txtNombreTrabajador);
		
		labelApellido= new JLabel("Apellido");
		labelApellido.setBounds(25,248,180,25);
		labelApellido.setFont(new Font("Andale Mono",1,12));
		labelApellido.setForeground(new Color(255,255,255));
		add(labelApellido);
		
		txtApellidoTrabajador = new JTextField();
		txtApellidoTrabajador.setBounds(25,273,150,25);
		txtApellidoTrabajador.setFont(new Font("Andale Mono",1,14));
		txtApellidoTrabajador.setForeground(new Color(255,0,0));
		txtApellidoTrabajador.setBackground(new Color(224,224,224));
		add(txtApellidoTrabajador);
		
		labelDepartamento= new JLabel("selecciona el departamento");
		labelDepartamento.setBounds(220,188,180,25);
		labelDepartamento.setFont(new Font("Andale Mono",1,12));
		labelDepartamento.setForeground(new Color(255,255,255));
		add(labelDepartamento);
		
		comboDepartamento = new JComboBox();
		comboDepartamento.setBounds(220,213,220,25);
		comboDepartamento.setFont(new Font("Andale Mono",1,14));
		comboDepartamento.setForeground(new Color(255,0,0));
		comboDepartamento.setBackground(new Color(224,224,224));
		add(comboDepartamento);
		comboDepartamento.addItem("");
		comboDepartamento.addItem("atencion al cliente");
		comboDepartamento.addItem("departamento de logistica");
		comboDepartamento.addItem("departamento de gerencia");
		
		labelAntiguedad= new JLabel("selecciona antiguedad");
		labelAntiguedad.setBounds(220,248,180,25);
		labelAntiguedad.setFont(new Font("Andale Mono",1,12));
		labelAntiguedad.setForeground(new Color(255,255,255));
		add(labelAntiguedad);
		
		comboAntiguedad = new JComboBox();
		comboAntiguedad.setBounds(220,273,220,25);
		comboAntiguedad.setFont(new Font("Andale Mono",1,14));
		comboAntiguedad.setForeground(new Color(255,0,0));
		comboAntiguedad.setBackground(new Color(224,224,224));
		add(comboAntiguedad);
		comboAntiguedad.addItem("");
		comboAntiguedad.addItem("1 año de servicio");
		comboAntiguedad.addItem("2 a 6 años de servicio");
		comboAntiguedad.addItem("7 años o mas de servicio");
		
		labelResultado= new JLabel("selecciona antiguedad");
		labelResultado.setBounds(220,307,180,25);
		labelResultado.setFont(new Font("Andale Mono",1,12));
		labelResultado.setForeground(new Color(255,255,255));
		add(labelResultado);
		
		textarea1 = new JTextArea();
		textarea1.setEditable(false);
		textarea1.setBackground(new Color(224,224,224));
		textarea1.setFont(new Font("Andale Mono",1,11));
		textarea1.setForeground(new Color(255,0,0));
		textarea1.setText("\n    Aqui aparece el resultado del calculo");
		scrollpane1 = new JScrollPane(textarea1);
		scrollpane1.setBounds(220,333,385,90);
		add(scrollpane1);
		
		labelFooter= new JLabel("2107 The Coca-Cola company");
		labelFooter.setBounds(135,445,500,30);
		labelFooter.setFont(new Font("Andale Mono",1,12));
		labelFooter.setForeground(new Color(255,255,255));
		add(labelFooter);		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==miCalculo) {
			String nombreTrabajador = txtNombreTrabajador.getText();
			String apellidoTrabajador = txtApellidoTrabajador.getText();
			String Departamento = comboDepartamento.getSelectedItem().toString();
			String Antiguedad = comboAntiguedad.getSelectedItem().toString();
			
				if(nombreTrabajador.equals("")|| apellidoTrabajador.equals("")|| Departamento.contentEquals("")
						|| Antiguedad.equals("")) {
						
						JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
				}else {
					if(Departamento.equals("atencion al cliente")) {
						if(Antiguedad.equals("1 año de servicio")) {
							textarea1.setText("\n  El trabajador " + nombreTrabajador + "" + apellidoTrabajador + 
												"\n  quien labora en " + Departamento + " con " + Antiguedad + 
												"\n  recibe 6 dias de vacaciones.");
						}
						if(Antiguedad.equals("2 a 6 años de servicio")) {
							textarea1.setText("\n  El trabajador " + nombreTrabajador + "" + apellidoTrabajador + 
									"\n  quien labora en " + Departamento + " con " + Antiguedad + 
									"\n  recibe 14 dias de vacaciones.");

						}
						if(Antiguedad.equals("7 años o mas de servicio")) {
							textarea1.setText("\n  El trabajador " + nombreTrabajador + "" + apellidoTrabajador + 
									"\n  quien labora en " + Departamento + " con " + Antiguedad + 
									"\n  recibe 20 dias de vacaciones.");
						}
					if(Departamento.equals("departamento de logistica")) {
						if(Antiguedad.equals("1 año de servicio")) {
							textarea1.setText("\n  El trabajador " + nombreTrabajador + "" + apellidoTrabajador + 
									"\n  quien labora en " + Departamento + " con " + Antiguedad + 
									"\n  recibe 7 dias de vacaciones.");
						}
						if(Antiguedad.equals("2 a 6 años de servicio")) {
							textarea1.setText("\n  El trabajador " + nombreTrabajador + "" + apellidoTrabajador + 
									"\n  quien labora en " + Departamento + " con " + Antiguedad + 
									"\n  recibe 15 dias de vacaciones.");
						}
						if(Antiguedad.equals("7 años o mas de servicio")) {
							textarea1.setText("\n  El trabajador " + nombreTrabajador + "" + apellidoTrabajador + 
									"\n  quien labora en " + Departamento + " con " + Antiguedad + 
									"\n  recibe 22 dias de vacaciones.");
						}
					if(Departamento.equals("departamento de gerencia")) {
						if(Antiguedad.equals("1 año de servicio")) {
							textarea1.setText("\n  El trabajador " + nombreTrabajador + "" + apellidoTrabajador + 
									"\n  quien labora en " + Departamento + " con " + Antiguedad + 
									"\n  recibe 10 dias de vacaciones.");
						}
						if(Antiguedad.equals("2 a 6 años de servicio")) {
							textarea1.setText("\n  El trabajador " + nombreTrabajador + "" + apellidoTrabajador + 
									"\n  quien labora en " + Departamento + " con " + Antiguedad + 
									"\n  recibe 20 dias de vacaciones.");
						}
						if(Antiguedad.equals("7 años o mas de servicio")) {
							textarea1.setText("\n  El trabajador " + nombreTrabajador + "" + apellidoTrabajador + 
									"\n  quien labora en " + Departamento + " con " + Antiguedad + 
									"\n  recibe 30 dias de vacaciones.");
						}
					}
					}
					}
					
				}
		}
		if(e.getSource()==miRojo) {
			getContentPane().setBackground(new Color(255,0,0));
		}
		if(e.getSource()==miNegro) {
			getContentPane().setBackground(new Color(0,0,0));
		}
		if(e.getSource()==miNuevo) {
			txtNombreTrabajador.setText("");
			txtApellidoTrabajador.setText("");
			comboDepartamento.setSelectedIndex(0);
			comboAntiguedad.setSelectedIndex(0);
			textarea1.setText("\n  Aqui aparece el resultado del calculo de las vacaciones.");
		}
		if(e.getSource()==miSalir) {
			Bienvenida ventanabienvenida = new Bienvenida();
			ventanabienvenida.setBounds(0,0,350,450);
			ventanabienvenida.setVisible(true);
			ventanabienvenida.setLocationRelativeTo(null);
			ventanabienvenida.setResizable(false);
			this.setVisible(false);
		}
		if(e.getSource()==miElCreador) {
			JOptionPane.showMessageDialog(null,"Desarrollado por Marcus");
		}
	}
	public static void main(String[] args) {
		Principal formulario1 = new Principal();
		formulario1.setBounds(0,0,640,535);
		formulario1.setVisible(true);
		formulario1.setLocationRelativeTo(null);
		formulario1.setResizable(false);

	}

}
