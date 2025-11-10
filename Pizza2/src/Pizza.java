import java.util.ArrayList;

public class Pizza
{
	private String name;
	private double preis;
	private ArrayList<Groesse> groesse;
	private ArrayList<Extras> extras;

	public Pizza(String name, double preis)
	{
		super();
		this.name = name;
		this.preis = preis;
	}
	
	
	public Pizza(String name, double preis, ArrayList<Groesse> groesse, ArrayList<Extras> extras)
	{
		super();
		this.name = name;
		this.preis = preis;
		this.groesse = groesse;
		this.extras = extras;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public double getPreis()
	{
		return preis;
	}

	public void setPreis(double preis)
	{
		this.preis = preis;
	}
	
	

	public ArrayList<Groesse> getGroesse()
	{
		return groesse;
	}


	public void setGroesse(ArrayList<Groesse> groesse)
	{
		this.groesse = groesse;
	}


	public ArrayList<Extras> getExtras()
	{
		return extras;
	}


	public void setExtras(ArrayList<Extras> extras)
	{
		this.extras = extras;
	}


	@Override
	public String toString()
	{
		return name;
	}
}
