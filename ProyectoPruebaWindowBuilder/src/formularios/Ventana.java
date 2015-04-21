package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtEdad;
	private JLabel lblCantidadRegistros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Ventana frame = new Ventana();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public Ventana() {
		setTitle("Ventana");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombre.setBounds(10, 8, 58, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setHorizontalAlignment(SwingConstants.RIGHT);
		lblApellido.setBounds(10, 37, 58, 14);
		contentPane.add(lblApellido);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEdad.setBounds(10, 62, 58, 14);
		contentPane.add(lblEdad);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(66, 8, 139, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(66, 37, 139, 20);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		
		txtEdad = new JTextField();
		txtEdad.setBounds(66, 65, 86, 20);
		contentPane.add(txtEdad);
		txtEdad.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				guardar();
			}
		});
		btnGuardar.setBounds(46, 115, 89, 23);
		contentPane.add(btnGuardar);
		
		lblCantidadRegistros = new JLabel("Cantidad registros:");
		lblCantidadRegistros.setBounds(10, 90, 142, 14);
		contentPane.add(lblCantidadRegistros);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 153, 250, 98);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JComboBox comboBox = new JComboBox();
		DefaultComboBoxModel modelo = new DefaultComboBoxModel();
		modelo.addElement("Opcion 1");
		comboBox.setModel(modelo);
		comboBox.setBounds(294, 5, 130, 20);
		contentPane.add(comboBox);
	}
	
	public void guardar(){
		JOptionPane.showMessageDialog(null, txtNombre.getText());
		lblCantidadRegistros.setText("Cantidad registros: 1");
	}

}
