import java.util.ArrayList;

public class Warenkorb
{
	private Pizza pizza;
	private Groesse groesse;
	private Extras extras;

	public Warenkorb(Pizza pizza, Groesse groesse, Extras extras)
	{
		super();
		this.pizza = pizza;
		this.groesse = groesse;
		this.extras = extras;
	}

	public Pizza getPizza()
	{
		return pizza;
	}

	public void setPizza(Pizza pizza)
	{
		this.pizza = pizza;
	}

	public Groesse getGroesse()
	{
		return groesse;
	}

	public void setGroesse(Groesse groesse)
	{
		this.groesse = groesse;
	}

	public Extras getExtras()
	{
		return extras;
	}

	public void setExtras(Extras extras)
	{
		this.extras = extras;
	}

	@Override
	public String toString()
	{
		return "pizza=" + pizza + ", groesse=" + groesse + ", extras=" + extras;
	}

}
