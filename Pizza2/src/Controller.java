import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

public class Controller
{
//Hallo wie geht es dir?
	
	private ArrayList<Pizza> pizzaListe = new ArrayList<Pizza>();
	private DefaultComboBoxModel<Pizza> dcbmPizza = new DefaultComboBoxModel<Pizza>();
	private ArrayList<Extras> ExtrasListe = new ArrayList<Extras>();
	private DefaultComboBoxModel<Extras> dcbmExtras = new DefaultComboBoxModel<Extras>();
	private ArrayList<Groesse> groesseListe = new ArrayList<Groesse>();
	private DefaultComboBoxModel<Groesse> dcbmGroesse = new DefaultComboBoxModel<Groesse>();
	private DefaultListModel<Warenkorb> warenkorb = new DefaultListModel<>();
	private ArrayList<Warenkorb> warenkorbListe = new ArrayList<>();

	private Gui gui;

	public Controller()
	{
		this.gui = new Gui(this);
		pizzaErstellen();
		fuelleListen();
		setModels();
	}

	public void setModels()
	{
		gui.getComboBoxPizza().setModel(dcbmPizza);
		gui.getComboBoxExtras().setModel(dcbmExtras);
		gui.getComboBoxGroesse().setModel(dcbmGroesse);
		gui.getListWarenkorb().setModel(warenkorb);
	}

	public void pizzaErstellen()
	{
		ArrayList<Groesse> temp = new ArrayList<Groesse>();
		temp.add(new Groesse("klein", 7.50));
		temp.add(new Groesse("mittel", 8.50));
		temp.add(new Groesse("groß", 10.50));

		ArrayList<Extras> temp2 = new ArrayList<Extras>();
		temp2.add(new Extras("Käse", 1.50));
		temp2.add(new Extras("Paprika", 0.50));
		temp2.add(new Extras("Schinken", 2.50));

		Pizza salami = new Pizza("Salami", 5.99, temp, temp2);

		temp = new ArrayList<Groesse>();
		temp.add(new Groesse("mittel", 7.50));
		temp.add(new Groesse("Familie", 8.50));
		temp.add(new Groesse("Party", 10.50));

		temp2 = new ArrayList<Extras>();
		temp2.add(new Extras("Käse", 1.50));
		temp2.add(new Extras("Knoblauch", 4.50));
		temp2.add(new Extras("Tunfisch", 5.50));

		Pizza hawai = new Pizza("Hawai", 7.99, temp, temp2);

		pizzaListe.add(salami);
		pizzaListe.add(hawai);
	}

	public void fuelleListen()
	{
		for (Pizza pizza : pizzaListe) {
			dcbmPizza.addElement(pizza);
		}
	}

	public void updateGroesse(Pizza pizza)
	{
		dcbmGroesse.removeAllElements();
		for (Groesse groesse : pizza.getGroesse()) {
			dcbmGroesse.addElement(groesse);
		}
	}

	public void updateExtras(Pizza pizza)
	{
		dcbmExtras.removeAllElements();
		for (Extras extras : pizza.getExtras()) {
			dcbmExtras.addElement(extras);
		}
	}

	public void hinzufuegen(Pizza pizza, Groesse groesse, Extras extras)
	{
		Warenkorb temp = new Warenkorb(pizza, groesse, extras);
		warenkorbListe.add(temp);
		warenkorb.addElement(temp);
	}

	public void entfernen(Object o)
	{
		warenkorbListe.remove(o);
		warenkorb.removeElement(o);
	}

	public void preisBerechnen()
	{
		gui.getLblPreisPizza().setText(((Pizza) gui.getComboBoxPizza().getSelectedItem()).getPreis() + " €");
	}
	
	public void gesamtPreisBerechnen()
	{
		//TODOberechnung!!!!!
	}
}
