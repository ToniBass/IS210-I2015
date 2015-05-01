package ejemplo;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class EjemploJFileChooser extends JFrame {

	private JPanel contentPane;
	private JTextField txtRutaArchivo;
	private JTextArea txtContenido;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EjemploJFileChooser frame = new EjemploJFileChooser();
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
	public EjemploJFileChooser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAbrir = new JButton("Abrir");
		btnAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				abrirArchivo();
			}
		});
		btnAbrir.setBounds(335, 11, 89, 23);
		contentPane.add(btnAbrir);
		
		txtRutaArchivo = new JTextField();
		txtRutaArchivo.setBounds(10, 12, 315, 20);
		contentPane.add(txtRutaArchivo);
		txtRutaArchivo.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 43, 414, 208);
		contentPane.add(scrollPane);
		
		txtContenido = new JTextArea();
		scrollPane.setViewportView(txtContenido);
	}
	
	public void abrirArchivo(){
		JFileChooser dialogo = new JFileChooser();
		int resultado = dialogo.showOpenDialog(this);
		if(resultado == JFileChooser.APPROVE_OPTION){
			File archivo = dialogo.getSelectedFile();
			txtRutaArchivo.setText(archivo.getAbsolutePath());
			try {
				BufferedReader bufferedReader = new BufferedReader(
						new FileReader(archivo));
				String linea;
				txtContenido.setText(null);
				while((linea = bufferedReader.readLine())!=null){
					txtContenido.append(linea+"\n");
				}
				
				bufferedReader.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
