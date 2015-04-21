package ejemplos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ventana{		
	private final int ANCHO_VENTANA= 500;//Constante para el ancho de la ventana
	private final int ALTO_VENTANA = 350;//Constante para el alto de la ventana
	private JFrame ventana; //Definicion de la ventana
	
	private JComboBox<String> listaDesplegable;
	private JButton btnMostrarResultado;
	private JButton btnAgregarValor;
	private DefaultComboBoxModel<String> valores;
	private int n = 4;
	
	public Ventana(){		
		inicializarVentana();
				
		valores = new DefaultComboBoxModel<String>();
		valores.addElement("Opcion 1");
		valores.addElement("Opcion 2");
		valores.addElement("Opcion 3");
		
		listaDesplegable = new JComboBox<String>(valores);
		btnMostrarResultado = new JButton("Mostrar valor");
		btnAgregarValor = new JButton("Agregar valor");
		
		listaDesplegable.setBounds(20,20,200,30);
		btnMostrarResultado.setBounds(20,60,200,30);
		btnAgregarValor.setBounds(20,120,200,30);
		
		ventana.add(listaDesplegable);
		ventana.add(btnMostrarResultado);
		ventana.add(btnAgregarValor);
		
		btnMostrarResultado.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, 
						"Valor seleccionado: " + listaDesplegable.getSelectedItem()+ "\n"+
						"Indice seleccionado: " + listaDesplegable.getSelectedIndex());
			}
		});

		btnAgregarValor.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				valores.addElement("Opcion "+ n);
				n++;
			}
		});
		
		ventana.setVisible(true); //Mostrar ventana
	}
	
	public void inicializarVentana(){
		ventana = new JFrame(); //Instanciacion de la ventana
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Definir que al hacer click en la X el programa finalice
		ventana.setSize(ANCHO_VENTANA, ALTO_VENTANA);//Establecer dimensiones
		//ventana.setBounds(0, 0, 100, 100);
		ventana.setLocationRelativeTo(null);//Centrar la ventana en la pantalla
		//ventana.setAlwaysOnTop(true);
		//ventana.setResizable(false);
		ventana.setTitle("Titulo de la ventana"); //Establecer el titulo
		ventana.setLayout(null);
	}

	public static void main(String[] args){
		new Ventana(); //Crear una instancia del formulario.
	}
}