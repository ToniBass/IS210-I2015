package formularios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JToolBar;
import javax.swing.ImageIcon;

public class VentanaPrincipal extends JFrame {

	private JDesktopPane contentPane;
	private JInternalFrame internalFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		VentanaPrincipal frame = new VentanaPrincipal();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmOpen = new JMenuItem("Open");
		
		mntmOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Opcion Abrir");
				internalFrame.setVisible(true);
			}
		});
		
		mnFile.add(mntmOpen);
		
		JMenuItem mntmGuardar = new JMenuItem("Guardar");
		mnFile.add(mntmGuardar);
		
		JMenu mnMasOpciones = new JMenu("Mas Opciones");
		mnFile.add(mnMasOpciones);
		
		JMenuItem mntmOpcion = new JMenuItem("Opcion 1");
		mnMasOpciones.add(mntmOpcion);
		
		JMenuItem mntmOpcion_1 = new JMenuItem("Opcion 2");
		mnMasOpciones.add(mntmOpcion_1);
		
		JMenu mnAunMasOpciones = new JMenu("Aun mas opciones");
		mnMasOpciones.add(mnAunMasOpciones);
		
		JMenuItem mntmSubOpcion = new JMenuItem("Sub opcion 1");
		mnAunMasOpciones.add(mntmSubOpcion);
		
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		contentPane = new JDesktopPane();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		internalFrame = new JInternalFrame("Formulario Interno");
		internalFrame.setDefaultCloseOperation(JInternalFrame.HIDE_ON_CLOSE);
		internalFrame.setResizable(true);
		internalFrame.setMaximizable(true);
		internalFrame.setIconifiable(true);
		internalFrame.setClosable(true);
		internalFrame.setBounds(35, 59, 234, 153);
		contentPane.add(internalFrame);
		internalFrame.getContentPane().setLayout(null);
		
		JButton btnClickAqui = new JButton("Click aqui");
		btnClickAqui.setBounds(74, 71, 89, 23);
		internalFrame.getContentPane().add(btnClickAqui);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 0, 434, 45);
		contentPane.add(toolBar);
		
		JButton btnAbrir = new JButton("");
		btnAbrir.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/imagenes/open.png")));
		btnAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		toolBar.add(btnAbrir);
		//internalFrame.setVisible(true);
	}

}
