package implementacion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Formulario {		
	private JFrame ventana;
	private final int ANCHO_VENTANA= 530;//Constante para el ancho de la ventana
	private final int ALTO_VENTANA = 240;//Constante para el alto de la ventana
	private JLabel lblNombre;
	private JLabel lblApellido;
	private JLabel lblEdad;
	private JLabel lblGenero;
	private JLabel lblTituloDatos;
	private JLabel lblResultado;
	private JLabel lblCantidadPersonas;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtEdad;
	private JTextField txtGenero;
	private JButton btnAgregar;
	private JButton btnModificar;
	private JTextArea txtAreaResultado;
	private JScrollPane scroll;
	private int cantidadPersonas = 0;
	
	public Formulario(){
		inicializarVentana();
		inicializarObjetos();
		ubicarComponentes();
		definirPropiedades();
		agregarComponentes();
		definirEventos();
		
		ventana.setVisible(true); //Mostrar ventana
	}
	
	public void inicializarVentana(){
		ventana = new JFrame(); //Instanciacion de la ventana
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Definir que al hacer click en la X el programa finalice
		ventana.setSize(ANCHO_VENTANA, ALTO_VENTANA);//Establecer dimensiones
		ventana.setLocationRelativeTo(null);//Centrar la ventana en la pantalla
		ventana.setTitle("Titulo de la ventana"); //Establecer el titulo
		//ventana.setLayout(null);//Para trabajar con coordenadas
		ventana.setLayout(null); //Importante, si se omite esta linea no se podra utilizar la metodologia de coordenadas
	}
	public void inicializarObjetos(){
		//Instanciar Etiquetas
		lblTituloDatos = new JLabel("Datos Personales");
		lblResultado = new JLabel("Resultado");
		lblNombre = new JLabel("Nombre:");
		lblApellido = new JLabel("Apellido:");
		lblEdad = new JLabel("Edad:");
		lblGenero = new JLabel("Género:");
		lblCantidadPersonas = new JLabel("Cantidad personas: 0");
		//Instanciar Cajas de texto
		txtNombre = new JTextField();
		txtApellido = new JTextField();
		txtEdad = new JTextField();
		txtGenero = new JTextField();
		//Instanciar Botones
		btnAgregar = new JButton("Agregar");
		btnModificar = new JButton("Modificar");
		//Instanciar Text Area
		txtAreaResultado = new JTextArea();
		//Instanciar el scroll para el TextArea
		scroll = new JScrollPane();
	}
	
	public void ubicarComponentes(){
		//Definir coordenadas de las etiquetas
		lblTituloDatos.setBounds(60, 0, 150, 25); //x,y,ancho,alto
		lblResultado.setBounds(320, 0, 150, 25); 
		lblNombre.setBounds(20, 25, 50, 25); 
		lblApellido.setBounds(20, 55, 50, 25);
		lblEdad.setBounds(20, 85, 50, 25);
		lblGenero.setBounds(20, 115, 50, 25);
		lblCantidadPersonas.setBounds(200, 175, 200, 25);
		//Definir coordenadas para las cajas de texto
		txtNombre.setBounds(75, 25, 115, 25); //x,y,ancho,alto
		txtApellido.setBounds(75, 55, 115, 25);
		txtEdad.setBounds(75, 85, 30, 25);
		txtGenero.setBounds(75, 115, 30, 25);
		//Definir coordenadas para los botones
		btnAgregar.setBounds(10, 145, 80, 30);
		btnModificar.setBounds(95, 145, 100, 30);
		
		scroll.setBounds(200,25,300,150);
	}
	
	public void definirPropiedades(){
		//Alinear texto
		lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblApellido.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEdad.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGenero.setHorizontalAlignment(SwingConstants.RIGHT);
		//Parametrizacion de botones
		btnAgregar.setMnemonic(KeyEvent.VK_A);
		btnModificar.setMnemonic(KeyEvent.VK_M);
		
		btnAgregar.setToolTipText("Si da click aqui se agregara un registro");
		btnModificar.setToolTipText("Modificar un registro");
		
		txtAreaResultado.setText("Nombre\tEdad\tGenero");
	}
	
	public void agregarComponentes(){
		scroll.setViewportView(txtAreaResultado);
		//Agregar el ScrollPane en conjunto con el textArea
		ventana.add(scroll);
		
		//Agregar etiquetas
		ventana.add(lblTituloDatos);
		ventana.add(lblNombre);
		ventana.add(lblApellido);
		ventana.add(lblEdad);
		ventana.add(lblGenero);
		ventana.add(lblResultado);
		ventana.add(lblCantidadPersonas);
		//Agregar cajas de texto
		ventana.add(txtNombre);
		ventana.add(txtApellido);
		ventana.add(txtEdad);
		ventana.add(txtGenero);
		//Agregar botones
		ventana.add(btnAgregar);
		ventana.add(btnModificar);
		
	}

	
	public void definirEventos(){
		btnAgregar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				agregarInformacion();
			}
		});	
		btnModificar.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
			
			}
		});
	}
	
	public void agregarInformacion(){
		txtAreaResultado.append("\n"+
					txtNombre.getText()+" "+
					txtApellido.getText()+"\t"+
					txtEdad.getText()+"\t"+
					txtGenero.getText());
		cantidadPersonas++;
		lblCantidadPersonas.setText("Cantidad Personas: "+cantidadPersonas);
	}
	
	public static void main(String[] args){
		new Formulario(); //Crear una instancia del formulario.
	}
}