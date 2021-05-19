package TP5_Package;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelAgregarPelicula extends JPanel {
	
	private JTextField txtNombrePelicula;
	JComboBox<Categoria> comboBoxCategoria;
	JButton btnAceptar;
	private DefaultListModel<Peliculas> listModel;
	/**
	 * Create the panel.
	 */
	public PanelAgregarPelicula() {
		setLayout(null);
		
		JLabel lblID = new JLabel("ID");
		lblID.setBounds(72, 51, 46, 14);
		add(lblID);
		
		JLabel lblIdPelicula = new JLabel(Integer.toString(Peliculas.ProximoId()));
		lblIdPelicula.setBounds(161, 51, 122, 14);
		add(lblIdPelicula);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(72, 100, 46, 14);
		add(lblNombre);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setBounds(72, 146, 46, 14);
		add(lblGenero);
		
		txtNombrePelicula = new JTextField();
		txtNombrePelicula.setBounds(161, 97, 122, 20);
		add(txtNombrePelicula);
		txtNombrePelicula.setColumns(10);
		
		comboBoxCategoria = new JComboBox<Categoria>();
		comboBoxCategoria.setBounds(161, 142, 122, 22);
		add(comboBoxCategoria);
		
		comboBoxCategoria.addItem(new Categoria(1,"Seleccione un genero"));
		comboBoxCategoria.addItem(new Categoria(2,"Terror"));
		comboBoxCategoria.addItem(new Categoria(3,"Accion"));
		comboBoxCategoria.addItem(new Categoria(4,"Suspenso"));
		comboBoxCategoria.addItem(new Categoria(5,"Romantica"));
		
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!txtNombrePelicula.getText().isEmpty() && (((Categoria)comboBoxCategoria.getSelectedItem()).getId() != 1))
				{
					
					Peliculas peli = new Peliculas(txtNombrePelicula.getText(),(Categoria)comboBoxCategoria.getSelectedItem());
					//peli.setNombre(txtNombrePelicula.getText());
					//peli.categoria((Categoria)comboBoxCategoria.getSelectedItem());
					listModel.addElement(peli);	
					txtNombrePelicula.setText("");
					//Esto Sacalo solo esta para probar si lo que ingresa esta bien 
					JOptionPane.showMessageDialog(null,listModel.toString());
				}
				else{JOptionPane.showMessageDialog(null,"Los datos ingresados no son validos");}
			}
		});
		btnAceptar.setBounds(72, 201, 105, 23);
		add(btnAceptar);

	}

	public void setDefaultListModel(DefaultListModel<Peliculas> listModel) {
		this.listModel = listModel;
		
	}
}
