package implementacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import clases.LineaTelefonica;

public class Telefonia {
	private JFrame ventana;
	private final int ANCHO_VENTANA= 414;//Constante para el ancho de la ventana
	private final int ALTO_VENTANA = 393;//Constante para el alto de la ventana
	private JTextField txtNombre;
	private JTextField txtIdentidad;
	private JTextField txtTelefono;
	private JTextField txtMarca;
	private JLabel lblNombre;
	private JLabel lblIdentidad;
	private JLabel lblTelefono;
	private JLabel lblOperador;
	private JLabel lblMarca;
	private JLabel lblTecnologia;
	private ButtonGroup grupoOperadoras;
	private JRadioButton rbtTigo;
	private JRadioButton rbtClaro;
	private JRadioButton rbtHondutel;
	private JCheckBox chk2G;
	private JCheckBox chk3G;
	private JCheckBox chk4G;
	private JScrollPane scrollPaneInformacion;
	private JTextArea txtInformacion;
	private JButton btnGuardar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnLimpiar;
	
	private String strPatronIdentidad = "[0-9]{4}-[0-9]{4}-[0-9]{5}";
	private String strPatronTelefono = "[0-9]{4}-[0-9]{4}";
	
	private ArrayList<LineaTelefonica> lineasTelefonicas;
	
	public Telefonia(){
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
		ventana.setTitle("Telefonia Movil"); //Establecer el titulo
		ventana.setLayout(null); //Importante, si se omite esta linea no se podra utilizar la metodologia de coordenadas
	}
	public void inicializarObjetos(){
		lineasTelefonicas = new ArrayList<LineaTelefonica>();
		
		lblNombre = new JLabel("Nombre:");
		lblIdentidad = new JLabel("Identidad:");
		lblTelefono = new JLabel("Telefono:");
		lblOperador = new JLabel("Operador:");
		lblMarca = new JLabel("Marca:");
		lblTecnologia = new JLabel("Tecnologia:");
		
		txtNombre = new JTextField();
		txtIdentidad = new JTextField();
		txtTelefono = new JTextField();
		txtMarca = new JTextField();
		
		grupoOperadoras = new ButtonGroup();
		rbtTigo = new JRadioButton("Tigo");
		rbtClaro = new JRadioButton("Claro");
		rbtHondutel = new JRadioButton("Hondutel");
		grupoOperadoras.add(rbtTigo);
		grupoOperadoras.add(rbtClaro);
		grupoOperadoras.add(rbtHondutel);
		
		chk3G = new JCheckBox("3G");
		chk2G = new JCheckBox("2G");
		chk4G = new JCheckBox("4G");
		
		btnGuardar = new JButton("Guardar");
		btnModificar = new JButton("Modificar");
		btnEliminar = new JButton("Eliminar");
		btnLimpiar = new JButton("Limpiar");
		
		scrollPaneInformacion = new JScrollPane();
		txtInformacion = new JTextArea();
	}
	
	public void ubicarComponentes(){
		lblNombre.setBounds(10, 24, 72, 14);
		lblIdentidad.setBounds(10, 49, 72, 14);
		lblTelefono.setBounds(10, 74, 72, 14);
		lblOperador.setBounds(10, 99, 72, 14);
		lblMarca.setBounds(10, 124, 72, 14);
		lblTecnologia.setBounds(10, 149, 72, 14);
		txtNombre.setBounds(92, 21, 154, 20);
		txtIdentidad.setBounds(92, 46, 121, 20);
		txtTelefono.setBounds(92, 71, 121, 20);
		rbtTigo.setBounds(89, 95, 63, 23);
		rbtClaro.setBounds(150, 95, 63, 23);
		rbtHondutel.setBounds(215, 95, 77, 23);
		chk3G.setBounds(135, 145, 45, 23);
		chk2G.setBounds(88, 145, 45, 23);
		chk4G.setBounds(182, 145, 45, 23);
		txtMarca.setBounds(92, 121, 119, 20);
		btnGuardar.setBounds(301, 20, 88, 23);
		btnModificar.setBounds(301, 45, 88, 23);
		btnEliminar.setBounds(300, 70, 89, 23);
		btnLimpiar.setBounds(300, 95, 89, 23);
		
		scrollPaneInformacion.setBounds(10, 174, 379, 170);
	}
	
	public void definirPropiedades(){
		lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIdentidad.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelefono.setHorizontalAlignment(SwingConstants.RIGHT);
		lblOperador.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMarca.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTecnologia.setHorizontalAlignment(SwingConstants.RIGHT);
		
		txtInformacion.setEditable(false);
	}
	
	public void agregarComponentes(){
		ventana.add(lblNombre);
		ventana.add(lblIdentidad);
		ventana.add(lblTelefono);
		ventana.add(lblOperador);
		ventana.add(lblMarca);
		ventana.add(lblTecnologia);
		
		ventana.add(txtNombre);
		ventana.add(txtIdentidad);
		ventana.add(txtTelefono);
		ventana.add(txtMarca);
		
		ventana.add(rbtTigo);
		ventana.add(rbtClaro);
		ventana.add(rbtHondutel);
		
		ventana.add(chk3G);
		ventana.add(chk2G);
		ventana.add(chk4G);
		
		ventana.add(btnGuardar);
		ventana.add(btnModificar);
		ventana.add(btnEliminar);
		ventana.add(btnLimpiar);
		
		scrollPaneInformacion.setViewportView(txtInformacion);
		ventana.add(scrollPaneInformacion);		
	}
	
	public void definirEventos(){
		btnGuardar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				agregarRegistro();
			}
		});
		btnModificar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				modificarRegistro();
			}
		});
		btnEliminar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				eliminarRegistro();
			}
		});
		btnLimpiar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				limpiarComponentes();
			}
		});
	}
	
	public void agregarRegistro(){
		String errores = validarCampos();
		if (!errores.equals("")){
			JOptionPane.showMessageDialog(null, errores);
			return;
		}
			
		String operador="";
		if (rbtTigo.isSelected())
			operador = "Tigo";
		else if (rbtClaro.isSelected())
			operador = "Claro";
		else if (rbtHondutel.isSelected())
			operador = "Hondutel";
		
		ArrayList<String> tecnologias = new ArrayList<String>();
		if (chk2G.isSelected())
			tecnologias.add("2G");
		if (chk3G.isSelected())
			tecnologias.add("3G");
		if (chk4G.isSelected())
			tecnologias.add("4G");
		
		lineasTelefonicas.add(new LineaTelefonica(
					txtNombre.getText(),
					txtIdentidad.getText(),
					txtTelefono.getText(),
					operador,
					txtMarca.getText(),
					tecnologias
				));
		mostrarInformacion();
	}
	
	public void modificarRegistro(){
		int indice = Integer.valueOf(
				JOptionPane.showInputDialog("Que indice desea modificar?(0 - "+
					(lineasTelefonicas.size()-1)+")"));
		
		String operador="";
		if (rbtTigo.isSelected())
			operador = "Tigo";
		else if (rbtClaro.isSelected())
			operador = "Claro";
		else if (rbtHondutel.isSelected())
			operador = "Hondutel";
		
		ArrayList<String> tecnologias = new ArrayList<String>();
		if (chk2G.isSelected())
			tecnologias.add("2G");
		if (chk3G.isSelected())
			tecnologias.add("3G");
		if (chk4G.isSelected())
			tecnologias.add("4G");
		
		lineasTelefonicas.set(indice,new LineaTelefonica(
					txtNombre.getText(),
					txtIdentidad.getText(),
					txtTelefono.getText(),
					operador,
					txtMarca.getText(),
					tecnologias
				));
		mostrarInformacion();
	}
	
	public void eliminarRegistro(){
		int indice = Integer.valueOf(
				JOptionPane.showInputDialog("Que indice desea eliminar?(0 - "+
					(lineasTelefonicas.size()-1)+")"));
		lineasTelefonicas.remove(indice);
		mostrarInformacion();
	}
	
	public void limpiarComponentes(){
		txtNombre.setText("");//Se puede utilizar null tambien
		txtIdentidad.setText("");
		txtTelefono.setText("");
		txtMarca.setText("");
		grupoOperadoras.clearSelection();
		/*rbtTigo.setSelected(false);
		rbtClaro.setSelected(false);
		rbtHondutel.setSelected(false);*/
		chk2G.setSelected(false);
		chk3G.setSelected(false);
		chk4G.setSelected(false);
	}
	
	public void mostrarInformacion(){
		txtInformacion.setText("Nombre\tIdentidad\tTelefono\tOperador\tMarca\tTecnologias");
		for (int i=0;i<lineasTelefonicas.size();i++)
			txtInformacion.append("\n"+lineasTelefonicas.get(i).toString());
	}
	
	public String validarCampos(){
		String errores="";
		
		//Validacion de campos vacios
		if(txtNombre.getText().isEmpty())
			errores+="El campo Nombre esta vacio.\n";
		if(txtIdentidad.getText().isEmpty())
			errores+="El campo Identidad esta vacio.\n";
		if(txtTelefono.getText().isEmpty())
			errores+="El campo Telefono esta vacio.\n";
		if(txtMarca.getText().isEmpty())
			errores+="El campo Marca esta vacio.\n";
		if(grupoOperadoras.getSelection()==null)
			errores+="Debe seleccionar un operador.\n";
		/*if(!(rbtTigo.isSelected() || 
			rbtClaro.isSelected() ||
			rbtHondutel.isSelected()))
			errores+="Debe seleccionar un operador.\n";*/
		if(!(chk2G.isSelected() || 
			chk3G.isSelected() ||
			chk4G.isSelected()))
			errores+="Debe seleccionar al menos una tecnologia.\n";
		
		//Validaciones espeaciales
		/*if(txtTelefono.getText().length()!=8)
			errores+="El telefono debe ser de 8 digitos.\n";
		
		try{
			Integer.valueOf(txtTelefono.getText());
		}catch(NumberFormatException excepcion){
			errores+="El telefono debe ser un campo numerico.\n";
			//excepcion.printStackTrace();
		}*/
		
		//Validacion de identidad con expresiones regulares
		if(!validarCadena(strPatronIdentidad, txtIdentidad.getText()))
			errores+="La identidad debe tener el formato 9999-9999-99999.\n";
		
		
		if(!validarCadena(strPatronTelefono, txtTelefono.getText()))
			errores+="El telefono debe tener el formato 9999-9999.\n";
		
		return errores;
	}
	
	public boolean validarCadena(String patron, String cadena){
		Pattern pattern = Pattern.compile(patron);
		Matcher	matcher = pattern.matcher(cadena);
		return matcher.matches();
	}
	
	public static void main(String[] args) {
		new Telefonia();
	}

}