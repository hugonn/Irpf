package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class JanelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfCPF;
	private JTextField tfIdade;
	private JTextField tfPrev;
	private JTextField tfRendimentos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipal frame = new JanelaPrincipal();
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
	public JanelaPrincipal() {
		setTitle("IRPF 2018 ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblQualOTipo = new JLabel("Declara\u00E7\u00E3o:");
		lblQualOTipo.setBounds(56, 32, 82, 14);
		contentPane.add(lblQualOTipo);
		
		JComboBox cmbDec = new JComboBox();
		
		cmbDec.setBounds(148, 29, 181, 20);
		cmbDec.addItem("Declaração Simplificada");
		cmbDec.addItem("Declaração Completa");
		contentPane.add(cmbDec);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(86, 70, 52, 14);
		contentPane.add(lblNome);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(98, 107, 33, 14);
		contentPane.add(lblCpf);
		
		tfNome = new JTextField();
		tfNome.setBounds(149, 67, 151, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		tfCPF = new JTextField();
		tfCPF.setColumns(10);
		tfCPF.setBounds(149, 104, 151, 20);
		contentPane.add(tfCPF);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setVisible(false);
		lblIdade.setBounds(92, 218, 46, 14);
		contentPane.add(lblIdade);
		
		tfIdade = new JTextField();
		tfIdade.setVisible(false);
		tfIdade.setColumns(10);
		tfIdade.setBounds(149, 215, 151, 20);
		contentPane.add(tfIdade);
		
		JLabel lblNmeroDependentes = new JLabel("N\u00FAmero Dependentes:");
		lblNmeroDependentes.setVisible(false);
		lblNmeroDependentes.setBounds(10, 254, 126, 14);
		contentPane.add(lblNmeroDependentes);
		
		JComboBox cmbNumDep = new JComboBox();
		cmbNumDep.setVisible(false);
		cmbNumDep.setBounds(148, 251, 46, 20);
		cmbNumDep.addItem(0);
		cmbNumDep.addItem(1);
		cmbNumDep.addItem(2);
		cmbNumDep.addItem(3);
		cmbNumDep.addItem(4);
		cmbNumDep.addItem(5);
		cmbNumDep.addItem(6);
		cmbNumDep.addItem(7);
		cmbNumDep.addItem(8);
		cmbNumDep.addItem(9);
		cmbNumDep.addItem(10);
		
		contentPane.add(cmbNumDep);
		
		JLabel lblContribuioPrevidnciaSocial = new JLabel("Cont. Previd\u00EAncia: ");
		lblContribuioPrevidnciaSocial.setBounds(22, 145, 115, 14);
		contentPane.add(lblContribuioPrevidnciaSocial);
		
		tfPrev = new JTextField();
		tfPrev.setColumns(10);
		tfPrev.setBounds(149, 142, 151, 20);
		contentPane.add(tfPrev);
		
		JLabel lblTotalRendimentos = new JLabel("Total Rendimentos:");
		lblTotalRendimentos.setBounds(22, 181, 116, 14);
		contentPane.add(lblTotalRendimentos);
		
		tfRendimentos = new JTextField();
		tfRendimentos.setBounds(148, 178, 152, 20);
		contentPane.add(tfRendimentos);
		tfRendimentos.setColumns(10);
		
		JButton btnDeclarar = new JButton("Declarar");
		btnDeclarar.setBounds(317, 220, 89, 23);
		contentPane.add(btnDeclarar);
		  
		cmbDec.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(arg0.getItem().equals("Declaração Completa")) {
					lblIdade.setVisible(true);
					tfIdade.setVisible(true);
					lblNmeroDependentes.setVisible(true);
					cmbNumDep.setVisible(true);
					setBounds(100, 100, 450, 361);
					btnDeclarar.setBounds(317, 275, 89, 23);
				}else {
					setBounds(100, 100, 450, 301);
					btnDeclarar.setBounds(317, 220, 89, 23);
					lblIdade.setVisible(false);
					tfIdade.setVisible(false);
					lblNmeroDependentes.setVisible(false);
					cmbNumDep.setVisible(false);
				}
			}
		});
		
		
		

	}
}
