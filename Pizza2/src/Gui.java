import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;

public class Gui extends JFrame
{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnBestellen;
	private JButton btnEntfernen;
	private JButton btnHinzufuegen;
	private JList listWarenkorb;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblPreisPizza;
	private JLabel lblPreisGesamt;
	private JLabel lblNewLabel_4;
	private JComboBox comboBoxPizza;
	private JComboBox comboBoxExtras;
	private JComboBox comboBoxGroesse;
	private Controller controller;

	/**
	 * Create the frame.
	 */
	public Gui(Controller controller)
	{
		initialize();
		this.controller = controller;
	}

	private void initialize()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 669, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnBestellen());
		contentPane.add(getBtnEntfernen());
		contentPane.add(getBtnHinzufuegen());
		contentPane.add(getListWarenkorb());
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getLblPreisPizza());
		contentPane.add(getLblPreisGesamt());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getComboBoxPizza());
		contentPane.add(getComboBoxExtras());
		contentPane.add(getComboBoxGroesse());
		setVisible(true);
	}

	private JButton getBtnBestellen()
	{
		if (btnBestellen == null) {
			btnBestellen = new JButton("Bestellen");
			btnBestellen.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnBestellen.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					controller.bestellen();
				}
			});
			btnBestellen.setBounds(520, 349, 107, 102);
		}
		return btnBestellen;
	}

	private JButton getBtnEntfernen()
	{
		if (btnEntfernen == null) {
			btnEntfernen = new JButton("Entfernen");
			btnEntfernen.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					controller.entfernen(getListWarenkorb().getSelectedValue());
				}
			});
			btnEntfernen.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnEntfernen.setBounds(520, 244, 107, 35);
		}
		return btnEntfernen;
	}

	private JButton getBtnHinzufuegen()
	{
		if (btnHinzufuegen == null) {
			btnHinzufuegen = new JButton("Hinzufügen");
			btnHinzufuegen.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					controller.hinzufuegen((Pizza)getComboBoxPizza().getSelectedItem(), (Groesse)getComboBoxGroesse().getSelectedItem(), (Extras)getComboBoxExtras().getSelectedItem());
				}
			});
			btnHinzufuegen.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnHinzufuegen.setBounds(520, 128, 107, 35);
		}
		return btnHinzufuegen;
	}

	protected JList getListWarenkorb()
	{
		if (listWarenkorb == null) {
			listWarenkorb = new JList();
			listWarenkorb.setFont(new Font("Tahoma", Font.PLAIN, 14));
			listWarenkorb.setBounds(36, 128, 474, 323);
		}
		return listWarenkorb;
	}

	private JLabel getLblNewLabel()
	{
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Pizza:");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel.setBounds(36, 39, 46, 14);
		}
		return lblNewLabel;
	}

	private JLabel getLblNewLabel_1()
	{
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Extras:");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_1.setBounds(36, 103, 46, 14);
		}
		return lblNewLabel_1;
	}

	private JLabel getLblNewLabel_2()
	{
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Größe:");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_2.setBounds(324, 39, 46, 14);
		}
		return lblNewLabel_2;
	}

	private JLabel getLblNewLabel_3()
	{
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Preis:");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_3.setBounds(324, 103, 46, 14);
		}
		return lblNewLabel_3;
	}

	protected JLabel getLblPreisPizza()
	{
		if (lblPreisPizza == null) {
			lblPreisPizza = new JLabel("0,00 €");
			lblPreisPizza.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblPreisPizza.setBounds(400, 103, 46, 14);
		}
		return lblPreisPizza;
	}

	protected JLabel getLblPreisGesamt()
	{
		if (lblPreisGesamt == null) {
			lblPreisGesamt = new JLabel("0,00 €");
			lblPreisGesamt.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblPreisGesamt.setHorizontalAlignment(SwingConstants.RIGHT);
			lblPreisGesamt.setBounds(400, 462, 110, 14);
		}
		return lblPreisGesamt;
	}

	private JLabel getLblNewLabel_4()
	{
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("Gesamtpreis:");
			lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_4.setBounds(36, 462, 220, 14);
		}
		return lblNewLabel_4;
	}

	protected JComboBox getComboBoxPizza()
	{
		if (comboBoxPizza == null) {
			comboBoxPizza = new JComboBox();
			comboBoxPizza.addItemListener(new ItemListener()
			{
				public void itemStateChanged(ItemEvent e)
				{
					controller.preisBerechnen();
					controller.updateGroesse((Pizza)getComboBoxPizza().getSelectedItem());
					controller.updateExtras((Pizza)getComboBoxPizza().getSelectedItem());
				}
			});
			comboBoxPizza.setFont(new Font("Tahoma", Font.PLAIN, 14));
			comboBoxPizza.setBounds(91, 35, 165, 22);
		}
		return comboBoxPizza;
	}

	protected JComboBox getComboBoxExtras()
	{
		if (comboBoxExtras == null) {
			comboBoxExtras = new JComboBox();
			comboBoxExtras.setFont(new Font("Tahoma", Font.PLAIN, 14));
			comboBoxExtras.setBounds(92, 99, 165, 22);
		}
		return comboBoxExtras;
	}

	protected JComboBox getComboBoxGroesse()
	{
		if (comboBoxGroesse == null) {
			comboBoxGroesse = new JComboBox();
			comboBoxGroesse.setFont(new Font("Tahoma", Font.PLAIN, 14));
			comboBoxGroesse.setBounds(380, 35, 165, 22);
		}
		return comboBoxGroesse;
	}
}
