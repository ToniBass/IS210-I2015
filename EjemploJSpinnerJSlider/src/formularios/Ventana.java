package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerListModel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JSpinner spnEdad;
	private JSpinner spnMes;
	private JSlider sldrVolumen;

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
		setBounds(100, 100, 153, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		spnEdad = new JSpinner();
		spnEdad.setModel(new SpinnerNumberModel(1, 1, 150, 1));
		spnEdad.setBounds(31, 11, 62, 26);
		contentPane.add(spnEdad);
		
		spnMes = new JSpinner();
		spnMes.setModel(new SpinnerListModel(new String[] {"Enero", "Febrero", "Marzo", "Abril"}));
		spnMes.setBounds(15, 50, 95, 26);
		contentPane.add(spnMes);
		
		sldrVolumen = new JSlider();
		sldrVolumen.setValue(20);
		sldrVolumen.setPaintLabels(true);
		sldrVolumen.setPaintTicks(true);
		sldrVolumen.setMajorTickSpacing(20);
		sldrVolumen.setOrientation(SwingConstants.VERTICAL);
		sldrVolumen.setBounds(36, 87, 57, 123);
		contentPane.add(sldrVolumen);
		
		JButton btnMostrarValores = new JButton("Mostrar valores");
		btnMostrarValores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, 
						"Edad: " + spnEdad.getValue());
				JOptionPane.showMessageDialog(null, 
						"Mes: " + spnMes.getValue());
				JOptionPane.showMessageDialog(null, 
						"Volumen: " + sldrVolumen.getValue());
			}
		});
		btnMostrarValores.setBounds(10, 228, 117, 23);
		contentPane.add(btnMostrarValores);
	}

}
