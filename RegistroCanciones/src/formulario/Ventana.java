package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JSlider;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField txtCancion;
	private JTextField txtAlbum;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 699, 512);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JInternalFrame internalFrame = new JInternalFrame("Registrar cancion");
		internalFrame.setBounds(20, 11, 334, 408);
		contentPane.add(internalFrame);
		internalFrame.getContentPane().setLayout(null);
		
		JLabel lblNombreDeLa = new JLabel("Nombre de la canci\u00F3n:");
		lblNombreDeLa.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombreDeLa.setBounds(10, 11, 137, 14);
		internalFrame.getContentPane().add(lblNombreDeLa);
		
		JLabel lblAlbum = new JLabel("Album:");
		lblAlbum.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAlbum.setBounds(10, 36, 137, 14);
		internalFrame.getContentPane().add(lblAlbum);
		
		JLabel lblDuracion = new JLabel("Duracion:");
		lblDuracion.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDuracion.setBounds(10, 61, 137, 14);
		internalFrame.getContentPane().add(lblDuracion);
		
		JLabel lblArtista = new JLabel("Artista:");
		lblArtista.setHorizontalAlignment(SwingConstants.RIGHT);
		lblArtista.setBounds(10, 86, 137, 14);
		internalFrame.getContentPane().add(lblArtista);
		
		JLabel lblVolumenPorDefecto = new JLabel("Volumen por defecto:");
		lblVolumenPorDefecto.setHorizontalAlignment(SwingConstants.RIGHT);
		lblVolumenPorDefecto.setBounds(10, 125, 137, 14);
		internalFrame.getContentPane().add(lblVolumenPorDefecto);
		
		JLabel lblFormato = new JLabel("Formato");
		lblFormato.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFormato.setBounds(10, 153, 137, 14);
		internalFrame.getContentPane().add(lblFormato);
		
		JLabel lblGenero = new JLabel("Genero:");
		lblGenero.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGenero.setBounds(10, 178, 137, 14);
		internalFrame.getContentPane().add(lblGenero);
		
		txtCancion = new JTextField();
		txtCancion.setBounds(157, 11, 137, 20);
		internalFrame.getContentPane().add(txtCancion);
		txtCancion.setColumns(10);
		
		txtAlbum = new JTextField();
		txtAlbum.setBounds(157, 36, 119, 20);
		internalFrame.getContentPane().add(txtAlbum);
		txtAlbum.setColumns(10);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(157, 61, 63, 20);
		internalFrame.getContentPane().add(spinner);
		
		textField = new JTextField();
		textField.setBounds(157, 86, 137, 20);
		internalFrame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JSlider slider = new JSlider();
		slider.setBounds(157, 117, 137, 31);
		internalFrame.getContentPane().add(slider);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(157, 150, 63, 20);
		internalFrame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(157, 175, 137, 20);
		internalFrame.getContentPane().add(comboBox_1);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(10, 203, 78, 23);
		internalFrame.getContentPane().add(btnGuardar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 237, 298, 131);
		internalFrame.getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JInternalFrame internalFrame_1 = new JInternalFrame("Registrar Genero Musical");
		internalFrame_1.setBounds(395, 37, 264, 216);
		contentPane.add(internalFrame_1);
		internalFrame_1.getContentPane().setLayout(null);
		
		JLabel lblGenero_1 = new JLabel("Genero:");
		lblGenero_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGenero_1.setBounds(10, 11, 72, 14);
		internalFrame_1.getContentPane().add(lblGenero_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(89, 8, 114, 20);
		internalFrame_1.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 68, 228, 108);
		internalFrame_1.getContentPane().add(scrollPane_1);
		
		JList list = new JList();
		scrollPane_1.setViewportView(list);
		
		JButton btnGuardar_1 = new JButton("Guardar");
		btnGuardar_1.setBounds(20, 36, 89, 23);
		internalFrame_1.getContentPane().add(btnGuardar_1);
		internalFrame_1.setVisible(true);
		internalFrame.setVisible(true);
	}
}
