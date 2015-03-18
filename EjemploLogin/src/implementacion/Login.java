package implementacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {
	private final int ANCHO_VENTANA= 330;//Constante para el ancho de la ventana
	private final int ALTO_VENTANA = 180;//Constante para el alto de la ventana
	private JFrame ventana; //Definicion de la ventana

	private JLabel lblUsuario;
	private JLabel lblContrasena;
	
	private JTextField txtUsuario;
	private JPasswordField txtContrasena;
	
	private JButton btnIngresar;
	
	public Login(){
		inicializarVentana();
		instanciarComponentes();
		definirPropiedades();
		ubicarComponentes();
		eventos();
		agregarComponentes();
		ventana.setVisible(true); //Mostrar ventana
	}
	
	public void instanciarComponentes(){
		lblUsuario = new JLabel("Usuario:");
		lblContrasena = new JLabel("Constraseña:");
		
		txtUsuario = new JTextField();
		txtContrasena = new JPasswordField();
		
		btnIngresar = new JButton("Ingresar");
	}
	public void definirPropiedades(){}
	
	public void ubicarComponentes(){
		lblUsuario.setBounds(20, 20, 120, 30);//x,y,ancho,alto
		lblContrasena.setBounds(20, 60, 120, 30);
		btnIngresar.setBounds(20,100,100,35);
		txtUsuario.setBounds(100, 20, 200, 30);
		txtContrasena.setBounds(100, 60, 200, 30);
		//.....
	}
	
	public void eventos(){
		btnIngresar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, 
						"Usuario: " + txtUsuario.getText());
			}
		});
	}
	
	public void agregarComponentes(){
		ventana.add(lblUsuario);
		ventana.add(lblContrasena);
		ventana.add(btnIngresar);
		ventana.add(txtUsuario);
		ventana.add(txtContrasena);
	}
	
	public void inicializarVentana(){
		ventana = new JFrame(); //Instanciacion de la ventana
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Definir que al hacer click en la X el programa finalice
		ventana.setSize(ANCHO_VENTANA, ALTO_VENTANA);//Establecer dimensiones
		ventana.setLocationRelativeTo(null);//Centrar la ventana en la pantalla
		ventana.setTitle("Titulo de la ventana"); //Establecer el titulo
		ventana.setLayout(null);//Para trabajar con coordenadas
	}
		
	public static void main(String[] args) {
		new Login();
	}

}
