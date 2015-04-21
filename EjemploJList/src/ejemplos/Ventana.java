package ejemplos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class Ventana{		
	private final int ANCHO_VENTANA= 500;//Constante para el ancho de la ventana
	private final int ALTO_VENTANA = 350;//Constante para el alto de la ventana
	private JFrame ventana; //Definicion de la ventana
	
	private JList<String> lista;
	private JScrollPane scrollLista;
	
	private JButton btnMostrarResultado;
	private String valores[] = {"opcion 1","opcion 2","opcion 3",
			"opcion 4","opcion 5","opcion 6"};
	
	//En caso de usar valores dinamicos
	private DefaultListModel<String> valoresDinamicos;
	
	public Ventana(){		
		inicializarVentana();
				
		scrollLista = new JScrollPane();
		lista = new JList<String>(valores);
		btnMostrarResultado = new JButton("Mostrar valor");
		
		scrollLista.setBounds(20,20,200,200);
		btnMostrarResultado.setBounds(20,250,200,30);
		
		scrollLista.setViewportView(lista);
		ventana.add(scrollLista);
		ventana.add(btnMostrarResultado);
		
		//Propiedades especiales
		lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		btnMostrarResultado.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//Un unico valor
				JOptionPane.showMessageDialog(null, 
						"Valor seleccionado: " + lista.getSelectedValue());
				Object valoresSeleccionados[] = lista.getSelectedValues();
				
				String strValores="";
				for(int i = 0; i<valoresSeleccionados.length;i++){
					strValores +=valoresSeleccionados[i].toString()+",";
				}
				JOptionPane.showMessageDialog(null, 
						"Valores seleccionados: " + strValores);
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