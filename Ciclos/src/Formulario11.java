import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Formulario11 extends JFrame implements ActionListener {
	
	private JMenuBar menubar;
	private JMenu menu1, menu2, menu3;
	private JMenuItem menuitem1, menuitem2, menuitem3, menuitem4;
	
	public Formulario11() {
		setLayout(null);
		menubar = new JMenuBar();
		setJMenuBar(menubar);
		
		menu1 = new JMenu("opciones");
		menubar.add(menu1);
		
		menu2 = new JMenu("tamaño de la ventana");
		menu1.add(menu2);
		
		menu3 = new JMenu("color de fondo");
		menu1.add(menu3);
		
		menuitem1 = new JMenuItem("300*200");
		menu2.add(menuitem1);
		menuitem1.addActionListener(this);
		
		menuitem2 = new JMenuItem("640*480");
		menu2.add(menuitem2);
		menuitem2.addActionListener(this);
		
		menuitem3 = new JMenuItem("rojo");
		menu3.add(menuitem3);
		menuitem3.addActionListener(this);
		
		menuitem4 = new JMenuItem("verde");
		menu3.add(menuitem4);
		menuitem4.addActionListener(this);
	}
	
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()== menuitem1) {
				setSize(300,200);
			}
			if(e.getSource()==menuitem2) {
				setSize(640,480);
			}
			if(e.getSource()==menuitem3) {
				getContentPane().setBackground(new Color(255,0,0));
			}
			if(e.getSource()==menuitem4) {
				getContentPane().setBackground(new Color(0,255,0));
			}
		}

	public static void main(String[] args) {
		Formulario11 formulario1 = new Formulario11();
		formulario1.setBounds(0,0,400,300);
		formulario1.setVisible(true);
		formulario1.setLocationRelativeTo(null);

	}

}
