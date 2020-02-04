import javax.swing.*;
import javax.swing.event.*;


public class Formulario12 extends JFrame implements ChangeListener{
	
	private JCheckBox check1, check2, check3;
	
	public Formulario12() {
		setLayout(null);
		check1 = new JCheckBox("ingles");
		check1.setBounds(10,10,150,30);
		check1.addChangeListener(this);
		add(check1);
		
		check2 = new JCheckBox("frances");
		check2.setBounds(10,50,150,30);
		check1.addChangeListener(this);
		add(check2);
		
		check3 = new JCheckBox("aleman");
		check3.setBounds(10,90,150,30);
		check3.addChangeListener(this);
		add(check3);
		
	}
	
	public void stateChanged(ChangeEvent e) {
		String cad="";
		
		if(check1.isSelected()==true) {
			cad = cad + "ingles-";
		}
		if(check2.isSelected()==true) {
			cad = cad + "frances-";
		}
		if(check3.isSelected()==true) {
			cad = cad + "aleman-";
		}
		setTitle(cad);
	}
	
	public static void main(String[] args) {
		Formulario12 formulario1 = new Formulario12();
		formulario1.setBounds(0,0,350,200);
		formulario1.setVisible(true);
		formulario1.setLocationRelativeTo(null);

	}

}
